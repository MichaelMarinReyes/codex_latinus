package codex_latinus.backend.symbols;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private final Map<String, Symbol> symbols = new HashMap<>();
    private final Scope parent;
    private final String scopeName;

    public Scope(Scope parent, String scopeName) {
        this.parent = parent;
        this.scopeName = scopeName;
    }

    // Inserta un símbolo en el ámbito actual. Retorna false si ya existe.
    public boolean define(Symbol symbol) {
        if (this.symbols.containsKey(symbol.getName())) {
            return false;
        }
        this.symbols.put(symbol.getName(), symbol);
        return true;
    }

    // Busca un símbolo recursivamente hacia los ámbitos padres
    public Symbol resolve(String name) {
        Symbol sym = symbols.get(name);
        if (sym != null) {
            return sym;
        }
        if (parent != null) {
            return parent.resolve(name);
        }
        return null;
    }

    public Scope getParent() {
        return parent;
    }

    public String getScopeName() {
        return scopeName;
    }

    public Map<String, Symbol> getSymbols() {
        return symbols;
    }
}
