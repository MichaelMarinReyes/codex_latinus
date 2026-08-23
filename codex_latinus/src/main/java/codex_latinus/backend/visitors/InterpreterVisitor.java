package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class InterpreterVisitor extends Codex_latinusBaseVisitor<Object> {

    private static final Queue<String> inputQueue = new LinkedList<>();
    private final Map<String, Codex_latinusParser.FuncionContext> funciones = new HashMap<>();

    private final List<CompilationError> semanticErrors;
    private SymbolTable symbolTable;

    public InterpreterVisitor() {
        this.symbolTable = new SymbolTable();
        this.semanticErrors = new ArrayList<>();
    }

    public InterpreterVisitor(SymbolTable symbolTable, List<CompilationError> semanticErrors) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
    }

    public static void setInputs(List<String> inputs) {
        inputQueue.clear();
        if (inputs != null) {
            inputQueue.addAll(inputs);
        }
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        if (symbolTable != null) {
            this.symbolTable = symbolTable;
        }
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public List<CompilationError> getSemanticErrors() {
        return semanticErrors;
    }

    @Override
    public Object visitInit(Codex_latinusParser.InitContext ctx) {
        return visit(ctx.codex_latinus());
    }

    @Override
    public Object visitCodex_latinus(Codex_latinusParser.Codex_latinusContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        return null;
    }

    @Override
    public Object visitVariables(Codex_latinusParser.VariablesContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));
        }
        return null;
    }

    @Override
    public Object visitDeclaracion(Codex_latinusParser.DeclaracionContext dec) {
        if (dec.VARIABLE() == null || dec.VARIABLE().isEmpty()) return null;
        String varName = dec.VARIABLE(0).getText();
        Object valor = null;

        if (dec.expresion() != null) {
            valor = visit(dec.expresion());
        } else if (dec.TEXTUM() != null || dec.CADENA_TEXTO() != null) {
            valor = dec.CADENA_TEXTO() != null ? limpiarCadena(dec.CADENA_TEXTO().getText()) : "";
        } else {
            for (int i = 0; i < dec.getChildCount(); i++) {
                if (dec.getChild(i) instanceof Codex_latinusParser.Structura_instanciacionContext) {
                    valor = visit(dec.getChild(i));
                    break;
                }
            }
        }

        if (symbolTable != null) {
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                sym.setValue(valor);
            }
        }
        return valor;
    }

    @Override
    public Object visitArreglo_declaracion(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        if (ctx.VARIABLE() == null || ctx.VARIABLE().isEmpty()) return null;
        String varName = ctx.VARIABLE(0).getText();

        List<Object> valores = new ArrayList<>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof Codex_latinusParser.ExpresionContext) {
                valores.add(visit(child));
            }
        }

        if (symbolTable != null) {
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                sym.setValue(valores);
            }
        }
        return valores;
    }

    @Override
    public Object visitMunera(Codex_latinusParser.MuneraContext ctx) {
        for (Codex_latinusParser.FuncionContext func : ctx.funcion()) {
            String nombreFunc = "";
            if (func.ratio_funcion() != null) {
                nombreFunc = func.ratio_funcion().VARIABLE().getText();
            } else if (func.actio_funcion() != null) {
                nombreFunc = func.actio_funcion().VARIABLE().getText();
            }
            funciones.put(nombreFunc, func);
        }
        return null;
    }

    @Override
    public Object visitMaior(Codex_latinusParser.MaiorContext ctx) {
        for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
            try {
                visit(sent);
            } catch (BreakException e) {
                break;
            }
        }
        return null;
    }

    @Override
    public Object visitSentencia(Codex_latinusParser.SentenciaContext ctx) {
        if (ctx.SUMA_ABREVIADA() != null || ctx.RESTA_ABREVIADA() != null) {
            String varName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : ctx.acceso_miembro().VARIABLE(0).getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null && sym.getValue() instanceof Number) {
                double val = ((Number) sym.getValue()).doubleValue();
                if (ctx.SUMA_ABREVIADA() != null) val++;
                else val--;

                if (sym.getValue() instanceof Integer) {
                    sym.setValue((int) val);
                } else {
                    sym.setValue(val);
                }
            }
            return null;
        }
        return visitChildren(ctx);
    }
/*
    @Override
    public Object visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();
            if (!text.equals(">>") && !text.equals(";")) {
                Object val = visit(child);
                if (val != null) {
                    if (val instanceof Boolean) {
                        sb.append(((Boolean) val) ? "verum" : "falsus");
                    } else {
                        sb.append(val);
                    }
                } else {
                    sb.append(text.replace("\"", ""));
                }
            }
        }
        System.out.println(sb.toString().replace("\"", ""));
        return null;
    }

    @Override
    public Object visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        String varName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "";
        String input = inputQueue.isEmpty() ? "18" : inputQueue.poll();

        Object val = input;
        try {
            if (input.contains(".")) {
                val = Double.parseDouble(input);
            } else {
                val = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            if (input.equalsIgnoreCase("verum")) val = true;
            else if (input.equalsIgnoreCase("falsus")) val = false;
        }

        if (symbolTable != null && !varName.isEmpty()) {
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                sym.setValue(val);
            }
        }
        return null;
    }*/

    @Override
    public Object visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();
            if (!text.equals(">>") && !text.equals(";")) {
                Object val = visit(child);
                if (val != null) {
                    if (val instanceof Boolean) {
                        sb.append(((Boolean) val) ? "verum" : "falsus");
                    } else {
                        sb.append(val);
                    }
                } else {
                    sb.append(text.replace("\"", ""));
                }
            }
        }
        String outputText = sb.toString().replace("\"", "");
        return null;
    }

    @Override
    public Object visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        String varName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "";
        String input = inputQueue.isEmpty() ? "18" : inputQueue.poll();

        Object val = input;
        try {
            if (input.contains(".")) {
                val = Double.parseDouble(input);
            } else {
                val = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            if (input.equalsIgnoreCase("verum")) val = true;
            else if (input.equalsIgnoreCase("falsus")) val = false;
        }

        if (symbolTable != null && !varName.isEmpty()) {
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                sym.setValue(val);
            }
        }
        return null;
    }

    @Override
    public Object visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        Object value = null;
        if (ctx.expresion() != null) {
            value = visit(ctx.expresion());
        } else if (ctx.condicion() != null) {
            value = visit(ctx.condicion());
        } else if (ctx.arreglo_literal() != null) {
            List<Object> vals = new ArrayList<>();
            var arrayList = ctx.arreglo_literal();
            for (int i = 0; i < arrayList.getChildCount(); i++) {
                ParseTree child = arrayList.getChild(i);
                if (child instanceof Codex_latinusParser.ExpresionContext) {
                    vals.add(visit(child));
                }
            }
            value = vals;
        } else if (ctx.structura_instanciacion() != null) {
            value = visit(ctx.structura_instanciacion());
        }

        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            if (symbolTable != null) {
                Symbol sym = symbolTable.resolve(varName);
                if (sym != null) {
                    sym.setValue(value);
                } else {
                    semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + varName + "' no ha sido declarada.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
                }
            }
        } else if (ctx.acceso_miembro() != null) {
            var am = ctx.acceso_miembro();
            String varName = am.VARIABLE(0).getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null && sym.getValue() != null) {
                Object container = sym.getValue();
                int exprIndex = 0;
                int varVarIndex = 1;

                for (int i = 1; i < am.getChildCount(); i++) {
                    ParseTree child = am.getChild(i);
                    String text = child.getText();

                    if (text.equals(".")) {
                        if (varVarIndex < am.VARIABLE().size()) {
                            String attrName = am.VARIABLE(varVarIndex++).getText();
                            if (i >= am.getChildCount() - 2) {
                                if (container instanceof Map) {
                                    @SuppressWarnings("unchecked")
                                    Map<String, Object> map = (Map<String, Object>) container;
                                    map.put(attrName, value);
                                }
                            } else {
                                if (container instanceof Map) {
                                    @SuppressWarnings("unchecked")
                                    Map<String, Object> map = (Map<String, Object>) container;
                                    container = map.get(attrName);
                                }
                            }
                        }
                    } else if (text.equals("[")) {
                        if (container instanceof List && exprIndex < am.expresion().size()) {
                            Object indexObj = visit(am.expresion(exprIndex++));
                            if (indexObj instanceof Number) {
                                int index = ((Number) indexObj).intValue();
                                @SuppressWarnings("unchecked")
                                List<Object> lista = (List<Object>) container;

                                if (i >= am.getChildCount() - 3) {
                                    if (index >= 0 && index < lista.size()) {
                                        lista.set(index, value);
                                    } else {
                                        semanticErrors.add(new CompilationError("SEMÁNTICO", "Error semántico: Índice " + index + " fuera de rango para el arreglo '" + varName + "'.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
                                    }
                                } else {
                                    if (index >= 0 && index < lista.size()) {
                                        container = lista.get(index);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El miembro o variable '" + varName + "' no ha sido declarado.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            }
        }
        return value;
    }

    @Override
    public Object visitAcceso_miembro(Codex_latinusParser.Acceso_miembroContext ctx) {
        if (ctx.VARIABLE() == null || ctx.VARIABLE().isEmpty()) return null;

        String varName = ctx.VARIABLE(0).getText();
        Symbol sym = symbolTable.resolve(varName);
        if (sym == null || sym.getValue() == null) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable o estructura '" + varName + "' no ha sido declarada.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            return null;
        }

        Object actual = sym.getValue();
        int exprIndex = 0;
        int varVarIndex = 1;

        for (int i = 1; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();

            if (text.equals(".")) {
                if (varVarIndex < ctx.VARIABLE().size()) {
                    String attrName = ctx.VARIABLE(varVarIndex++).getText();
                    if (actual instanceof Map) {
                        @SuppressWarnings("unchecked")
                        Map<String, Object> map = (Map<String, Object>) actual;
                        actual = map.get(attrName);
                    } else {
                        return null;
                    }
                }
            } else if (text.equals("[")) {
                if (actual instanceof List && exprIndex < ctx.expresion().size()) {
                    Object indexObj = visit(ctx.expresion(exprIndex++));
                    if (indexObj instanceof Number) {
                        int index = ((Number) indexObj).intValue();
                        @SuppressWarnings("unchecked")
                        List<Object> lista = (List<Object>) actual;
                        if (index >= 0 && index < lista.size()) {
                            actual = lista.get(index);
                        } else {
                            semanticErrors.add(new CompilationError("SEMÁNTICO", "Error semántico: Índice " + index + " fuera de rango para '" + varName + "'.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
                            return null;
                        }
                    }
                }
            }
        }

        return actual;
    }

    @Override
    public Object visitSi_sentencia(Codex_latinusParser.Si_sentenciaContext ctx) {
        Object condicion = visit(ctx.condicion());
        if (condicion instanceof Boolean && (Boolean) condicion) {
            for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                visit(sent);
            }
        } else {
            for (int i = 0; i < ctx.aliter_bloque().size(); i++) {
                var aliter = ctx.aliter_bloque(i);
                Object condAliter = visit(aliter.condicion());
                if (condAliter instanceof Boolean && (Boolean) condAliter) {
                    for (Codex_latinusParser.SentenciaContext sent : aliter.sentencia()) {
                        visit(sent);
                    }
                    break;
                }
            }
        }
        return null;
    }

    @Override
    public Object visitCiclo_dum(Codex_latinusParser.Ciclo_dumContext ctx) {
        while (true) {
            Object cond = visit(ctx.condicion());
            if (!(cond instanceof Boolean) || !((Boolean) cond)) {
                break;
            }
            try {
                for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                    visit(sent);
                }
            } catch (BreakException e) {
                break;
            }
        }
        return null;
    }

    @Override
    public Object visitCiclo_facere(Codex_latinusParser.Ciclo_facereContext ctx) {
        do {
            try {
                for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                    visit(sent);
                }
            } catch (BreakException e) {
                break;
            }
            Object cond = visit(ctx.condicion());
            if (!(cond instanceof Boolean) || !((Boolean) cond)) {
                break;
            }
        } while (true);
        return null;
    }

    @Override
    public Object visitCiclo_per(Codex_latinusParser.Ciclo_perContext ctx) {
        if (ctx.inicializacion_per() != null) {
            visit(ctx.inicializacion_per());
        }

        while (true) {
            Object cond = visit(ctx.condiciones_per());
            if (!(cond instanceof Boolean) || !((Boolean) cond)) {
                break;
            }
            try {
                for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                    visit(sent);
                }
            } catch (BreakException e) {
                break;
            }
            if (ctx.incremento_per() != null) {
                visit(ctx.incremento_per());
            }
        }
        return null;
    }

    @Override
    public Object visitInicializacion_per(Codex_latinusParser.Inicializacion_perContext ctx) {
        if (ctx.ESTO() != null) {
            String varName = ctx.VARIABLE().getText();
            Object val = visit(ctx.expresion());
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) sym.setValue(val);
        } else {
            String varName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : ctx.acceso_miembro().VARIABLE(0).getText();
            Object val = visit(ctx.expresion());
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) sym.setValue(val);
        }
        return null;
    }

    @Override
    public Object visitIncremento_per(Codex_latinusParser.Incremento_perContext ctx) {
        String varName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : ctx.acceso_miembro().VARIABLE(0).getText();
        Symbol sym = symbolTable.resolve(varName);
        if (sym != null && sym.getValue() instanceof Number) {
            double val = ((Number) sym.getValue()).doubleValue();
            if (ctx.SUMA_ABREVIADA() != null) {
                val++;
            } else if (ctx.RESTA_ABREVIADA() != null) {
                val--;
            } else if (ctx.expresion() != null) {
                Object resExp = visit(ctx.expresion());
                if (resExp instanceof Number) val = ((Number) resExp).doubleValue();
            }
            if (sym.getValue() instanceof Integer) {
                sym.setValue((int) val);
            } else {
                sym.setValue(val);
            }
        }
        return null;
    }

    @Override
    public Object visitSalto_sentencia(Codex_latinusParser.Salto_sentenciaContext ctx) {
        String text = ctx.getText();
        if (text != null && text.contains("interrumpe")) {
            throw new BreakException();
        }
        if (text != null && text.startsWith("reddere")) {
            Object valorRetorno = null;
            for (int i = 0; i < ctx.getChildCount(); i++) {
                ParseTree child = ctx.getChild(i);
                if (child instanceof Codex_latinusParser.ExpresionContext) {
                    valorRetorno = visit(child);
                    break;
                }
            }
            throw new ReturnException(valorRetorno);
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitCondicion(Codex_latinusParser.CondicionContext ctx) {
        if (ctx.OR() != null) {
            Object izq = visit(ctx.condicion());
            Object der = visit(ctx.conjuncion());
            if (izq instanceof Boolean && der instanceof Boolean) {
                return (Boolean) izq || (Boolean) der;
            }
        }
        return visit(ctx.conjuncion());
    }

    @Override
    public Object visitConjuncion(Codex_latinusParser.ConjuncionContext ctx) {
        if (ctx.AND() != null) {
            Object izq = visit(ctx.conjuncion());
            Object der = visit(ctx.negacion_logica());
            if (izq instanceof Boolean && der instanceof Boolean) {
                return (Boolean) izq && (Boolean) der;
            }
        }
        return visit(ctx.negacion_logica());
    }

    @Override
    public Object visitNegacion_logica(Codex_latinusParser.Negacion_logicaContext ctx) {
        if (ctx.NEGACION() != null) {
            Object val = visit(ctx.negacion_logica());
            if (val instanceof Boolean) {
                return !(Boolean) val;
            }
        }
        return visit(ctx.primaria_logica());
    }

    @Override
    public Object visitPrimaria_logica(Codex_latinusParser.Primaria_logicaContext ctx) {
        if (ctx.VERUM() != null) return true;
        if (ctx.FALSUS() != null) return false;
        if (ctx.VARIABLE() != null) {
            Symbol s = symbolTable.resolve(ctx.VARIABLE().getText());
            return s != null ? s.getValue() : false;
        }
        if (ctx.llamada_funcion() != null) {
            return visit(ctx.llamada_funcion());
        }
        if (ctx.operador_relacional() != null) {
            Object izq = visit(ctx.expresion(0));
            Object der = visit(ctx.expresion(1));
            String op = ctx.operador_relacional().getText();

            if (izq instanceof Number && der instanceof Number) {
                double v1 = ((Number) izq).doubleValue();
                double v2 = ((Number) der).doubleValue();
                return switch (op) {
                    case ">" -> v1 > v2;
                    case ">=" -> v1 >= v2;
                    case "<" -> v1 < v2;
                    case "<=" -> v1 <= v2;
                    case "==" -> v1 == v2;
                    case "!=" -> v1 != v2;
                    default -> false;
                };
            }
            if (op.equals("==")) {
                return Objects.equals(izq, der);
            }
            if (op.equals("!=")) {
                return !Objects.equals(izq, der);
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpresion(Codex_latinusParser.ExpresionContext ctx) {
        if (ctx.termino().size() == 1) {
            return visit(ctx.termino(0));
        }
        try {
            Object resultado = visit(ctx.termino(0));
            for (int i = 0; i < ctx.operacion_aritmetica().size(); i++) {
                String op = ctx.operacion_aritmetica(i).getText();
                Object sig = visit(ctx.termino(i + 1));

                if (op.equals("+") && (resultado instanceof String || sig instanceof String)) {
                    resultado = String.valueOf(resultado) + sig;
                    continue;
                }

                if (resultado instanceof Number && sig instanceof Number) {
                    double v1 = ((Number) resultado).doubleValue();
                    double v2 = ((Number) sig).doubleValue();
                    resultado = switch (op) {
                        case "*" -> v1 * v2;
                        case "+" -> v1 + v2;
                        case "-" -> v1 - v2;
                        case "/" -> v2 != 0 ? v1 / v2 : 0;
                        default -> resultado;
                    };
                }
            }
            return resultado;
        } catch (Exception ignored) {
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitTermino(Codex_latinusParser.TerminoContext ctx) {
        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            if (symbolTable != null) {
                Symbol sym = symbolTable.resolve(varName);
                if (sym != null && sym.getValue() != null) {
                    return sym.getValue();
                }
            }
            return 0;
        }
        if (ctx.acceso_miembro() != null) {
            return visit(ctx.acceso_miembro());
        }
        if (ctx.NUMERO_ENTERO() != null) {
            return Integer.parseInt(ctx.NUMERO_ENTERO().getText());
        }
        if (ctx.NUMERO_DECIMAL() != null) {
            return Double.parseDouble(ctx.NUMERO_DECIMAL().getText());
        }
        if (ctx.CADENA_TEXTO() != null) {
            return limpiarCadena(ctx.CADENA_TEXTO().getText());
        }
        if (ctx.VERUM() != null) return true;
        if (ctx.FALSUS() != null) return false;
        if (ctx.llamada_funcion() != null) {
            return visit(ctx.llamada_funcion());
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitLlamada_funcion(Codex_latinusParser.Llamada_funcionContext ctx) {
        String funcName = ctx.VARIABLE().getText();
        Codex_latinusParser.FuncionContext funcCtx = funciones.get(funcName);
        if (funcCtx == null) return null;

        symbolTable.enterScope("actio_" + funcName);

        if (funcCtx.ratio_funcion() != null && funcCtx.ratio_funcion().parametros() != null) {
            var params = funcCtx.ratio_funcion().parametros().parametro();
            var args = ctx.argumentos().expresion();
            for (int i = 0; i < params.size(); i++) {
                String paramName = params.get(i).VARIABLE(0).getText();
                Object argVal = visit(args.get(i));
                Symbol paramSym = symbolTable.resolve(paramName);
                if (paramSym != null) {
                    paramSym.setValue(argVal);
                }
            }
        }

        Object resultadoFuncion = null;
        try {
            visit(funcCtx);
        } catch (ReturnException e) {
            resultadoFuncion = e.getValue();
        } finally {
            symbolTable.exitScope();
        }

        return resultadoFuncion;
    }

    private String limpiarCadena(String cad) {
        if (cad.startsWith("\"") && cad.endsWith("\"")) {
            return cad.substring(1, cad.length() - 1);
        }
        return cad;
    }

    @Override
    public Object visitStructura_instanciacion(Codex_latinusParser.Structura_instanciacionContext ctx) {
        Map<String, Object> instancia = new HashMap<>();

        if (ctx.atributo_asignacion() != null) {
            for (Codex_latinusParser.Atributo_asignacionContext atribCtx : ctx.atributo_asignacion()) {
                String nombreAtributo = atribCtx.VARIABLE().getText();
                Object valorAtributo = null;

                if (atribCtx.expresion() != null) {
                    valorAtributo = visit(atribCtx.expresion());
                } else if (atribCtx.structura_instanciacion() != null) {
                    valorAtributo = visit(atribCtx.structura_instanciacion());
                } else if (atribCtx.arreglo_literal() != null) {
                    valorAtributo = visit(atribCtx.arreglo_literal());
                }

                instancia.put(nombreAtributo, valorAtributo);
            }
        }
        return instancia;
    }

    private static class ReturnException extends RuntimeException {
        private final Object value;

        public ReturnException(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }
    }

    private static class BreakException extends RuntimeException {
    }
}