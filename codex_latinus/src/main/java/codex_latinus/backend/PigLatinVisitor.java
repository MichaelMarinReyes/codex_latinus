package codex_latinus.backend;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;

public class PigLatinVisitor extends Codex_latinusBaseVisitor<String> {

    @Override
    public String visitCodex_latinus(Codex_latinusParser.Codex_latinusContext ctx) {
        StringBuilder resultado = new StringBuilder();

        // Recorremos cada elemento principal del programa y acumulamos la traducción
        for (int i = 0; i < ctx.getChildCount(); i++) {
            String trad = visit(ctx.getChild(i));
            if (trad != null) {
                resultado.append(trad).append("\n");
            }
        }

        return resultado.toString();
    }

    @Override
    public String visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx) {
        String nombreVar = ctx.VARIABLE().getFirst().getText();
        String nombreTraducido = aplicarLeyPigLatin(nombreVar);

        return "let " + nombreTraducido + " = ...;";
    }

    // Ejemplo de método auxiliar para aplicar la regla de PigLatin a los identificadores
    private String aplicarLeyPigLatin(String palabra) {
        if (palabra == null || palabra.isEmpty()) return palabra;
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
