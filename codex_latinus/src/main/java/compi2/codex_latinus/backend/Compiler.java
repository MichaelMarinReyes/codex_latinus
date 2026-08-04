package compi2.codex_latinus.backend;

import compi2.codex_latinus.Codex_latinusLexer;
import compi2.codex_latinus.Codex_latinusParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Compiler {
    public static ParseTree parseCode(String code) {
        CharStream input = CharStreams.fromString(code);

        Codex_latinusLexer lexer = new Codex_latinusLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Codex_latinusParser parser = new Codex_latinusParser(tokens);
        parser.removeErrorListeners();
        return parser.init();
    }
}