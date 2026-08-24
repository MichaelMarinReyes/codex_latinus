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
import codex_latinus.backend.visitors.SemanticAnalyzerVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal del backend que gestiona el flujo completo de compilación,
 * análisis sintáctico, análisis semántico, generación de vistas y ejecución del lenguaje Codex Latinus.
 */
public class Compiler {
    private String lastDotCode = "";
    private final List<CompilationError> compilationErrors = new ArrayList<>();

    private PigLatinVisitor lastVisitor;
    private SemanticAnalyzerVisitor lastSemanticVisitor;
    private InterpreterVisitor lastInterpreterVisitor;
    private List<StackState> lastStackSteps = new ArrayList<>();

    private String lastParsedCode = null;
    private String lastTraductionResult = "";
    private String lastHumanResult = "";

    public List<CompilationError> getCompilationErrors() {
        return compilationErrors;
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
        SymbolTable table = null;

        if (lastInterpreterVisitor != null && lastInterpreterVisitor.getSymbolTable() != null) {
            table = lastInterpreterVisitor.getSymbolTable();
        } else if (lastVisitor != null && lastVisitor.getSymbolTable() != null) {
            table = lastVisitor.getSymbolTable();
        } else {
            table = new SymbolTable();
        }
/*
        // ===================================================
        // LOG DE DEPURACIÓN EN EL BACKEND
        // ===================================================
        System.out.println("=== [DEBUG BACKEND] Tabla de Símbolos en Compiler ===");
        if (table.getCurrentScope() != null && table.getCurrentScope().getSymbols() != null) {
            table.getCurrentScope().getSymbols().forEach((name, symbol) -> {
                System.out.println("Símbolo Guardado -> Nombre: " + symbol.getName() +
                        " | Tipo: " + symbol.getType() +
                        " | Valor: " + symbol.getValue());
            });
        } else {
            System.out.println("El scope actual o los símbolos están en null.");
        }
        System.out.println("=====================================================");
        // ===================================================*/

        return table;
    }

    public String parseCode(String code) {
        if (code != null && code.equals(lastParsedCode) && !lastTraductionResult.isEmpty()) {
            return lastTraductionResult;
        }

        lastParsedCode = code;
        compilationErrors.clear();
        lastDotCode = "";
        lastVisitor = null;
        lastSemanticVisitor = null;
        lastInterpreterVisitor = null;
        lastStackSteps.clear();
        lastHumanResult = "";

        if (code == null || code.trim().isEmpty()) {
            lastTraductionResult = "";
            lastHumanResult = "";
            return lastTraductionResult;
        }

        // 1. GENERACIÓN DEL ÁRBOL (AST) Y LÉXICO/SINTÁCTICO
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

        if (errorListener.hasErrors() || !compilationErrors.isEmpty()) {
            lastDotCode = "";
            lastTraductionResult = formatErrorDetails("Se encontraron errores léxicos o sintácticos:");
            lastHumanResult = lastTraductionResult;
            return lastTraductionResult;
        }

        try {
            SymbolTable globalSymbolTable = new SymbolTable();

            // 2. ANÁLISIS SEMÁNTICO
            lastSemanticVisitor = new SemanticAnalyzerVisitor(globalSymbolTable, compilationErrors);
            lastSemanticVisitor.visit(tree);

            if (!compilationErrors.isEmpty()) {
                lastDotCode = "";
                lastTraductionResult = formatErrorDetails("Se encontraron errores en el análisis semántico:");
                lastHumanResult = lastTraductionResult;
                return lastTraductionResult;
            }

            // 3. GENERACIÓN DE PIG LATIN
            lastVisitor = new PigLatinVisitor(globalSymbolTable);
            String traductionResult = lastVisitor.visit(tree);
            lastTraductionResult = (traductionResult != null) ? traductionResult : "";

            // 4. GENERACIÓN DE TEXTO HUMANO (Utilizando el InterpreterVisitor para simular la salida en consola)
            lastInterpreterVisitor = new InterpreterVisitor(globalSymbolTable, new ArrayList<>());
            lastInterpreterVisitor.visit(tree);
            lastHumanResult = lastInterpreterVisitor.getConsoleOutput();

        } catch (Exception e) {
            lastTraductionResult = "Error interno en el proceso de análisis: " + e.getMessage();
            lastHumanResult = lastTraductionResult;
            return lastTraductionResult;
        }

        generateStackSteps(tree);

        DotGenerator dotGenerator = new DotGenerator();
        lastDotCode = dotGenerator.generarDot(tree);
        return lastTraductionResult;
    }

    private String formatErrorDetails(String header) {
        StringBuilder sb = new StringBuilder(header + "\n");
        for (CompilationError error : compilationErrors) {
            sb.append(" • ").append(error.toString()).append("\n");
        }
        return sb.toString();
    }

    public String getTranslatedText() {
        return lastTraductionResult;
    }

    public String getHumanTranslatedText() {
        return lastHumanResult;
    }

    public String getTranslatedText(String code) {
        return parseCode(code);
    }

    /**
     * Ejecuta el código fuente utilizando el intérprete automatizado ({@link InterpreterVisitor}).
     */
    public String executeCode(String code, List<String> simulatedInputs) {
        if (code == null || code.trim().isEmpty()) {
            return "";
        }

        parseCode(code);

        if (!compilationErrors.isEmpty()) {
            return "No se puede ejecutar debido a errores en el código:\n" + formatErrorDetails("");
        }

        SymbolTable symbolTable = getSymbolTable();

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
            // Se instancia correctamente pasando la tabla y la lista de entradas simuladas del frontend
            lastInterpreterVisitor = new InterpreterVisitor(symbolTable, simulatedInputs);
            lastInterpreterVisitor.visit(tree);
            lastHumanResult = lastInterpreterVisitor.getConsoleOutput();
        } catch (Exception e) {
            System.out.println("Error en ejecución: " + e.getMessage());
        } finally {
            System.setOut(oldOut);
        }

        return baos.toString();
    }

    public String executeCode(String code) {
        return executeCode(code, new ArrayList<>());
    }
}