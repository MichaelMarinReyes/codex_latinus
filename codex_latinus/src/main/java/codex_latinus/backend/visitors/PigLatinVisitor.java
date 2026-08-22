package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
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
    public String visitInit(Codex_latinusParser.InitContext ctx) {
        StringBuilder sb = new StringBuilder();
        if (ctx.codex_latinus() != null) {
            sb.append(visit(ctx.codex_latinus()));
        }
        return sb.toString();
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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            sb.append(visitGenericElement(child)).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String visitVariables(Codex_latinusParser.VariablesContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule("VARIABILES")).append(" >\n");
        for (Codex_latinusParser.DeclaracionContext dec : ctx.declaracion()) {
            String tradDec = visit(dec);
            if (tradDec != null && !tradDec.isEmpty()) {
                sb.append(tradDec).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx) {
        recordDeclarationInTable(ctx);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String visitArreglo_declaracion(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
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

        int line = ctx.VARIABLE() != null ? ctx.VARIABLE().getSymbol().getLine() : ctx.getStart().getLine();
        int column = ctx.VARIABLE() != null ? ctx.VARIABLE().getSymbol().getCharPositionInLine() : ctx.getStart().getCharPositionInLine();

        Symbol funcSym = new Symbol(nombreFunc, "funcion", "FUNCION", symbolTable.getCurrentScope(), line, column);
        if (!symbolTable.define(funcSym)) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La función '" + nombreFunc + "' ya está declarada.", line, column));
        }

        symbolTable.enterScope("func_" + nombreFunc);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        symbolTable.exitScope();

        return sb.toString().trim();
    }

    @Override
    public String visitActio_funcion(Codex_latinusParser.Actio_funcionContext ctx) {
        String nombreFunc = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "funcion";
        int line = ctx.getStart().getLine();
        int column = ctx.VARIABLE() != null ? ctx.VARIABLE().getSymbol().getCharPositionInLine() : ctx.getStart().getCharPositionInLine();

        Symbol funcSym = new Symbol(nombreFunc, "funcion", "FUNCION", symbolTable.getCurrentScope(), line, column);
        if (!symbolTable.define(funcSym)) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La función '" + nombreFunc + "' ya está declarada.", line, column));
        }

        symbolTable.enterScope("func_" + nombreFunc);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        symbolTable.exitScope();

        return sb.toString().trim();
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
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();
            if (text.equals(">>")) {
                sb.append("%OINK ");
            } else {
                sb.append(visitGenericElement(child)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();
            if (text.equals("<<")) {
                sb.append("%OINK_OINK ");
            } else {
                sb.append(visitGenericElement(child)).append(" ");
            }
        }
        return sb.toString().trim();
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
            return "";
        }

        if (ctx.expresion() != null) {
            String tipoVariable = sym.getType();
            String tipoValor = getTipoExpresion(ctx.expresion());

            if (!tipoVariable.equalsIgnoreCase(tipoValor) && !tipoValor.equals("desconocido")) {
                semanticErrors.add(new CompilationError("SEMÁNTICO",
                        "Error de tipo: No se puede asignar '" + tipoValor + "' a una variable de tipo '" + tipoVariable + "'.",
                        ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
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
            if (termino.llamada_funcion() != null) {
                Symbol s = symbolTable.resolve(termino.llamada_funcion().VARIABLE().getText());
                return (s != null) ? s.getType() : "desconocido";
            }
        }
        return "desconocido";
    }

    @Override
    public String visitSi_sentencia(Codex_latinusParser.Si_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String visitCiclo_dum(Codex_latinusParser.Ciclo_dumContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String visitCiclo_facere(Codex_latinusParser.Ciclo_facereContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String visitCiclo_per(Codex_latinusParser.Ciclo_perContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String visitSalto_sentencia(Codex_latinusParser.Salto_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
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
            }

            int line = ctx.VARIABLE(0).getSymbol().getLine();
            int column = ctx.VARIABLE(0).getSymbol().getCharPositionInLine();
            String scopeName = symbolTable.getCurrentScope().getScopeName();

            Symbol sym = new Symbol(nameVar, dataType, "VARIABLE", symbolTable.getCurrentScope(), line, column);

            if (!symbolTable.define(sym)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + nameVar + "' ya ha sido declarada en este ámbito.", line, column));
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
            return res != null ? res : "";
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
