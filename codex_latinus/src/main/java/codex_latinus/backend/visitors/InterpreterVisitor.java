package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InterpreterVisitor extends Codex_latinusBaseVisitor<Object> {

    private final Map<String, Object> memory = new HashMap<>();
    private final Map<String, Codex_latinusParser.FuncionContext> funciones = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

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
        for (Codex_latinusParser.DeclaracionContext dec : ctx.declaracion()) {
            visit(dec);
        }
        return null;
    }

    @Override
    public Object visitDeclaracion(Codex_latinusParser.DeclaracionContext dec) {
        String varName = dec.VARIABLE(0).getText();
        Object valor = null;
        if (dec.expresion() != null) {
            valor = visit(dec.expresion());
        } else if (dec.TEXTUM() != null || dec.CADENA_TEXTO() != null) {
            valor = dec.CADENA_TEXTO() != null ? limpiarCadena(dec.CADENA_TEXTO().getText()) : "";
        }
        memory.put(varName, valor);
        return valor;
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
            visit(sent);
        }
        return null;
    }

    @Override
    public Object visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();
            if (!text.equals(">>") && !text.equals(";")) {
                Object val = visit(child);
                if (val != null) {
                    sb.append(val);
                } else {
                    sb.append(text);
                }
            }
        }
        System.out.println(sb.toString().replace("\"", ""));
        return null;
    }

    @Override
    public Object visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        String varName = ctx.VARIABLE().getText();
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
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
            memory.put(varName, val);
        }
        return null;
    }

    @Override
    public Object visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        String varName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : ctx.acceso_miembro().VARIABLE(0).getText();
        Object valor = visit(ctx.expresion());
        memory.put(varName, valor);
        return valor;
    }

    @Override
    public Object visitSi_sentencia(Codex_latinusParser.Si_sentenciaContext ctx) {
        Object condicion = null;
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof Codex_latinusParser.ExpresionContext) {
                condicion = visit(child);
                break;
            }
        }

        if (condicion instanceof Boolean && (Boolean) condicion) {
            for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                visit(sent);
            }
        }
        return null;
    }

    @Override
    public Object visitExpresion(Codex_latinusParser.ExpresionContext ctx) {
        if (ctx.termino().size() == 1) {
            return visit(ctx.termino(0));
        }
        try {
            Object izq = visit(ctx.termino(0));
            Object der = visit(ctx.termino(1));
            String op = ctx.getChild(1).getText();

            if (izq instanceof Number && der instanceof Number) {
                double v1 = ((Number) izq).doubleValue();
                double v2 = ((Number) der).doubleValue();
                switch (op) {
                    case "*": return v1 * v2;
                    case "+": return v1 + v2;
                    case "-": return v1 - v2;
                    case "/": return v1 / v2;
                }
            }
            if (op.equals(">=")) {
                return ((Number) izq).doubleValue() >= ((Number) der).doubleValue();
            }
        } catch (Exception ignored) {}

        return visitChildren(ctx);
    }

    @Override
    public Object visitTermino(Codex_latinusParser.TerminoContext ctx) {
        if (ctx.VARIABLE() != null) {
            return memory.getOrDefault(ctx.VARIABLE().getText(), 0);
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

        Map<String, Object> backupMemory = new HashMap<>(memory);
        if (funcCtx.ratio_funcion() != null && funcCtx.ratio_funcion().parametros() != null) {
            var params = funcCtx.ratio_funcion().parametros().parametro();
            var args = ctx.argumentos().expresion();
            for (int i = 0; i < params.size(); i++) {
                String paramName = params.get(i).VARIABLE(0).getText();
                Object argVal = visit(args.get(i));
                memory.put(paramName, argVal);
            }
        }

        Object resultadoFuncion = null;

        for (ParseTree child : funcCtx.children) {
            if (child instanceof Codex_latinusParser.VariablesContext) {
                visit(child);
            }
            if (child instanceof Codex_latinusParser.MaiorContext || child instanceof Codex_latinusParser.SentenciaContext) {
                visit(child);
            }
            if (child.getText().startsWith("reddere")) {
                resultadoFuncion = visit(child.getChild(1));
                break;
            }
        }

        memory.clear();
        memory.putAll(backupMemory);
        return resultadoFuncion;
    }

    private String limpiarCadena(String cad) {
        if (cad.startsWith("\"") && cad.endsWith("\"")) {
            return cad.substring(1, cad.length() - 1);
        }
        return cad;
    }
}