package codex_latinus.backend.symbols;

import java.util.ArrayList;
import java.util.List;

public class Symbol {
    private final String name;
    private String type;
    private final String category;
    private final int numParameters;
    private final List<String> parameterTypes;
    private final int size;
    private final Scope scope;
    private final int line;
    private final int column;

    // Constructor para funciones con tipos de parámetros detallados
    public Symbol(String name, String type, String category, int numParameters, List<String> parameterTypes, int size, Scope scope, int line, int column) {
        this.name = name;
        this.type = type;
        this.category = category;
        this.numParameters = numParameters;
        this.parameterTypes = parameterTypes != null ? parameterTypes : new ArrayList<>();
        this.size = size;
        this.scope = scope;
        this.line = line;
        this.column = column;
    }

    // Constructor para funciones o arreglos básicos
    public Symbol(String name, String type, String category, int numParameters, Scope scope, int line, int column) {
        this(name, type, category, numParameters, new ArrayList<>(), 0, scope, line, column);
    }

    // Constructor estándar para variables y parámetros
    public Symbol(String name, String type, String category, Scope scope, int line, int column) {
        this(name, type, category, 0, new ArrayList<>(), 0, scope, line, column);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public int getNumParameters() {
        return numParameters;
    }

    public List<String> getParameterTypes() {
        return parameterTypes;
    }

    public int getSize() {
        return size;
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