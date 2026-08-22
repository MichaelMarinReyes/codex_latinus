package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class PigLatinVisitor extends Codex_latinusBaseVisitor<String> {

    private final SymbolTable symbolTable = new SymbolTable();
    private final List<CompilationError> semanticErrors = new ArrayList<>();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public List<CompilationError> getSemanticErrors() {
        return semanticErrors;
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        return aggregate + " " + nextResult;
    }

    @Override
    public String visitInit(Codex_latinusParser.InitContext ctx) {
        if (ctx.codex_latinus() != null) {
            return visit(ctx.codex_latinus());
        }
        return "";
    }

    @Override
    public String visitCodex_latinus(Codex_latinusParser.Codex_latinusContext ctx) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            String trad = visit(ctx.getChild(i));
            if (trad != null && !trad.isEmpty()) {
                resultado.append(trad).append("\n");
            }
        }
        return resultado.toString();
    }

    @Override
    public String visitStructura_def(Codex_latinusParser.Structura_defContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule("structura")).append(" ");
        sb.append(visit(ctx.VARIABLE())).append(" ");
        sb.append("{ ");
        for (Codex_latinusParser.Miembro_structuraContext miembro : ctx.miembro_structura()) {
            sb.append(visit(miembro)).append(" ");
        }
        sb.append("} ");
        sb.append(applyPigLatinRule(ctx.FINIS().getText())).append(";");
        return sb.toString();
    }

    @Override
    public String visitMiembro_structura(Codex_latinusParser.Miembro_structuraContext ctx) {
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitVariables(Codex_latinusParser.VariablesContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String trad = visitGenericElement(child);
            if (trad != null && !trad.isEmpty()) {
                // Evitamos doble espacio antes del salto de línea si aplica
                if (trad.equals("[") || trad.equals(">")) {
                    sb.append(trad).append("\n");
                } else if (child instanceof Codex_latinusParser.DeclaracionContext || child instanceof Codex_latinusParser.Arreglo_declaracionContext) {
                    sb.append(trad).append("\n");
                } else {
                    sb.append(trad);
                }
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx) {
        recordDeclarationInTable(ctx);
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitArreglo_declaracion(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        recordArrayDeclarationInTable(ctx);
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitMunera(Codex_latinusParser.MuneraContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule("MUNERA")).append(" >\n");
        for (Codex_latinusParser.FuncionContext func : ctx.funcion()) {
            sb.append(visit(func)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitFuncion(Codex_latinusParser.FuncionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitRatio_funcion(Codex_latinusParser.Ratio_funcionContext ctx) {
        String nombreFunc = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "funcion";
        String tipoRetorno = ctx.tipo_dato() != null ? ctx.tipo_dato().getText() : "void";
        int column = ctx.VARIABLE() != null ? ctx.VARIABLE().getSymbol().getCharPositionInLine() : ctx.getStart().getCharPositionInLine();

        return processFunction(nombreFunc, tipoRetorno, ctx, ctx.parametros(), column);
    }

    @Override
    public String visitActio_funcion(Codex_latinusParser.Actio_funcionContext ctx) {
        String nombreFunc = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "funcion";
        int column = ctx.VARIABLE() != null ? ctx.VARIABLE().getSymbol().getCharPositionInLine() : ctx.getStart().getCharPositionInLine();

        return processFunction(nombreFunc, "void", ctx, ctx.parametros(), column);
    }

    @Override
    public String visitMaior(Codex_latinusParser.MaiorContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule("MAIOR")).append(" >\n");
        for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
            String tradSent = visit(sent);
            if (tradSent != null) {
                sb.append(tradSent).append("\n");
            }
        }
        sb.append(applyPigLatinRule("finis")).append(";");
        return sb.toString();
    }

    @Override
    public String visitSentencia(Codex_latinusParser.SentenciaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();

            if (">>".equals(text)) {
                if (first) {
                    sb.append("%OINK ");
                    first = false;
                } else {
                    sb.append(" >> ");
                }
            } else {
                String trad = visitGenericElement(child);
                if (trad != null && !trad.isEmpty() && !trad.equals(";")) {
                    sb.append(trad).append(" ");
                }
            }
        }

        String resultado = sb.toString().trim();
        if (!resultado.endsWith(";")) {
            resultado += ";";
        }

        return resultado;
    }

    @Override
    public String visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();
            if ("<<".equals(text)) {
                sb.append("%OINK_OINK ");
            } else {
                sb.append(visitGenericElement(child)).append(" ");
            }
        }
        String res = sb.toString().trim();
        if (!res.endsWith(";")) {
            res += ";";
        }
        return res;
    }

    @Override
    public String visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
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
            return visitChildrenGeneric(ctx);
        }

        if (ctx.expresion() != null) {
            String tipoVariable = sym.getType();
            String tipoValor = getTipoExpresion(ctx.expresion());

            boolean compatible = symbolTable.getTypeTable().areTypesCompatible(tipoVariable, tipoValor);
            if (!compatible && !"desconocido".equals(tipoValor)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO",
                        "Error de tipo: No se puede asignar '" + tipoValor + "' a una variable de tipo '" + tipoVariable + "'.",
                        ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            } else if ("desconocido".equals(tipoVariable) && !"desconocido".equals(tipoValor)) {
                symbolTable.updateSymbolType(varName, tipoValor);
            }
        }

        return visitChildrenGeneric(ctx);
    }

    private String getTipoExpresion(Codex_latinusParser.ExpresionContext ctx) {
        if (ctx.termino() != null && !ctx.termino().isEmpty()) {
            Codex_latinusParser.TerminoContext termino = ctx.termino(0);

            if (termino.VARIABLE() != null) {
                Symbol s = symbolTable.resolve(termino.VARIABLE().getText());
                return (s != null) ? s.getType() : "desconocido";
            }
            if (termino.NUMERO_ENTERO() != null) return "numerus";
            if (termino.NUMERO_DECIMAL() != null) return "decimalis";
            if (termino.VERUM() != null || termino.FALSUS() != null) return "verum";
            if (termino.CADENA_TEXTO() != null) return "textum";
            if (termino.CARACTER() != null) return "littera";

            if (termino.llamada_funcion() != null) {
                String funcName = termino.llamada_funcion().VARIABLE().getText();
                Symbol s = symbolTable.resolve(funcName);
                return (s != null) ? s.getType() : "desconocido";
            }
        }
        return "numerus";
    }

    @Override
    public String visitSi_sentencia(Codex_latinusParser.Si_sentenciaContext ctx) {
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitCiclo_dum(Codex_latinusParser.Ciclo_dumContext ctx) {
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitCiclo_facere(Codex_latinusParser.Ciclo_facereContext ctx) {
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitCiclo_per(Codex_latinusParser.Ciclo_perContext ctx) {
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitSalto_sentencia(Codex_latinusParser.Salto_sentenciaContext ctx) {
        return visitChildrenGeneric(ctx);
    }

    private String visitChildrenGeneric(ParserRuleContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    private String processFunction(String nombreFunc, String tipoRetorno, ParserRuleContext ctx, Codex_latinusParser.ParametrosContext parametrosCtx, int column) {
        int line = ctx.getStart().getLine();

        int numParams = 0;
        List<String> paramTypes = new ArrayList<>();

        if (parametrosCtx != null && parametrosCtx.parametro() != null) {
            numParams = parametrosCtx.parametro().size();
            for (Codex_latinusParser.ParametroContext paramCtx : parametrosCtx.parametro()) {
                if (paramCtx.tipo_dato() != null) {
                    paramTypes.add(paramCtx.tipo_dato().getText());
                } else {
                    paramTypes.add("desconocido");
                }
            }
        }

        Symbol funcSym = new Symbol(nombreFunc, tipoRetorno, "FUNCION", numParams, paramTypes, 0, symbolTable.getCurrentScope(), line, column);
        if (!symbolTable.define(funcSym)) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La función '" + nombreFunc + "' ya está declarada.", line, column));
        }

        symbolTable.enterScope("func_" + nombreFunc);

        if (parametrosCtx != null && parametrosCtx.parametro() != null) {
            for (int i = 0; i < parametrosCtx.parametro().size(); i++) {
                Codex_latinusParser.ParametroContext paramCtx = parametrosCtx.parametro().get(i);
                if (paramCtx.VARIABLE() != null && !paramCtx.VARIABLE().isEmpty()) {
                    String paramName = paramCtx.VARIABLE(0).getText();
                    String paramType = paramTypes.get(i);

                    int pLine = paramCtx.getStart().getLine();
                    int pCol = paramCtx.getStart().getCharPositionInLine();
                    Symbol paramSym = new Symbol(paramName, paramType, "PARAMETRO", symbolTable.getCurrentScope(), pLine, pCol);
                    symbolTable.define(paramSym);
                }
            }
        }

        String result = visitChildrenGeneric(ctx);
        symbolTable.exitScope();

        return result;
    }

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

            if (!dataType.equals("desconocido") && !symbolTable.getTypeTable().exists(dataType)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El tipo '" + dataType + "' no está registrado.", line, column));
            }

            Symbol sym = new Symbol(nameVar, dataType, "VARIABLE", symbolTable.getCurrentScope(), line, column);

            if (!symbolTable.define(sym)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + nameVar + "' ya ha sido declarada.", line, column));
            }
        }
    }

    private void recordArrayDeclarationInTable(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        if (ctx.VARIABLE() != null && !ctx.VARIABLE().isEmpty()) {
            String nameVar = ctx.VARIABLE(0).getText();
            String dataType = ctx.tipo_dato() != null ? ctx.tipo_dato().getText() : "numerus";

            int size = 0;
            if (ctx.NUMERO_ENTERO() != null) {
                try {
                    size = Integer.parseInt(ctx.NUMERO_ENTERO().getText());
                } catch (NumberFormatException ignored) {}
            }

            int line = ctx.VARIABLE(0).getSymbol().getLine();
            int column = ctx.VARIABLE(0).getSymbol().getCharPositionInLine();

            if (!symbolTable.getTypeTable().exists(dataType)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El tipo de arreglo '" + dataType + "' no está registrado.", line, column));
            }

            Symbol sym = new Symbol(nameVar, dataType, "ARREGLO", 0, new ArrayList<>(), size, symbolTable.getCurrentScope(), line, column);

            if (!symbolTable.define(sym)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El arreglo '" + nameVar + "' ya ha sido declarado.", line, column));
            }
        }
    }

    private String visitGenericElement(ParseTree node) {
        if (node instanceof TerminalNode) {
            String text = node.getText();
            if (text.startsWith("\"") && text.endsWith("\"")) {
                return text;
            }
            if (isAlphabeticWord(text)) {
                return applyPigLatinRule(text);
            }
            return text;
        } else {
            String res = visit(node);
            if (res != null && !res.isEmpty()) {
                return res;
            }
            String text = node.getText();
            if (isAlphabeticWord(text)) {
                return applyPigLatinRule(text);
            }
            return text;
        }
    }

    private boolean isAlphabeticWord(String texto) {
        if (texto == null || texto.isEmpty()) return false;
        for (char c : texto.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private String applyPigLatinRule(String palabra) {
        if (palabra == null || palabra.isEmpty()) return palabra;
        if (!isAlphabeticWord(palabra)) return palabra;

        char primera = Character.toLowerCase(palabra.charAt(0));
        boolean esVocal = "aeiou".indexOf(primera) >= 0;

        if (esVocal) {
            return palabra + "way";
        } else {
            int indexVocal = -1;
            for (int i = 0; i < palabra.length(); i++) {
                if ("aeiou".indexOf(Character.toLowerCase(palabra.charAt(i))) >= 0) {
                    indexVocal = i;
                    break;
                }
            }
            if (indexVocal == -1) return palabra + "ay";
            return palabra.substring(indexVocal) + palabra.substring(0, indexVocal) + "ay";
        }
    }
}