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

            // Ignorar tokens de sintaxis de impresión
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
                String valorSimulado = mockInputs.poll();

                if (valorSimulado != null) {
                    Object parsedValue = parseValueByType(valorSimulado, sym.getType());
                    sym.setValue(parsedValue);
                    consoleOutput.append(valorSimulado).append("\n");
                } else {
                    assignDefaultValue(sym);
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
        String varName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : null;
        if (varName != null && ctx.expresion() != null) {
            Object evaluatedValue = visit(ctx.expresion());
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null && evaluatedValue != null) {
                sym.setValue(evaluatedValue);
            }
        }
        return super.visitAsignacion_sentencia(ctx);
    }

    @Override
    public Object visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx) {
        if (ctx.VARIABLE() != null && !ctx.VARIABLE().isEmpty()) {
            String varName = ctx.VARIABLE(0).getText();
            Symbol sym = symbolTable.resolve(varName);

            if (sym != null) {
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
    // MÉTODOS FALTANTES PARA EVALUAR EXPRESIONES Y TÉRMINOS
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
            return sym != null ? sym.getValue() : null;
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
            functionRegistry.put(ctx.VARIABLE().getText(), ctx);
        }
        return null;
    }

    @Override
    public Object visitActio_funcion(Codex_latinusParser.Actio_funcionContext ctx) {
        if (ctx.VARIABLE() != null) {
            functionRegistry.put(ctx.VARIABLE().getText(), ctx);
        }
        return null;
    }

    // =========================================================================
    // IMPLEMENTACIÓN DE LA LLAMADA A FUNCIÓN
    // =========================================================================

    @Override
    public Object visitLlamada_funcion(Codex_latinusParser.Llamada_funcionContext ctx) {
        String funcName = "";
        if (ctx.VARIABLE() != null) {
            funcName = ctx.VARIABLE().getText();
        }

        // 1. Obtener todas las expresiones de forma genérica (sin importar el nombre del método en ANTLR)
        List<Object> argValues = new ArrayList<>();
        List<Codex_latinusParser.ExpresionContext> exprs = ctx.getRuleContexts(Codex_latinusParser.ExpresionContext.class);
        if (exprs != null) {
            for (Codex_latinusParser.ExpresionContext exprCtx : exprs) {
                argValues.add(visit(exprCtx));
            }
        }

        // 2. Buscar la función en el registro de contextos
        ParserRuleContext funcCtx = functionRegistry.get(funcName);
        if (funcCtx == null) {
            return null; // La función no existe o no fue registrada
        }

        // 3. Delegar la ejecución al FunctionHandler de forma segura
        if (funcCtx instanceof Codex_latinusParser.Ratio_funcionContext ratioCtx) {
            return functionHandler.handleRatioFuncion(ratioCtx, argValues, (bodyCtx) -> {
                // Visitar el bloque/cuerpo interno de la función de manera genérica
                ParserRuleContext bloque = findBlockContext(ratioCtx);
                if (bloque != null) {
                    return visit(bloque);
                }
                return null;
            });
        } else if (funcCtx instanceof Codex_latinusParser.Actio_funcionContext actioCtx) {
            return functionHandler.handleActioFuncion(actioCtx, argValues, (bodyCtx) -> {
                ParserRuleContext bloque = findBlockContext(actioCtx);
                if (bloque != null) {
                    return visit(bloque);
                }
                return null;
            });
        }

        return null;
    }

    /**
     * Método auxiliar para localizar el bloque de instrucciones interno
     * sin importar cómo se llame la regla en la gramática (.g4).
     */
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

    // 4. Manejar la sentencia de retorno (reddere) para capturar el valor devuelto
    @Override
    public Object visitReddere_sentencia(Codex_latinusParser.Reddere_sentenciaContext ctx) {
        if (ctx.expresion() != null) {
            return visit(ctx.expresion());
        }
        return null;
    }
}