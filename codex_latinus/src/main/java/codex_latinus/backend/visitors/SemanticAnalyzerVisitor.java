package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.handlers.FunctionHandler;
import codex_latinus.backend.handlers.LoopHandler;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Visitante encargado del análisis semántico del lenguaje Codex Latinus.
 * Recorre el árbol de análisis sintáctico (AST) para validar declaraciones,
 * control de tipos, ámbitos (scopes), y poblar la tabla de símbolos.
 */
public class SemanticAnalyzerVisitor extends Codex_latinusBaseVisitor<Object> {

    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;
    private final FunctionHandler functionHandler;
    private final LoopHandler loopHandler;

    /**
     * Constructor para inicializar el analizador semántico.
     *
     * @param symbolTable    Tabla de símbolos compartida o inicial. Si es nula, se crea una nueva.
     * @param semanticErrors Lista para registrar los errores semánticos encontrados. Si es nula, se crea una nueva lista.
     */
    public SemanticAnalyzerVisitor(SymbolTable symbolTable, List<CompilationError> semanticErrors) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
        this.functionHandler = new FunctionHandler(this.symbolTable, this.semanticErrors);
        this.loopHandler = new LoopHandler(this.semanticErrors);
    }

    /**
     * Retorna la tabla de símbolos poblada durante el análisis semántico.
     * Asegura que el entorno de variables y funciones esté disponible para fases posteriores (traducción o interpretación).
     *
     * @return La instancia actual de {@link SymbolTable}.
     */
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    /**
     * Obtiene la lista de errores semánticos acumulados durante el recorrido.
     *
     * @return Una lista de objetos {@link CompilationError}.
     */
    public List<CompilationError> getSemanticErrors() {
        return semanticErrors;
    }

    /**
     * Acumula y concatena los resultados de las visitas a los nodos hijos.
     *
     * @param aggregate    Resultado acumulado actual.
     * @param nextResult   Siguiente resultado a adjuntar.
     * @return             Cadena combinada de resultados.
     */
    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        return aggregate.toString() + " " + nextResult.toString();
    }

    /**
     * Valida la definición de una estructura (struct), verificando nombres duplicados y atributos repetidos.
     *
     * @param ctx Contexto de la definición de la estructura.
     * @return    Resultado de visitar los nodos hijos.
     */
    @Override
    public Object visitStructura_def(Codex_latinusParser.Structura_defContext ctx) {
        String nombreStruct = ctx.VARIABLE().getText();
        int line = ctx.VARIABLE().getSymbol().getLine();
        int column = ctx.VARIABLE().getSymbol().getCharPositionInLine();

        if (symbolTable.isDeclaredInCurrentScope(nombreStruct)) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La estructura '" + nombreStruct + "' ya ha sido declarada.", line, column));
        }

        List<String> nombresAtributos = new ArrayList<>();

        for (Codex_latinusParser.Miembro_structuraContext miembro : ctx.miembro_structura()) {
            if (miembro.VARIABLE() != null && !miembro.VARIABLE().isEmpty()) {
                String nombreAttr = miembro.VARIABLE(0).getText();
                if (nombresAtributos.contains(nombreAttr)) {
                    semanticErrors.add(new CompilationError("SEMÁNTICO", "El atributo '" + nombreAttr + "' está repetido en la estructura '" + nombreStruct + "'.", miembro.getStart().getLine(), miembro.getStart().getCharPositionInLine()));
                } else {
                    nombresAtributos.add(nombreAttr);
                }
            }
        }

        return visitChildren(ctx);
    }

    /**
     * Procesa la declaración de una variable registrándola en la tabla de símbolos.
     *
     * @param ctx Contexto de la declaración de variable.
     * @return    Resultado de visitar los hijos.
     */
    @Override
    public Object visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx) {
        recordDeclarationInTable(ctx);
        return visitChildren(ctx);
    }

    /**
     * Procesa la declaración de arreglos (series) y los registra en la tabla de símbolos.
     *
     * @param ctx Contexto de la declaración del arreglo.
     * @return    Resultado de visitar los hijos.
     */
    @Override
    public Object visitArreglo_declaracion(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        recordArrayDeclarationInTable(ctx);
        return visitChildren(ctx);
    }

    /**
     * Visita funciones con retorno delegando la lógica al manejador correspondiente.
     *
     * @param ctx Contexto de la función con retorno.
     * @return    Resultado devuelto por el {@link FunctionHandler}.
     */
    @Override
    public Object visitRatio_funcion(Codex_latinusParser.Ratio_funcionContext ctx) {
        return functionHandler.handleRatioFuncion(ctx, c -> (String) visitChildren(c));
    }

    /**
     * Visita procedimientos o funciones sin retorno delegando la lógica al manejador correspondiente.
     *
     * @param ctx Contexto de la función sin retorno.
     * @return    Resultado devuelto por el {@link FunctionHandler}.
     */
    @Override
    public Object visitActio_funcion(Codex_latinusParser.Actio_funcionContext ctx) {
        return functionHandler.handleActioFuncion(ctx, c -> (String) visitChildren(c));
    }

    /**
     * Analiza semánticamente las sentencias de asignación, comprobando la existencia de la variable
     * y la compatibilidad de tipos entre el valor asignado y la variable receptora.
     *
     * @param ctx Contexto de la sentencia de asignación.
     * @return    Resultado de visitar los hijos.
     */
    @Override
    public Object visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        String varName = "";
        if (ctx.VARIABLE() != null) {
            varName = ctx.VARIABLE().getText();
        } else if (ctx.acceso_miembro() != null && ctx.acceso_miembro().VARIABLE(0) != null) {
            varName = ctx.acceso_miembro().VARIABLE(0).getText();
        }

        Symbol sym = symbolTable.resolve(varName);
        if (sym == null) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + varName + "' no ha sido declarada.",
                    ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            return visitChildren(ctx);
        }

        if (ctx.expresion() != null) {
            String tipoVariable = sym.getType().toLowerCase();
            String tipoValor = getTipoExpresion(ctx.expresion());

            boolean compatible = symbolTable.getTypeTable().areTypesCompatible(tipoVariable, tipoValor);
            if (!compatible && !"desconocido".equals(tipoValor)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO",
                        "Error de tipo: No se puede asignar '" + tipoValor + "' a una variable de tipo '" + tipoVariable + "'.",
                        ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            } else {
                sym.setValue(ctx.expresion().getText());
            }
        }

        return visitChildren(ctx);
    }

    /**
     * Valida que la variable receptora en una sentencia de lectura exista en el ámbito actual.
     *
     * @param ctx Contexto de la sentencia leer.
     * @return    Resultado de visitar los hijos.
     */
    @Override
    public Object visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        String varName = null;

        if (ctx.VARIABLE() != null) {
            varName = ctx.VARIABLE().getText();
        } else if (ctx.acceso_miembro() != null && ctx.acceso_miembro().VARIABLE(0) != null) {
            varName = ctx.acceso_miembro().VARIABLE(0).getText();
        }

        if (varName != null) {
            Symbol sym = symbolTable.resolve(varName);
            if (sym == null) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + varName + "' no existe para almacenar la lectura.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            }
        }

        return visitChildren(ctx);
    }

    /**
     * Valida ciclos 'dum' (while) mediante el manejador de bucles.
     */
    @Override
    public Object visitCiclo_dum(Codex_latinusParser.Ciclo_dumContext ctx) {
        return loopHandler.handleCicloDum(ctx, c -> (String) visitChildren(c));
    }

    /**
     * Valida ciclos 'facere' (do-while) mediante el manejador de bucles.
     */
    @Override
    public Object visitCiclo_facere(Codex_latinusParser.Ciclo_facereContext ctx) {
        return loopHandler.handleCicloFacere(ctx, c -> (String) visitChildren(c));
    }

    /**
     * Valida ciclos 'per' (for) mediante el manejador de bucles.
     */
    @Override
    public Object visitCiclo_per(Codex_latinusParser.Ciclo_perContext ctx) {
        return loopHandler.handleCicloPer(ctx, c -> (String) visitChildren(ctx));
    }

    /**
     * Valida sentencias de salto (break/continue) usando el manejador de bucles.
     */
    @Override
    public Object visitSalto_sentencia(Codex_latinusParser.Salto_sentenciaContext ctx) {
        return loopHandler.handleSaltoSentencia(ctx, c -> (String) visitChildren(c));
    }

    /**
     * Determina el tipo de dato resultante de evaluar una expresión aritmética o lógica.
     *
     * @param ctx Contexto de la expresión.
     * @return    Una cadena que representa el tipo de dato resultante.
     */
    private String getTipoExpresion(Codex_latinusParser.ExpresionContext ctx) {
        if (ctx.termino() == null || ctx.termino().isEmpty()) {
            return "desconocido";
        }

        String tipoActual = getTipoTermino(ctx.termino(0));

        for (int i = 0; i < ctx.operacion_aritmetica().size(); i++) {
            String op = ctx.operacion_aritmetica(i).getText();
            String tipoSiguiente = getTipoTermino(ctx.termino(i + 1));

            if (tipoActual.equals("textum") || tipoSiguiente.equals("textum")) {
                if (!op.equals("+")) {
                    semanticErrors.add(new CompilationError("SEMÁNTICO",
                            "Error de tipo: El tipo 'textum' solo puede combinarse con operaciones de suma (+) para concatenación.",
                            ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
                    return "textum";
                }
                tipoActual = "textum";
                continue;
            }

            int jerarquia1 = getJerarquia(tipoActual);
            int jerarquia2 = getJerarquia(tipoSiguiente);

            if (jerarquia1 == -1 || jerarquia2 == -1) {
                tipoActual = "desconocido";
                continue;
            }

            int maxJerarquia = Math.max(jerarquia1, jerarquia2);
            tipoActual = getTipoByJerarquia(maxJerarquia);
        }

        return tipoActual;
    }

    /**
     * Obtiene el tipo de dato correspondiente a un término individual (variable, número, cadena, etc.).
     *
     * @param termino Contexto del término.
     * @return        El tipo de dato en minúsculas.
     */
    private String getTipoTermino(Codex_latinusParser.TerminoContext termino) {
        if (termino == null) return "desconocido";

        if (termino.VARIABLE() != null) {
            Symbol s = symbolTable.resolve(termino.VARIABLE().getText());
            return (s != null) ? s.getType().toLowerCase() : "desconocido";
        }
        if (termino.NUMERO_ENTERO() != null) return "numerus";
        if (termino.NUMERO_DECIMAL() != null) return "decimalis";
        if (termino.VERUM() != null || termino.FALSUS() != null) return "boolean";
        if (termino.CADENA_TEXTO() != null) return "textum";
        if (termino.CARACTER() != null) return "littera";

        if (termino.llamada_funcion() != null) {
            String funcName = termino.llamada_funcion().VARIABLE().getText();
            Symbol s = symbolTable.resolve(funcName);
            return (s != null) ? s.getType().toLowerCase() : "desconocido";
        }
        return "numerus";
    }

    /**
     * Define la jerarquía numérica de tipos para conversiones implícitas.
     */
    private int getJerarquia(String tipo) {
        if (tipo == null) return -1;
        switch (tipo.toLowerCase()) {
            case "textum":
                return 5;
            case "decimalis":
                return 4;
            case "numerus":
                return 3;
            case "littera":
                return 2;
            case "boolean":
            case "verum":
            case "falsus":
                return 1;
            default:
                return -1;
        }
    }

    /**
     * Retorna el nombre del tipo basado en su valor de jerarquía.
     */
    private String getTipoByJerarquia(int j) {
        switch (j) {
            case 5: return "textum";
            case 4: return "decimalis";
            case 3: return "numerus";
            case 2: return "littera";
            case 1: return "boolean";
            default: return "desconocido";
        }
    }

    /**
     * Registra una nueva variable en la tabla de símbolos tras verificar duplicados y tipos.
     */
    private void recordDeclarationInTable(Codex_latinusParser.DeclaracionContext ctx) {
        if (ctx.VARIABLE() != null && !ctx.VARIABLE().isEmpty()) {
            String nameVar = ctx.VARIABLE(0).getText();
            String dataType = "desconocido";

            if (ctx.tipo_dato() != null) {
                dataType = ctx.tipo_dato().getText();
            } else if (ctx.TEXTUM() != null) {
                dataType = "textum";
            } else if (ctx.LITTERA() != null) {
                dataType = "littera";
            } else if (ctx.VARIABLE().size() > 1) {
                dataType = ctx.VARIABLE(1).getText();
            } else if (ctx.expresion() != null) {
                dataType = getTipoExpresion(ctx.expresion());
            }

            int line = ctx.VARIABLE(0).getSymbol().getLine();
            int column = ctx.VARIABLE(0).getSymbol().getCharPositionInLine();

            if (symbolTable.isDeclaredInCurrentScope(nameVar)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + nameVar + "' ya ha sido declarada en este ámbito.", line, column));
                return;
            }

            Symbol sym = new Symbol(nameVar, dataType, "variable", symbolTable.getCurrentScope(), line, column);

            if (ctx.expresion() != null) {
                sym.setValue(ctx.expresion().getText());
            }

            if (!symbolTable.define(sym)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El tipo '" + dataType + "' no está registrado.", line, column));
            }
        }
    }

    /**
     * Registra un nuevo arreglo (series) en la tabla de símbolos.
     */
    private void recordArrayDeclarationInTable(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        if (ctx.VARIABLE() != null && !ctx.VARIABLE().isEmpty()) {
            String nameVar = ctx.VARIABLE(0).getText();
            String dataType = ctx.tipo_dato() != null ? ctx.tipo_dato().getText().toLowerCase() : "numerus";

            int size = 0;
            if (ctx.NUMERO_ENTERO() != null) {
                try {
                    size = Integer.parseInt(ctx.NUMERO_ENTERO().getText());
                } catch (NumberFormatException ignored) {
                }
            }

            int line = ctx.VARIABLE(0).getSymbol().getLine();
            int column = ctx.VARIABLE(0).getSymbol().getCharPositionInLine();

            if (symbolTable.isDeclaredInCurrentScope(nameVar)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El series '" + nameVar + "' ya ha sido declarado en este ámbito.", line, column));
                return;
            }

            Symbol sym = new Symbol(nameVar, dataType, "series", 0, new ArrayList<>(), size, symbolTable.getCurrentScope(), line, column);

            if (!symbolTable.define(sym)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El tipo de series '" + dataType + "' no está registrado.", line, column));
            }
        }
    }

    /**
     * Recorre de forma genérica los nodos hijos de un contexto.
     *
     * @param node Contexto padre del árbol.
     * @return     Una cadena con la unión de los resultados de los hijos.
     */
    public Object visitChildren(ParserRuleContext node) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree child = node.getChild(i);
            Object res = visit(child);
            if (res != null && !res.toString().isEmpty()) {
                sb.append(res.toString()).append(" ");
            }
        }
        return sb.toString().trim();
    }
}