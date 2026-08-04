package compi2.codex_latinus.backend;

import compi2.codex_latinus.Codex_latinusBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class PigLatinVisitor extends Codex_latinusBaseVisitor<String> {

    @Override
    public String visitTerminal(TerminalNode node) {
        String text = node.getText();

        if (text.matches("^[a-zA-Z_][a-zA-Z0-9_]*$")) {
            return toPigLatin(text);
        }

        return text;
    }

    private String toPigLatin(String word) {
        String lower = word.toLowerCase();
        char firstChar = lower.charAt(0);

        // Comprobar si es vocal
        if ("aeiou".indexOf(firstChar) != -1) {
            return word + "way";
        } else {
            // Ley de consonantes: mover consonantes iniciales al final + "ay"
            int firstVowelIdx = 0;
            while (firstVowelIdx < lower.length() && "aeiou".indexOf(lower.charAt(firstVowelIdx)) == -1) {
                firstVowelIdx++;
            }
            if (firstVowelIdx == 0 || firstVowelIdx == lower.length()) {
                return word + "ay";
            }
            String consonants = word.substring(0, firstVowelIdx);
            String rest = word.substring(firstVowelIdx);
            return rest + consonants + "ay";
        }
    }
}
