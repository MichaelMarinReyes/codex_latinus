package codex_latinus.backend.errors;

public class CompilationError {
    private String type;
    private String message;
    private int line;
    private int column;

    public CompilationError(String type, String message, int line, int column) {
        this.type = type;
        this.message = message;
        this.line = line;
        this.column = column;
    }

    public String getType() { return type; }
    public String getMessage() { return message; }
    public int getLine() { return line; }
    public int getColumn() { return column; }

    @Override
    public String toString() {
        return String.format("[%s] Error: %s [Línea: %d, Columna: %d]", type, message, line, column);
    }
}
