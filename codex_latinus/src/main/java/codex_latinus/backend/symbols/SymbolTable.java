package codex_latinus.backend.symbols;

public class SymbolTable {
    private final TypeTable typeTable;
    private Scope currentScope;

    public SymbolTable() {
        this.currentScope = new Scope(null, "global");
        this.typeTable = new TypeTable();
    }

    public void enterScope(String name) {
        currentScope = new Scope(currentScope, name);
    }

    public void exitScope() {
        if (currentScope.getParent() != null) {
            currentScope = currentScope.getParent();
        }
    }

    public boolean define(Symbol symbol) {
        if (symbol.getType() != null) {
            if (!typeTable.exists(symbol.getType())) {
                return false;
            }
        }
        return currentScope.define(symbol);
    }

    public Symbol resolve(String name) {
        return currentScope.resolve(name);
    }

    public boolean updateSymbolType(String name, String newType) {
        Symbol symbol = resolve(name);
        if (symbol != null) {
            if (newType != null && typeTable.exists(newType)) {
                symbol.setType(newType);
                return true;
            }
        }
        return false;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public TypeTable getTypeTable() {
        return typeTable;
    }
}