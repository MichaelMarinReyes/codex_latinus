package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.symbols.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Visitante encargado de traducir el código fuente de Codex Latinus a Pig Latin
 * recorriendo estrictamente el Árbol de Análisis Sintáctico (AST), sin usar regex ni replace.
 */
public class PigLatinVisitor extends Codex_latinusBaseVisitor<String> {

    private final SymbolTable symbolTable;

    public PigLatinVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        return aggregate + " " + nextResult;
    }

    @Override
    public String visitInit(Codex_latinusParser.InitContext ctx) {
        return visitChildren(ctx);
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
        return resultado.toString().trim();
    }
/*
    @Override
    public Object visitReddere(Codex_latinusParser.Reddere_sentenciaContext ctx) {
        return visitChildren(ctx);
    }*/

    @Override
    public String visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();
            if (text.equals(">>")) {
                sb.append("%OINK");
            } else {
                String res = visit(child);
                if (res != null && !res.isEmpty()) {
                    sb.append(res);
                }
            }
            if (i < ctx.getChildCount() - 1 && !text.equals(";")) {
                sb.append(" ");
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
                sb.append("%OINK_OINK");
            } else {
                String res = visit(child);
                if (res != null && !res.isEmpty()) {
                    sb.append(res);
                }
            }
            if (i < ctx.getChildCount() - 1 && !text.equals(";")) {
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    /**
     * Intercepta cualquier nodo terminal (palabras clave, identificadores, tipos de datos)
     * y aplica dinámicamente las leyes de vocales y consonantes de Pig Latin.
     * Respeta los símbolos, números y literales de texto intactos.
     */
    @Override
    public String visitTerminal(TerminalNode node) {
        String text = node.getText();
        if (text == null || text.isEmpty()) return "";

        // Si es una cadena de texto literal o un carácter, se mantiene intacto
        if ((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("'") && text.endsWith("'"))) {
            return text;
        }

        // Si es una palabra alfabética (palabra reservada o identificador), se traduce
        if (isAlphabeticWord(text)) {
            return applyPigLatinRule(text);
        }

        // Símbolos y números se devuelven tal cual
        return text;
    }

    public String visitChildren(ParserRuleContext node) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree child = node.getChild(i);
            String res = visit(child);
            if (res != null && !res.isEmpty()) {
                if (sb.length() > 0 && !res.equals(";") && !res.equals(")")) {
                    sb.append(" ");
                }
                sb.append(res);
            }
        }
        return sb.toString().trim();
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

    /**
     * Aplica la Ley de Vocales y la Ley de Consonantes del Pig Latin.
     */
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