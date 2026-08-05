package codex_latinus.backend;

import codex_latinus.Codex_latinusLexer;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.errors.CustomErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class Compiler {
    private static String lastDotCode = "";
    private static List<CompilationError> compilationErrors = new ArrayList<>();

    public String parseCode(String code) {
        compilationErrors.clear();
        lastDotCode = "";

        CharStream input = CharStreams.fromString(code);

        Codex_latinusLexer lexer = new Codex_latinusLexer(input);
        lexer.removeErrorListeners();

        CustomErrorListener errorListener = new CustomErrorListener(compilationErrors);
        lexer.addErrorListener(errorListener);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        Codex_latinusParser parser = new Codex_latinusParser(tokens);
        parser.removeErrorListeners();

        parser.addErrorListener(errorListener);

        ParseTree tree = parser.init();

        if (errorListener.hasErrors()) {
            return "Se encontraron errores léxicos o sintácticos. Revisa la tabla de errores.";
        }

        DotGenerator dotGenerator = new DotGenerator();
        lastDotCode = dotGenerator.generarDot(tree);

        PigLatinVisitor visitor = new PigLatinVisitor();
        return (String) visitor.visit(tree);
    }

    public String getLastDotCode() {
        return lastDotCode;
    }

    public static List<CompilationError> getCompilationErrors() {
        return compilationErrors;
    }
}