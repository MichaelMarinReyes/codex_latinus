package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.handlers.FunctionHandler;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class InterpreterVisitor extends Codex_latinusBaseVisitor<Object> {

    private final SymbolTable symbolTable;
    private final Queue<String> mockInputs;
    private final StringBuilder consoleOutput;
    private final Map<String, ParserRuleContext> functionRegistry = new HashMap<>();
    private final Map<String, List<String>> structBlueprints = new HashMap<>();
    private final FunctionHandler functionHandler;

    public InterpreterVisitor(SymbolTable symbolTable, List<String> predefinedInputs) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.mockInputs = new LinkedList<>(predefinedInputs != null ? predefinedInputs : new ArrayList<>());
        this.consoleOutput = new StringBuilder();
        this.functionHandler = new FunctionHandler(this.symbolTable, new ArrayList<>());
    }

    public String getConsoleOutput() {
        return consoleOutput.toString();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Object visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();

            if (text.equals(">>") || text.equals(";")) {
                continue;
            }

            if (text.startsWith("\"") && text.endsWith("\"")) {
                output.append(text, 1, text.length() - 1);
            } else {
                Symbol sym = symbolTable.resolve(text);
                if (sym != null) {
                    Object val = sym.getValue();
                    output.append(val != null ? val : "");
                } else {
                    Object val = visit(child);
                    if (val != null) {
                        output.append(val);
                    }
                }
            }
            output.append(" ");
        }

        String lineaImpresa = output.toString().trim();
        consoleOutput.append(lineaImpresa).append("\n");
        return null;
    }

    @Override
    public Object visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                String valorSimulado = (mockInputs != null) ? mockInputs.poll() : null;

                if (valorSimulado != null && !valorSimulado.isEmpty()) {
                    Object parsedValue = parseValueByType(valorSimulado, sym.getType());
                    sym.setValue(parsedValue);
                    consoleOutput.append(valorSimulado).append("\n");
                } else {
                    // Si no hay valor simulado, NO sobrescribir la variable.
                }
            }
        }
        return null;
    }

    /**
     * Método auxiliar para parsear el texto de entrada según el tipo de variable esperado.
     */
    private Object parseValueByType(String text, String type) {
        if (type == null) return text;
        type = type.toLowerCase();
        try {
            switch (type) {
                case "numerus":
                    return Integer.parseInt(text.trim());
                case "decimalis":
                    return Double.parseDouble(text.trim());
                case "boolean":
                case "verum":
                case "falsus":
                    return Boolean.parseBoolean(text.trim()) || text.equalsIgnoreCase("verum");
                case "littera":
                    return text.isEmpty() ? '\0' : text.charAt(0);
                case "textum":
                default:
                    return text;
            }
        } catch (NumberFormatException e) {
            return text;
        }
    }

    @Override
    public Object visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        Object evaluatedValue = null;
        if (ctx.expresion() != null) {
            evaluatedValue = visit(ctx.expresion());
        } else if (ctx.condicion() != null) {
            evaluatedValue = visit(ctx.condicion());
        } else if (ctx.arreglo_literal() != null) {
            evaluatedValue = visit(ctx.arreglo_literal());
        }

        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null && evaluatedValue != null) {
                sym.setValue(evaluatedValue);
            } else if (sym == null) {
                throw new RuntimeException("Error en línea " + ctx.getStart().getLine() + ": La variable '" + varName + "' no ha sido declarada.");
            }
        } else if (ctx.acceso_miembro() != null) {
            Codex_latinusParser.Acceso_miembroContext accCtx = ctx.acceso_miembro();
            if (accCtx.VARIABLE(0) != null) {
                String varName = accCtx.VARIABLE(0).getText();
                Symbol sym = symbolTable.resolve(varName);

                if (sym != null && sym.getValue() != null) {
                    Object container = sym.getValue();
                    Object lastKey = null;
                    boolean isLastIndexList = false;

                    for (int i = 1; i < accCtx.getChildCount(); i++) {
                        ParseTree child = accCtx.getChild(i);
                        String text = child.getText();

                        if (text.equals("[")) {
                            ParseTree exprChild = accCtx.getChild(i + 1);
                            Object indexObj = visit(exprChild);
                            int index = parseToInt(indexObj);

                            if (i + 2 >= accCtx.getChildCount() - 1) {
                                lastKey = index;
                                isLastIndexList = true;
                                break;
                            } else {
                                if (container instanceof List) {
                                    container = ((List<?>) container).get(index);
                                }
                            }
                            i += 2;
                        } else if (text.equals(".")) {
                            ParseTree fieldChild = accCtx.getChild(i + 1);
                            if (fieldChild != null) {
                                String fieldName = fieldChild.getText();

                                if (i + 1 >= accCtx.getChildCount() - 1) {
                                    lastKey = fieldName;
                                    isLastIndexList = false;
                                    break;
                                } else {
                                    if (container instanceof Map) {
                                        @SuppressWarnings("unchecked")
                                        Map<String, Object> map = (Map<String, Object>) container;
                                        container = map.get(fieldName);
                                    }
                                }
                            }
                            i += 1;
                        }
                    }

                    if (container != null && lastKey != null) {
                        if (isLastIndexList && container instanceof List) {
                            @SuppressWarnings("unchecked")
                            List<Object> list = (List<Object>) container;
                            int idx = (Integer) lastKey;
                            if (idx >= 0 && idx < list.size()) {
                                list.set(idx, evaluatedValue);
                            } else {
                                throw new RuntimeException("Error en línea " + ctx.getStart().getLine() + ": Índice fuera de límites en arreglo.");
                            }
                        } else if (!isLastIndexList && container instanceof Map) {
                            @SuppressWarnings("unchecked")
                            Map<String, Object> map = (Map<String, Object>) container;
                            map.put((String) lastKey, evaluatedValue);
                        }
                    }
                }
            }
        }

        return super.visitAsignacion_sentencia(ctx);
    }

    @Override
    public Object visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx) {
        if (ctx.VARIABLE() != null && !ctx.VARIABLE().isEmpty()) {
            String varName = ctx.VARIABLE(0).getText();
            Symbol sym = symbolTable.resolve(varName);

            if (sym == null) {
                String tipo = ctx.tipo_dato() != null ? ctx.tipo_dato().getText().toLowerCase() : "desconocido";
                int line = ctx.getStart().getLine();
                int col = ctx.getStart().getCharPositionInLine();

                sym = new Symbol(varName, tipo, "variable", symbolTable.getCurrentScope(), line, col);
                symbolTable.define(sym);
            }

            boolean inicializado = false;

            if (ctx.expresion() != null) {
                Object evaluatedValue = visit(ctx.expresion());
                if (evaluatedValue != null) {
                    sym.setValue(evaluatedValue);
                    inicializado = true;
                }
            } else if (ctx.CADENA_TEXTO() != null) {
                String text = ctx.CADENA_TEXTO().getText();
                if (text.startsWith("\"") && text.endsWith("\"")) {
                    text = text.substring(1, text.length() - 1);
                }
                sym.setValue(text);
                inicializado = true;
            } else if (ctx.CARACTER() != null) {
                String text = ctx.CARACTER().getText();
                if (text.startsWith("'") && text.endsWith("'") && text.length() >= 3) {
                    sym.setValue(text.charAt(1));
                } else {
                    sym.setValue(text);
                }
                inicializado = true;
            } else if (ctx.getText().contains("verum") || ctx.getText().contains("orumvay")) {
                sym.setValue(true);
                inicializado = true;
            } else if (ctx.getText().contains("falsus") || ctx.getText().contains("alsus")) {
                sym.setValue(false);
                inicializado = true;
            }

            if (!inicializado || sym.getValue() == null) {
                assignDefaultValue(sym);
            }
        }
        return super.visitDeclaracion(ctx);
    }

    private void assignDefaultValue(Symbol sym) {
        String tipo = sym.getType() != null ? sym.getType().toLowerCase() : "";
        switch (tipo) {
            case "numerus":
                sym.setValue(0);
                break;
            case "decimalis":
                sym.setValue(0.0);
                break;
            case "textum":
                sym.setValue("");
                break;
            case "littera":
                sym.setValue('\0');
                break;
            case "boolean":
            case "verum":
            case "falsus":
                sym.setValue(false);
                break;
            default:
                sym.setValue(0);
                break;
        }
    }

    // =========================================================================
    // MÉTODOS PARA EVALUAR EXPRESIONES Y TÉRMINOS
    // =========================================================================

    @Override
    public Object visitExpresion(Codex_latinusParser.ExpresionContext ctx) {
        if (ctx.termino().size() == 1) {
            return visit(ctx.termino(0));
        }

        Object result = visit(ctx.termino(0));
        for (int i = 0; i < ctx.operacion_aritmetica().size(); i++) {
            String op = ctx.operacion_aritmetica(i).getText();
            Object right = visit(ctx.termino(i + 1));

            if (op.equals("+") && (result instanceof String || right instanceof String)) {
                result = String.valueOf(result) + right;
            } else {
                result = evaluateArithmetic(result, op, right);
            }
        }
        return result;
    }

    @Override
    public Object visitTermino(Codex_latinusParser.TerminoContext ctx) {
        if (ctx.NUMERO_ENTERO() != null) {
            try {
                return Integer.parseInt(ctx.NUMERO_ENTERO().getText());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        if (ctx.NUMERO_DECIMAL() != null) {
            try {
                return Double.parseDouble(ctx.NUMERO_DECIMAL().getText());
            } catch (NumberFormatException e) {
                return 0.0;
            }
        }
        if (ctx.CADENA_TEXTO() != null) {
            String text = ctx.CADENA_TEXTO().getText();
            if (text.startsWith("\"") && text.endsWith("\"")) {
                text = text.substring(1, text.length() - 1);
            }
            return text;
        }
        if (ctx.CARACTER() != null) {
            String text = ctx.CARACTER().getText();
            if (text.startsWith("'") && text.endsWith("'") && text.length() >= 3) {
                return text.charAt(1);
            }
            return text;
        }
        if (ctx.VERUM() != null) {
            return true;
        }
        if (ctx.FALSUS() != null) {
            return false;
        }
        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym == null) {
                throw new RuntimeException("Error en línea " + ctx.getStart().getLine() + ": La variable '" + varName + "' no ha sido declarada.");
            }
            return sym.getValue();
        }
        if (ctx.acceso_miembro() != null) {
            return visit(ctx.acceso_miembro());
        }
        if (ctx.llamada_funcion() != null) {
            return visit(ctx.llamada_funcion());
        }
        return super.visitTermino(ctx);
    }

    private Object evaluateArithmetic(Object left, String op, Object right) {
        double l = parseToDouble(left);
        double r = parseToDouble(right);
        double res = 0;

        switch (op) {
            case "+":
                res = l + r;
                break;
            case "-":
                res = l - r;
                break;
            case "*":
                res = l * r;
                break;
            case "/":
                if (r != 0) res = l / r;
                else throw new ArithmeticException("División por cero");
                break;
        }

        if (res == Math.floor(res) && !Double.isInfinite(res) && !Double.isNaN(res)) {
            return (int) res;
        }
        return res;
    }

    private double parseToDouble(Object obj) {
        if (obj == null) return 0.0;
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        try {
            return Double.parseDouble(obj.toString());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    @Override
    public Object visitRatio_funcion(Codex_latinusParser.Ratio_funcionContext ctx) {
        if (ctx.VARIABLE() != null) {
            String funcName = ctx.VARIABLE().getText();
            String tipoRetorno = ctx.tipo_dato() != null ? ctx.tipo_dato().getText().toLowerCase() : "desconocido";
            int line = ctx.getStart().getLine();
            int column = ctx.VARIABLE().getSymbol().getCharPositionInLine();

            List<String> paramTypes = new ArrayList<>();
            int numParams = 0;
            if (ctx.parametros() != null && ctx.parametros().parametro() != null) {
                numParams = ctx.parametros().parametro().size();
                for (Codex_latinusParser.ParametroContext paramCtx : ctx.parametros().parametro()) {
                    if (paramCtx.tipo_dato() != null) {
                        paramTypes.add(paramCtx.tipo_dato().getText().toLowerCase());
                    } else {
                        paramTypes.add("desconocido");
                    }
                }
            }

            Symbol funcSym = new Symbol(funcName, tipoRetorno, "ratio", numParams, paramTypes, 0, symbolTable.getCurrentScope(), line, column);
            symbolTable.define(funcSym);

            functionRegistry.put(funcName, ctx);
        }
        return null;
    }

    @Override
    public Object visitActio_funcion(Codex_latinusParser.Actio_funcionContext ctx) {
        if (ctx.VARIABLE() != null) {
            String funcName = ctx.VARIABLE().getText();
            int line = ctx.getStart().getLine();
            int column = ctx.VARIABLE().getSymbol().getCharPositionInLine();

            List<String> paramTypes = new ArrayList<>();
            int numParams = 0;
            if (ctx.parametros() != null && ctx.parametros().parametro() != null) {
                numParams = ctx.parametros().parametro().size();
                for (Codex_latinusParser.ParametroContext paramCtx : ctx.parametros().parametro()) {
                    if (paramCtx.tipo_dato() != null) {
                        paramTypes.add(paramCtx.tipo_dato().getText().toLowerCase());
                    } else {
                        paramTypes.add("desconocido");
                    }
                }
            }

            Symbol funcSym = new Symbol(funcName, "void", "actio", numParams, paramTypes, 0, symbolTable.getCurrentScope(), line, column);
            symbolTable.define(funcSym);

            functionRegistry.put(funcName, ctx);
        }
        return null;
    }

    @Override
    public Object visitLlamada_funcion(Codex_latinusParser.Llamada_funcionContext ctx) {
        String funcName = "";
        if (ctx.VARIABLE() != null) {
            funcName = ctx.VARIABLE().getText();
        }

        List<Object> argValues = new ArrayList<>();
        List<Codex_latinusParser.ExpresionContext> exprs = ctx.getRuleContexts(Codex_latinusParser.ExpresionContext.class);
        if (exprs != null) {
            for (Codex_latinusParser.ExpresionContext exprCtx : exprs) {
                argValues.add(visit(exprCtx));
            }
        }

        ParserRuleContext funcCtx = functionRegistry.get(funcName);
        if (funcCtx == null) {
            throw new RuntimeException("Error en línea " + ctx.getStart().getLine() + ": La función '" + funcName + "' no ha sido definida.");
        }

        Object resultadoFuncion = null;

        if (funcCtx instanceof Codex_latinusParser.Ratio_funcionContext ratioCtx) {
            resultadoFuncion = functionHandler.handleRatioFuncion(ratioCtx, argValues, (bodyCtx) -> {
                for (int i = 0; i < ratioCtx.getChildCount(); i++) {
                    ParseTree child = ratioCtx.getChild(i);
                    if (child instanceof Codex_latinusParser.Reddere_sentenciaContext reddereCtx) {
                        return visit(reddereCtx);
                    }
                    Object res = visit(child);
                    if (child instanceof ParserRuleContext && res instanceof ReturnSignal) {
                        return ((ReturnSignal) res).value;
                    }
                }
                return null;
            });
        } else if (funcCtx instanceof Codex_latinusParser.Actio_funcionContext actioCtx) {
            resultadoFuncion = functionHandler.handleActioFuncion(actioCtx, argValues, (bodyCtx) -> {
                for (int i = 0; i < actioCtx.getChildCount(); i++) {
                    ParseTree child = actioCtx.getChild(i);
                    visit(child);
                }
                return null;
            });
        }

        if (resultadoFuncion instanceof ReturnSignal) {
            return ((ReturnSignal) resultadoFuncion).value;
        }

        return resultadoFuncion;
    }

    public static class ReturnSignal {
        public final Object value;
        public ReturnSignal(Object value) {
            this.value = value;
        }
    }

    ParserRuleContext findBlockContext(ParserRuleContext funcCtx) {
        for (int i = funcCtx.getChildCount() - 1; i >= 0; i--) {
            ParseTree child = funcCtx.getChild(i);
            if (child instanceof ParserRuleContext ruleChild) {
                String className = ruleChild.getClass().getSimpleName();
                if (!className.contains("Variable") && !className.contains("Tipo") && !className.contains("Parametros")) {
                    return ruleChild;
                }
            }
        }
        return null;
    }

    @Override
    public Object visitReddere_sentencia(Codex_latinusParser.Reddere_sentenciaContext ctx) {
        if (ctx.expresion() != null) {
            return visit(ctx.expresion());
        }
        return null;
    }

    @Override
    public Object visitDeclaracion_local(Codex_latinusParser.Declaracion_localContext ctx) {
        if (ctx.VARIABLE() != null && !ctx.VARIABLE().isEmpty()) {
            String varName = ctx.VARIABLE(0).getText();
            Symbol sym = symbolTable.resolve(varName);

            if (sym == null) {
                String tipo = ctx.tipo_dato() != null ? ctx.tipo_dato().getText().toLowerCase() : "desconocido";
                int line = ctx.getStart().getLine();
                int col = ctx.getStart().getCharPositionInLine();

                sym = new Symbol(varName, tipo, "variable", symbolTable.getCurrentScope(), line, col);
                symbolTable.define(sym);
            }
            boolean inicializado = false;

            if (ctx.expresion() != null) {
                Object evaluatedValue = visit(ctx.expresion());
                if (evaluatedValue != null) {
                    sym.setValue(evaluatedValue);
                    inicializado = true;
                }
            } else if (ctx.CADENA_TEXTO() != null) {
                String text = ctx.CADENA_TEXTO().getText();
                if (text.startsWith("\"") && text.endsWith("\"")) {
                    text = text.substring(1, text.length() - 1);
                }
                sym.setValue(text);
                inicializado = true;
            } else if (ctx.CARACTER() != null) {
                String text = ctx.CARACTER().getText();
                if (text.startsWith("'") && text.endsWith("'") && text.length() >= 3) {
                    sym.setValue(text.charAt(1));
                } else {
                    sym.setValue(text);
                }
                inicializado = true;
            }

            if (!inicializado || sym.getValue() == null) {
                assignDefaultValue(sym);
            }
        }
        return super.visitDeclaracion_local(ctx);
    }

    @Override
    public Object visitArreglo_declaracion(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        String varName = ctx.VARIABLE(0) != null ? ctx.VARIABLE(0).getText() : "";
        Symbol sym = symbolTable.resolve(varName);

        String tipo = ctx.tipo_dato() != null ? ctx.tipo_dato().getText().toLowerCase() : "desconocido";
        int size = 0;
        try {
            size = Integer.parseInt(ctx.NUMERO_ENTERO().getText());
        } catch (NumberFormatException e) {
            size = 0;
        }

        List<Object> elementos = new ArrayList<>();

        if (ctx.elemento_arreglo() != null && ctx.elemento_arreglo().expresion() != null) {
            for (Codex_latinusParser.ExpresionContext exprCtx : ctx.elemento_arreglo().expresion()) {
                elementos.add(visit(exprCtx));
            }
        } else {
            Object defaultVal = getDefaultValueForType(tipo);
            for (int i = 0; i < size; i++) {
                elementos.add(defaultVal);
            }
        }

        if (sym != null) {
            sym.setValue(elementos);
        } else {
            int line = ctx.getStart().getLine();
            int col = ctx.getStart().getCharPositionInLine();
            sym = new Symbol(varName, tipo, "series", symbolTable.getCurrentScope(), line, col);
            sym.setValue(elementos);
            symbolTable.define(sym);
        }

        return super.visitArreglo_declaracion(ctx);
    }

    private Object getDefaultValueForType(String tipo) {
        if (tipo == null) return 0;
        switch (tipo.toLowerCase()) {
            case "numerus":
                return 0;
            case "decimalis":
                return 0.0;
            case "textum":
                return "";
            case "littera":
                return '\0';
            case "verum":
            case "falsus":
            case "boolean":
                return false;
            default:
                return 0;
        }
    }

    @Override
    public Object visitAcceso_miembro(Codex_latinusParser.Acceso_miembroContext ctx) {
        if (ctx.VARIABLE(0) == null) return null;
        String varName = ctx.VARIABLE(0).getText();
        Symbol sym = symbolTable.resolve(varName);

        if (sym == null || sym.getValue() == null) return null;

        Object currentVal = sym.getValue();

        for (int i = 1; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();

            if (text.equals("[")) {
                ParseTree exprChild = ctx.getChild(i + 1);
                Object indexObj = visit(exprChild);
                int index = parseToInt(indexObj);

                if (currentVal instanceof List<?> list) {
                    if (index >= 0 && index < list.size()) {
                        currentVal = list.get(index);
                    } else {
                        currentVal = null;
                    }
                }
                i += 2;
            } else if (text.equals(".")) {
                ParseTree fieldChild = ctx.getChild(i + 1);
                if (fieldChild != null) {
                    String fieldName = fieldChild.getText();
                    if (currentVal instanceof Map) {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> map = (Map<String, Object>) currentVal;
                        currentVal = map.get(fieldName);
                    } else {
                        currentVal = null;
                    }
                }
                i += 1;
            }
        }

        return currentVal;
    }

    private int parseToInt(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) return 0;
        try {
            return Integer.parseInt(obj.toString().trim());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    @Override
    public Object visitPrimaria_logica(Codex_latinusParser.Primaria_logicaContext ctx) {
        if (ctx.VERUM() != null) return true;
        if (ctx.FALSUS() != null) return false;

        if (ctx.expresion().size() == 2 && ctx.operador_relacional() != null) {
            Object left = visit(ctx.expresion(0));
            Object right = visit(ctx.expresion(1));
            String op = ctx.operador_relacional().getText();

            return evaluateRelational(left, op, right);
        }

        return super.visitPrimaria_logica(ctx);
    }

    private boolean evaluateRelational(Object left, String op, Object right) {
        double l = parseToDouble(left);
        double r = parseToDouble(right);

        switch (op) {
            case "==":
                return l == r;
            case "!=":
                return l != r;
            case "<":
                return l < r;
            case "<=":
                return l <= r;
            case ">":
                return l > r;
            case ">=":
                return l >= r;
            default:
                return false;
        }
    }

    @Override
    public Object visitStructura_def(Codex_latinusParser.Structura_defContext ctx) {
        String structName = ctx.VARIABLE().getText();
        List<String> fields = new ArrayList<>();

        for (Codex_latinusParser.Miembro_structuraContext mCtx : ctx.miembro_structura()) {
            if (mCtx.VARIABLE(0) != null) {
                fields.add(mCtx.VARIABLE(0).getText());
            }
        }
        structBlueprints.put(structName, fields);
        return super.visitStructura_def(ctx);
    }

    @Override
    public Object visitStructura_instanciacion(Codex_latinusParser.Structura_instanciacionContext ctx) {
        if (ctx.CORCHETE_IZQ() != null && ctx.NUMERO_ENTERO() != null) {
            String structTypeName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "";
            int size = Integer.parseInt(ctx.NUMERO_ENTERO().getText());
            List<Object> structArray = new ArrayList<>();

            List<String> fields = structBlueprints.get(structTypeName);
            for (int i = 0; i < size; i++) {
                Map<String, Object> defaultInstance = new HashMap<>();
                if (fields != null) {
                    for (String field : fields) {
                        defaultInstance.put(field, null);
                    }
                }
                structArray.add(defaultInstance);
            }
            return structArray;
        }

        Map<String, Object> instance = new HashMap<>();
        if (ctx.atributo_asignacion() != null) {
            for (Codex_latinusParser.Atributo_asignacionContext atribCtx : ctx.atributo_asignacion()) {
                String attrName = atribCtx.VARIABLE().getText();
                Object attrVal = null;

                if (atribCtx.expresion() != null) {
                    attrVal = visit(atribCtx.expresion());
                } else if (atribCtx.structura_instanciacion() != null) {
                    attrVal = visit(atribCtx.structura_instanciacion());
                } else if (atribCtx.arreglo_literal() != null) {
                    attrVal = visit(atribCtx.arreglo_literal());
                }
                instance.put(attrName, attrVal);
            }
        }
        return instance;
    }

    @Override
    public Object visitSi_sentencia(Codex_latinusParser.Si_sentenciaContext ctx) {
        boolean condicionCumplida = false;

        if (ctx.condicion() != null) {
            Object res = visit(ctx.condicion());
            condicionCumplida = parseToBoolean(res);
        }

        if (condicionCumplida) {
            ejecutarBloquesSentencias(ctx.sentencia());
            return null;
        }

        boolean aliterEjecutado = false;

        if (ctx.aliter_bloque() != null) {
            for (Codex_latinusParser.Aliter_bloqueContext aliterCtx : ctx.aliter_bloque()) {
                boolean tieneCondicion = aliterCtx.getChildCount() > 2 && aliterCtx.getText().contains("(");

                if (tieneCondicion) {
                    Codex_latinusParser.CondicionContext condCtx = aliterCtx.getChild(Codex_latinusParser.CondicionContext.class, 0);
                    if (condCtx != null) {
                        Object resAliter = visit(condCtx);
                        if (parseToBoolean(resAliter)) {
                            ejecutarSentenciasDeAliter(aliterCtx);
                            aliterEjecutado = true;
                            break;
                        }
                    }
                } else {
                    if (!aliterEjecutado) {
                        ejecutarSentenciasDeAliter(aliterCtx);
                        aliterEjecutado = true;
                        break;
                    }
                }
            }
        }

        return null;
    }

    /**
     * Método auxiliar seguro para extraer y ejecutar todas las sentencias de un aliter_bloque
     * sin importar su estructura interna en ANTLR.
     */
    private void ejecutarSentenciasDeAliter(ParserRuleContext aliterCtx) {
        List<Codex_latinusParser.SentenciaContext> sentencias = aliterCtx.getRuleContexts(Codex_latinusParser.SentenciaContext.class);
        if (sentencias != null) {
            for (Codex_latinusParser.SentenciaContext sent : sentencias) {
                visit(sent);
            }
        }
    }

    /**
     * Método auxiliar para ejecutar una lista de sentencias genérica
     */
    private void ejecutarBloquesSentencias(List<Codex_latinusParser.SentenciaContext> sentencias) {
        if (sentencias != null) {
            for (Codex_latinusParser.SentenciaContext sent : sentencias) {
                visit(sent);
            }
        }
    }

    /**
     * Método auxiliar para asegurar que cualquier resultado se convierta de forma segura a booleano
     */
    private boolean parseToBoolean(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return Boolean.parseBoolean(obj.toString().trim()) || obj.toString().equalsIgnoreCase("verum");
    }

    @Override
    public Object visitCiclo_per(Codex_latinusParser.Ciclo_perContext ctx) {
        // 1. Inicializar la variable del ciclo (ej. esto i : numerus 0)
        if (ctx.inicializacion_per() != null) {
            visit(ctx.inicializacion_per());
        }

        // 2. Ejecutar el bucle
        while (true) {
            // Evaluar la condición (ej. i < 10)
            if (ctx.condiciones_per() != null) {
                Object condVal = visit(ctx.condiciones_per());
                if (!parseToBoolean(condVal)) {
                    break; // Salir si la condición es falsa
                }
            }

            // Ejecutar el cuerpo del ciclo
            boolean interrumpido = false;
            boolean continuado = false;

            if (ctx.sentencia() != null) {
                for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                    // Verificamos si la sentencia es un salto (interrumpe / perge)
                    if (sent.salto_sentencia() != null) {
                        if (sent.salto_sentencia().INTERRUMPE() != null) {
                            interrumpido = true;
                            break;
                        } else if (sent.salto_sentencia().PERGE() != null) {
                            continuado = true;
                            break;
                        }
                    }
                    visit(sent);
                }
            }

            if (interrumpido) {
                break; // Rompe el ciclo por completo (interrumpe)
            }

            // 3. Ejecutar el incremento (ej. i++)
            if (ctx.incremento_per() != null) {
                visit(ctx.incremento_per());
            }
        }

        return null;
    }

    @Override
    public Object visitInicializacion_per(Codex_latinusParser.Inicializacion_perContext ctx) {
        if (ctx.ESTO() != null && ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            String tipo = ctx.tipo_dato() != null ? ctx.tipo_dato().getText().toLowerCase() : "numerus";

            Object val = 0;
            if (ctx.expresion() != null) {
                val = visit(ctx.expresion());
            }

            int line = ctx.getStart().getLine();
            int col = ctx.getStart().getCharPositionInLine();

            Symbol sym = new Symbol(varName, tipo, "variable", symbolTable.getCurrentScope(), line, col);
            sym.setValue(val);
            symbolTable.define(sym);
        } else {
            return super.visitInicializacion_per(ctx);
        }
        return null;
    }

    @Override
    public Object visitIncremento_per(Codex_latinusParser.Incremento_perContext ctx) {
        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                Object currentVal = sym.getValue();
                if (ctx.SUMA_ABREVIADA() != null) {
                    double d = parseToDouble(currentVal) + 1;
                    sym.setValue(d == Math.floor(d) ? (int) d : d);
                } else if (ctx.RESTA_ABREVIADA() != null) {
                    double d = parseToDouble(currentVal) - 1;
                    sym.setValue(d == Math.floor(d) ? (int) d : d);
                } else if (ctx.ASIGNACION() != null && ctx.expresion() != null) {
                    sym.setValue(visit(ctx.expresion()));
                }
            }
        }
        return super.visitIncremento_per(ctx);
    }


}