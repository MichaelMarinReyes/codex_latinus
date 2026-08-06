package codex_latinus.backend;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class PigLatinVisitor extends Codex_latinusBaseVisitor<String> {

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
    public String visitVariables(Codex_latinusParser.VariablesContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(aplicarLeyPigLatin("VARIABILES")).append(">\n");
        for (Codex_latinusParser.DeclaracionContext dec : ctx.declaracion()) {
            sb.append(visit(dec)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx) {
        // Recorre y traduce cada componente de la declaración de manera estructurada
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitarElementoGenerico(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String visitMunera(Codex_latinusParser.MuneraContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(aplicarLeyPigLatin("MUNERA")).append(">\n");
        for (Codex_latinusParser.FuncionContext func : ctx.funcion()) {
            sb.append(visit(func)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitFuncion(Codex_latinusParser.FuncionContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitarElementoGenerico(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String visitMaior(Codex_latinusParser.MaiorContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(aplicarLeyPigLatin("MAIOR")).append(">\n");
        for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
            String tradSent = visit(sent);
            if (tradSent != null) {
                sb.append(tradSent).append("\n");
            }
        }
        sb.append(aplicarLeyPigLatin("FINIS")).append(";");
        return sb.toString();
    }

    @Override
    public String visitSentencia(Codex_latinusParser.SentenciaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        // Ley Porcina: Imprimir texto pasa a ser %OINK en lugar de >>
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();
            if (text.equals(">>")) {
                sb.append("%OINK ");
            } else {
                sb.append(visitarElementoGenerico(child)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        // Ley Porcina: Leer texto pasa a ser %OINK_OINK en lugar de <<
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();
            if (text.equals("<<")) {
                sb.append("%OINK_OINK ");
            } else {
                sb.append(visitarElementoGenerico(child)).append(" ");
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitarElementoGenerico(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    @Override
    public String visitSi_sentencia(Codex_latinusParser.Si_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitarElementoGenerico(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    // Método general para evaluar cada nodo terminal (palabras clave, identificadores, símbolos)
    private String visitarElementoGenerico(ParseTree node) {
        if (node instanceof TerminalNode) {
            String text = node.getText();
            // Si el texto es una palabra puramente alfabética (variable o palabra reservada), se traduce
            if (esPalabraAlfabetica(text)) {
                return aplicarLeyPigLatin(text);
            }
            // Los símbolos, operadores, números y cadenas literales ("...") se quedan intactos
            return text;
        } else {
            String res = visit(node);
            return res != null ? res : "";
        }
    }

    private boolean esPalabraAlfabetica(String texto) {
        if (texto == null || texto.isEmpty()) return false;
        for (char c : texto.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    // Aplica las leyes de vocales y consonantes de PigLatin
    private String aplicarLeyPigLatin(String palabra) {
        if (palabra == null || palabra.isEmpty()) return palabra;
        if (!esPalabraAlfabetica(palabra)) return palabra;

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
