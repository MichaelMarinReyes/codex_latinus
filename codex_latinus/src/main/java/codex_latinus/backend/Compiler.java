package codex_latinus.backend;

import codex_latinus.Codex_latinusLexer;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.errors.CustomErrorListener;
import codex_latinus.backend.stack.StackState;
import codex_latinus.backend.stack.StackVisualizerListener;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.visitors.PigLatinVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

public class Compiler {
    private static String lastDotCode = "";
    private static final List<CompilationError> compilationErrors = new ArrayList<>();
    private PigLatinVisitor lastVisitor;
    private List<StackState> lastStackSteps = new ArrayList<>();

    private String lastParsedCode = null;
    private String lastTraductionResult = "";

    public static List<CompilationError> getCompilationErrors() {
        return compilationErrors;
    }

    public String parseCode(String code) {
        if (code != null && code.equals(lastParsedCode)) {
            return lastTraductionResult;
        }

        lastParsedCode = code;
        compilationErrors.clear();
        lastDotCode = "";
        lastVisitor = null;
        lastStackSteps.clear();

        if (code == null || code.trim().isEmpty()) {
            lastTraductionResult = "";
            return lastTraductionResult;
        }

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
            lastTraductionResult = "Se encontraron errores léxicos o sintácticos. Revisa la tabla de errores.";
            return lastTraductionResult;
        }

        lastVisitor = new PigLatinVisitor();
        String traductionResult = lastVisitor.visit(tree);

        if (!lastVisitor.getSemanticErrors().isEmpty()) {
            compilationErrors.addAll(lastVisitor.getSemanticErrors());
            lastDotCode = "";
            lastVisitor = null;
            lastTraductionResult = "Se encontraron errores semánticos. Revisa la tabla de errores.";
            return lastTraductionResult;
        }

        // Generar pasos de la pila y código DOT una sola vez durante la compilación
        generateStackSteps(tree);

        DotGenerator dotGenerator = new DotGenerator();
        lastDotCode = dotGenerator.generarDot(tree);

        lastTraductionResult = traductionResult;
        return lastTraductionResult;
    }

    public List<StackState> getStackSteps(String code) {
        parseCode(code);
        return lastStackSteps;
    }

    private void generateStackSteps(ParseTree tree) {
        if (tree == null) return;
        StackVisualizerListener listener = new StackVisualizerListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        lastStackSteps = listener.getHistory();
    }

    public List<StackState> getLastStackSteps() {
        return lastStackSteps;
    }

    public String getLastDotCode() {
        return lastDotCode;
    }

    public SymbolTable getSymbolTable() {
        if (lastVisitor != null) {
            return lastVisitor.getSymbolTable();
        }
        return new SymbolTable();
    }
}