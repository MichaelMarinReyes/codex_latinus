package codex_latinus.backend;

import codex_latinus.Codex_latinusLexer;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.errors.CustomErrorListener;
import codex_latinus.backend.stack.StackState;
import codex_latinus.backend.stack.StackVisualizerListener;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.visitors.InterpreterVisitor;
import codex_latinus.backend.visitors.PigLatinVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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

        generateStackSteps(tree);

        DotGenerator dotGenerator = new DotGenerator();
        lastDotCode = dotGenerator.generarDot(tree);

        lastTraductionResult = traductionResult;

        return lastTraductionResult;
    }

    /**
     * Devuelve el último texto traducido almacenado.
     */
    public String getTranslatedText() {
        return lastTraductionResult;
    }

    /**
     * Parsea el código y devuelve directamente el texto traducido.
     */
    public String getTranslatedText(String code) {
        return parseCode(code);
    }

    /**
     * Ejecuta el código utilizando el InterpreterVisitor de forma automatizada.
     * @param code El código fuente en Codex Latinus
     * @param simulatedInputs Lista de valores que responderán automáticamente a las peticiones
     */
    public String executeCode(String code, List<String> simulatedInputs) {
        if (code == null || code.trim().isEmpty()) {
            return "";
        }

        parseCode(code);

        SymbolTable symbolTable = getSymbolTable();

        InterpreterVisitor.setInputs(simulatedInputs);

        CharStream input = CharStreams.fromString(code);
        Codex_latinusLexer lexer = new Codex_latinusLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Codex_latinusParser parser = new Codex_latinusParser(tokens);
        ParseTree tree = parser.init();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        PrintStream oldOut = System.out;
        System.setOut(printStream);

        try {
            InterpreterVisitor interpreter = new InterpreterVisitor();
            interpreter.setSymbolTable(symbolTable);
            interpreter.visit(tree);
        } catch (Exception e) {
            System.out.println("Error en ejecución: " + e.getMessage());
        } finally {
            System.setOut(oldOut);
        }

        String executeResult = baos.toString();
        return executeResult;
    }

    /**
     * Sobrecarga de executeCode sin parámetros adicionales (usa entradas vacías o por defecto).
     */
    public String executeCode(String code) {
        return executeCode(code, new ArrayList<>());
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