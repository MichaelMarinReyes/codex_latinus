package codex_latinus.backend.handlers;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.utils.TypeChecker;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Manejador encargado de gestionar la ejecución, profundidad, ámbito y control de saltos
 * dentro de los bucles (dum, facere, per) del lenguaje Codex Latinus.
 */
public class LoopHandler {

    private int loopDepth = 0;
    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;
    private final TypeChecker typeChecker;

    public LoopHandler(SymbolTable symbolTable, List<CompilationError> semanticErrors, TypeChecker typeChecker) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
        this.typeChecker = typeChecker != null ? typeChecker : new TypeChecker(this.symbolTable, this.semanticErrors);
    }

    /**
     * Procesa y valida el ciclo 'dum'.
     */
    public Object handleCicloDum(Codex_latinusParser.Ciclo_dumContext ctx, Function<ParserRuleContext, Object> bodyVisitor) {
        if (ctx.condicion() != null) {
            validarCondicionCiclo(ctx.condicion(), "dum");
        }

        loopDepth++;
        Object res = null;
        symbolTable.enterScope("dum_scope");
        try {
            res = bodyVisitor.apply(ctx);
        } catch (BreakException e) {
        } catch (ContinueException e) {
        } finally {
            symbolTable.exitScope();
            loopDepth--;
        }
        return res;
    }

    /**
     * Procesa y valida el ciclo 'facere'.
     */
    public Object handleCicloFacere(Codex_latinusParser.Ciclo_facereContext ctx, Function<ParserRuleContext, Object> bodyVisitor) {
        if (ctx.condicion() != null) {
            validarCondicionCiclo(ctx.condicion(), "facere");
        }

        loopDepth++;
        Object res = null;
        symbolTable.enterScope("facere_scope");
        try {
            res = bodyVisitor.apply(ctx);
        } catch (BreakException e) {
        } catch (ContinueException e) {
        } finally {
            symbolTable.exitScope();
            loopDepth--;
        }
        return res;
    }

    /**
     * Procesa y valida el ciclo 'per' con iterador.
     */
    public Object handleCicloPer(Codex_latinusParser.Ciclo_perContext ctx, Function<ParserRuleContext, Object> bodyVisitor) {
        loopDepth++;
        Object res = null;

        symbolTable.enterScope("per_scope");
        try {
            if (ctx.inicializacion_per() != null) {
                validarInicializacionPer(ctx.inicializacion_per());
            }

            if (ctx.condiciones_per() != null && ctx.condiciones_per().condicion() != null) {
                validarCondicionCiclo(ctx.condiciones_per().condicion(), "per");
            }

            res = bodyVisitor.apply(ctx);
        } catch (BreakException e) {
        } catch (ContinueException e) {
        } finally {
            symbolTable.exitScope();
            loopDepth--;
        }
        return res;
    }

    /**
     * Valida que la condición del ciclo sea estrictamente booleana para evitar Corrupción de Flujo.
     */
    private void validarCondicionCiclo(Codex_latinusParser.CondicionContext condCtx, String tipoCiclo) {
        int line = condCtx.getStart().getLine();
        int column = condCtx.getStart().getCharPositionInLine();

        boolean esBooleana = evaluarCondicionRecursiva(condCtx);

        if (!esBooleana) {
            semanticErrors.add(new CompilationError(
                    "SEMÁNTICO",
                    "Corrupción de Flujo: La condición del ciclo '" + tipoCiclo + "' debe ser estrictamente booleana (verum/falsus).",
                    line, column
            ));
        }
    }

    /**
     * Recorre la jerarquía de la condición respetando la gramática:
     * condicion -> conjuncion -> negacion_logica -> primaria_logica
     */
    private boolean evaluarCondicionRecursiva(Codex_latinusParser.CondicionContext condCtx) {
        if (condCtx == null) return false;

        if (condCtx.conjuncion() != null) {
            return evaluarConjuncion(condCtx.conjuncion());
        }
        return true;
    }

    private boolean evaluarConjuncion(Codex_latinusParser.ConjuncionContext conjCtx) {
        if (conjCtx == null) return false;

        if (conjCtx.negacion_logica() != null) {
            return evaluarNegacion(conjCtx.negacion_logica());
        }
        return true;
    }

    private boolean evaluarNegacion(Codex_latinusParser.Negacion_logicaContext negCtx) {
        if (negCtx == null) return false;

        if (negCtx.primaria_logica() != null) {
            return evaluarPrimariaLogica(negCtx.primaria_logica());
        }
        return true;
    }

    private boolean evaluarPrimariaLogica(Codex_latinusParser.Primaria_logicaContext primCtx) {
        if (primCtx == null) return false;

        // Si es explícitamente un booleano (verum/falsus)
        if (primCtx.VERUM() != null || primCtx.FALSUS() != null) {
            return true;
        }

        // Si es una comparación relacional (ej. x > 10), el resultado es lógicamente booleano
        if (primCtx.operador_relacional() != null) {
            return true;
        }

        // Si está entre paréntesis recursivos: (condicion)
        if (primCtx.PARENTESIS_IZQ() != null && primCtx.condicion() != null) {
            return evaluarCondicionRecursiva(primCtx.condicion());
        }

        // Si es una variable, revisamos su tipo en la tabla de símbolos
        if (primCtx.VARIABLE() != null) {
            String varName = primCtx.VARIABLE().getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null && sym.getType() != null) {
                String tipo = sym.getType().toLowerCase();
                // Si la variable es numérica o texto, no es booleana -> Corrupción de Flujo
                if (tipo.equals("numerus") || tipo.equals("decimalis") || tipo.equals("textum") || tipo.equals("littera")) {
                    return false;
                }
            }
        }

        return true; // Por defecto se asume válido si no se detecta incompatibilidad evidente
    }

    private void validarInicializacionPer(Codex_latinusParser.Inicializacion_perContext initCtx) {
        if (initCtx.VARIABLE() != null || (initCtx.acceso_miembro() != null)) {
            String varName = initCtx.VARIABLE() != null ? initCtx.VARIABLE().getText() : "variable";
            int line = initCtx.getStart().getLine();
            int col = initCtx.getStart().getCharPositionInLine();

            if (initCtx.tipo_dato() != null) {
                String tipo = initCtx.tipo_dato().getText();
                Symbol sym = new Symbol(varName, tipo, "variable", symbolTable.getCurrentScope(), line, col);
                symbolTable.define(sym);
            }
        }
    }

    /**
     * Valida que las sentencias de salto se utilicen únicamente dentro de un ciclo.
     */
    public Object handleSaltoSentencia(Codex_latinusParser.Salto_sentenciaContext ctx) {
        if (loopDepth <= 0) {
            String palabraClave = ctx.getStart().getText();
            semanticErrors.add(new CompilationError(
                    "SEMÁNTICO",
                    "La instrucción '" + palabraClave + "' solo puede ser utilizada dentro de un ciclo.",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine()
            ));
        } else {
            String textoSalto = ctx.getText().toLowerCase();
            if (textoSalto.contains("interrumpe")) {
                throw new BreakException();
            } else if (textoSalto.contains("perge")) {
                throw new ContinueException();
            }
        }
        return null;
    }

    public int getLoopDepth() {
        return loopDepth;
    }

    public static class BreakException extends RuntimeException {}
    public static class ContinueException extends RuntimeException {}
}