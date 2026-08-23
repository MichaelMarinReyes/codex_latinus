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

    /**
     * Obtiene la lista unificada de errores de compilación encontrados durante el análisis
     * (léxicos, sintácticos y semánticos).
     *
     * @return Una lista con los objetos {@link CompilationError} detectados.
     */
    public List<CompilationError> getCompilationErrors() {
        return compilationErrors;
    }

    /**
     * Parsea el código fuente proporcionado, ejecutando el análisis léxico, sintáctico y semántico.
     * Asimismo, genera la traducción, el código DOT para el AST y los pasos de la pila.
     * Si el código es idéntico al último analizado, retorna el resultado almacenado en caché.
     *
     * @param code El código fuente en texto plano escrito en Codex Latinus.
     * @return El resultado de la traducción, o un mensaje de error si la compilación falla.
     */
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

        try {
            SymbolTable globalSymbolTable = new SymbolTable();

            // 1. PRIMERO: Análisis Semántico (Llena y valida la tabla de símbolos)
            lastSemanticVisitor = new SemanticAnalyzerVisitor(globalSymbolTable, compilationErrors);
            lastSemanticVisitor.visit(tree);

            // 2. SEGUNDO: Generación / Traducción a Pig Latin utilizando el mismo árbol y tabla poblada
            lastVisitor = new PigLatinVisitor(globalSymbolTable, compilationErrors);
            String traductionResult = lastVisitor.visit(tree);
            lastTraductionResult = (traductionResult != null) ? traductionResult : "";

        } catch (Exception e) {
            lastTraductionResult = "Error interno en el proceso de análisis: " + e.getMessage();
            return lastTraductionResult;
        }

        if (!compilationErrors.isEmpty()) {
            System.out.println(lastTraductionResult);
            lastDotCode = "";
            lastTraductionResult = "Se encontraron errores en el análisis. Revisa la tabla de errores.";
            return lastTraductionResult;
        }

        generateStackSteps(tree);

        DotGenerator dotGenerator = new DotGenerator();
        lastDotCode = dotGenerator.generarDot(tree);

        return lastTraductionResult;
    }

    /**
     * Devuelve el último texto traducido almacenado en memoria tras un análisis exitoso.
     */
    public String getTranslatedText() {
        return lastTraductionResult;
    }

    /**
     * Parsea un nuevo código fuente y devuelve directamente el texto resultante.
     *
     * @param code El código fuente a procesar.
     * @return El texto procesado o traducido.
     */
    public String getTranslatedText(String code) {
        return parseCode(code);
    }

    /**
     * Ejecuta el código fuente utilizando el intérprete automatizado y modularizado ({@link InterpreterVisitor}).
     * Captura la salida estándar generada durante la ejecución del programa.
     *
     * @param code             El código fuente a ejecutar.
     * @param simulatedInputs  Una lista de valores simulados para las entradas requeridas del programa.
     * @return Un String que contiene la salida por consola obtenida durante la ejecución.
     */
    public String executeCode(String code, List<String> simulatedInputs) {
        if (code == null || code.trim().isEmpty()) {
            return "";
        }

        parseCode(code);

        if (!compilationErrors.isEmpty()) {
            return "No se puede ejecutar debido a errores en el código.";
        }

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
            lastInterpreterVisitor = new InterpreterVisitor(symbolTable, compilationErrors);
            lastInterpreterVisitor.visit(tree);
        } catch (Exception e) {
            System.out.println("Error en ejecución: " + e.getMessage());
        } finally {
            System.setOut(oldOut);
        }

        return baos.toString();
    }

    /**
     * Ejecuta el código fuente utilizando el intérprete sin entradas simuladas adicionales.
     *
     * @param code El código fuente a ejecutar.
     * @return La salida por consola resultante de la ejecución.
     */
    public String executeCode(String code) {
        return executeCode(code, new ArrayList<>());
    }

    /**
     * Parsea el código y recupera el historial de estados de la pila generados.
     *
     * @param code El código fuente a analizar.
     * @return Una lista de objetos {@link StackState} que representan los pasos de la pila.
     */
    public List<StackState> getStackSteps(String code) {
        parseCode(code);
        return lastStackSteps;
    }

    /**
     * Método auxiliar privado que recorre el árbol de análisis sintáctico (AST)
     * utilizando un listener para registrar el historial de estados de la pila.
     *
     * @param tree El árbol de análisis sintáctico ({@link ParseTree}).
     */
    private void generateStackSteps(ParseTree tree) {
        if (tree == null) return;
        StackVisualizerListener listener = new StackVisualizerListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);
        lastStackSteps = listener.getHistory();
    }

    /**
     * Retorna la lista con los últimos pasos de la pila calculados.
     *
     * @return Una lista de {@link StackState}.
     */
    public List<StackState> getLastStackSteps() {
        return lastStackSteps;
    }

    /**
     * Obtiene el código en formato DOT correspondiente al último Árbol Sintáctico Abstracto (AST) generado.
     *
     * @return Un String con la sintaxis DOT para Graphviz.
     */
    public String getLastDotCode() {
        return lastDotCode;
    }

    /**
     * Retorna la tabla de símbolos actual, priorizando la instancia del intérprete,
     * la del analizador semántico o la del visitor de traducción.
     *
     * @return La {@link SymbolTable} activa.
     */
    public SymbolTable getSymbolTable() {
        if (lastInterpreterVisitor != null && lastInterpreterVisitor.getSymbolTable() != null) {
            return lastInterpreterVisitor.getSymbolTable();
        }
        if (lastSemanticVisitor != null && lastSemanticVisitor.getSymbolTable() != null) {
            return lastSemanticVisitor.getSymbolTable();
        }
        if (lastVisitor != null && lastVisitor.getSymbolTable() != null) {
            return lastVisitor.getSymbolTable();
        }
        return new SymbolTable();
    }
}