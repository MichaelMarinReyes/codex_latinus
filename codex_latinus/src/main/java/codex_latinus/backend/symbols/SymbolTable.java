package codex_latinus.backend.symbols;

public class SymbolTable {
    private Scope currentScope;

    public SymbolTable() {
        this.currentScope = new Scope(null, "global");
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
        return currentScope.define(symbol);
    }

    public Symbol resolve(String name) {
        return currentScope.resolve(name);
    }

    public Scope getCurrentScope() {
        return currentScope;
    }
}
