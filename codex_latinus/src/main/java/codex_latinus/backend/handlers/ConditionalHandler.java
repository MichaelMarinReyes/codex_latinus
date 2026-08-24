package codex_latinus.backend.handlers;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.utils.TypeChecker;

import java.util.ArrayList;
import java.util.List;

public class ConditionalHandler {

    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;
    private final TypeChecker typeChecker;

    public ConditionalHandler(SymbolTable symbolTable, List<CompilationError> semanticErrors, TypeChecker typeChecker) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
        this.typeChecker = typeChecker != null ? typeChecker : new TypeChecker(this.symbolTable, this.semanticErrors);
    }

    /**
     * Valida una sentencia 'si' completa, incluyendo sus bloques 'aliter' condicionales.
     */
    public void handleSi(Codex_latinusParser.Si_sentenciaContext ctx) {
        // 1. Validar la condición principal del 'si'
        if (ctx.condicion() != null) {
            validarCondicion(ctx.condicion(), "si");
        }

        // 2. Validar las condiciones de los bloques intermedios 'aliter (condicion)'
        if (ctx.aliter_bloque() != null) {
            for (Codex_latinusParser.Aliter_bloqueContext aliterCtx : ctx.aliter_bloque()) {
                if (aliterCtx.condicion() != null) {
                    validarCondicion(aliterCtx.condicion(), "aliter");
                }
            }
        }
    }

    /**
     * Evalúa recursivamente una condición lógica y verifica que su resultado final sea estrictamente booleano.
     */
    private void validarCondicion(Codex_latinusParser.CondicionContext condCtx, String estructuraOrigen) {
        int line = condCtx.getStart().getLine();
        int column = condCtx.getStart().getCharPositionInLine();

        String tipoCondicion = obtenerTipoCondicion(condCtx);

        if (!esTipoBooleanoEstricto(tipoCondicion)) {
            semanticErrors.add(new CompilationError(
                    "SEMÁNTICO",
                    "Corrupción de Flujo: La condición en la sentencia '" + estructuraOrigen + "' debe ser estrictamente booleana (verum/falsus), pero se encontró el tipo '" + tipoCondicion + "'.",
                    line, column
            ));
        }
    }

    private String obtenerTipoCondicion(Codex_latinusParser.CondicionContext condCtx) {
        if (condCtx.OR() != null) {
            String tipoIzq = "desconocido";
            if (condCtx.condicion() != null && !condCtx.condicion().isEmpty()) {
                tipoIzq = obtenerTipoCondicion(condCtx.condicion());
            }
            String tipoDer = "desconocido";
            if (condCtx.conjuncion() != null) {
                tipoDer = obtenerTipoConjuncion(condCtx.conjuncion());
            }

            if (esTipoBooleanoEstricto(tipoIzq) && esTipoBooleanoEstricto(tipoDer)) {
                return "verum";
            }
            return "invalido";
        }
        if (condCtx.conjuncion() != null) {
            return obtenerTipoConjuncion(condCtx.conjuncion());
        }
        return "desconocido";
    }

    private String obtenerTipoConjuncion(Codex_latinusParser.ConjuncionContext conjCtx) {
        // Validación profunda para el operador AND
        if (conjCtx.AND() != null) {
            String tipoIzq = "desconocido";
            if (conjCtx.conjuncion() != null) {
                tipoIzq = obtenerTipoConjuncion(conjCtx.conjuncion());
            }
            String tipoDer = "desconocido";
            if (conjCtx.negacion_logica() != null) {
                tipoDer = obtenerTipoNegacion(conjCtx.negacion_logica());
            }

            if (esTipoBooleanoEstricto(tipoIzq) && esTipoBooleanoEstricto(tipoDer)) {
                return "verum";
            }
            return "invalido";
        }
        if (conjCtx.negacion_logica() != null) {
            return obtenerTipoNegacion(conjCtx.negacion_logica());
        }
        return "desconocido";
    }

    private String obtenerTipoNegacion(Codex_latinusParser.Negacion_logicaContext negCtx) {
        if (negCtx.NEGACION() != null) {
            if (negCtx.negacion_logica() != null) {
                String tipoSub = obtenerTipoNegacion(negCtx.negacion_logica());
                if (esTipoBooleanoEstricto(tipoSub)) {
                    return "verum";
                }
            }
            return "invalido";
        }
        if (negCtx.primaria_logica() != null) {
            return obtenerTipoPrimariaLogica(negCtx.primaria_logica());
        }
        return "desconocido";
    }

    private String obtenerTipoPrimariaLogica(Codex_latinusParser.Primaria_logicaContext primCtx) {
        if (primCtx.VERUM() != null || primCtx.FALSUS() != null) {
            return "verum";
        }
        // Si compara expresiones mediante operadores relacionales (ej. x > 10) el resultado es booleano
        if (primCtx.operador_relacional() != null) {
            return "verum";
        }
        if (primCtx.PARENTESIS_IZQ() != null && primCtx.condicion() != null) {
            return obtenerTipoCondicion(primCtx.condicion());
        }
        if (primCtx.VARIABLE() != null) {
            String varName = primCtx.VARIABLE().getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null && sym.getType() != null) {
                return sym.getType().toLowerCase();
            }
            return "desconocido";
        }
        if (primCtx.llamada_funcion() != null) {
            return "verum";
        }
        return "desconocido";
    }

    private boolean esTipoBooleanoEstricto(String tipo) {
        if (tipo == null) return false;
        String t = tipo.toLowerCase();
        return t.equals("boolean") || t.equals("verum") || t.equals("falsus");
    }
}