package codex_latinus.backend.symbols;

public class Symbol {
    private final String name;
    private final String type;
    private final String category;
    private final Scope scope;
    private final int line;
    private final int column;

    public Symbol(String name, String type, String category, Scope scope, int line, int column) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.scope = scope;
        this.line = line;
        this.column = column;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public Scope getScope() {
        return scope;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
