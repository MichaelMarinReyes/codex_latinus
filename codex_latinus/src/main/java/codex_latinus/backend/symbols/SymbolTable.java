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

    /**
     * Define un símbolo en el ámbito actual, validando que su tipo exista
     * en la TypeTable (numerus, decimalis, textum, littera, boolean).
     */
    public boolean define(Symbol symbol) {
        if (symbol.getType() != null) {
            String tipoNormalizado = symbol.getType().toLowerCase();

            // Normalizar literales lógicos al tipo general "boolean"
            if (tipoNormalizado.equals("verum") || tipoNormalizado.equals("falsus")) {
                symbol.setType("boolean");
                tipoNormalizado = "boolean";
            }

            if (!typeTable.exists(tipoNormalizado)) {
                return false;
            }
        }
        return currentScope.define(symbol);
    }

    public Symbol resolve(String name) {
        return currentScope.resolve(name);
    }

    /**
     * Verifica si una variable ya fue declarada estrictamente en el scope ACTUAL.
     * Útil para evitar redeclaraciones en un mismo bloque.
     */
    public boolean isDeclaredInCurrentScope(String name) {
        return currentScope.getSymbols().containsKey(name);
    }

    /**
     * Intenta actualizar el valor de una variable existente, validando
     * que la variable exista y que el tipo del nuevo valor sea compatible.
     *
     * @param name Nombre de la variable
     * @param newValue El nuevo valor a asignar
     * @param valueType El tipo de dato correspondiente al nuevo valor ("numerus", "textum", "decimalis", "littera", "boolean")
     * @return true si se actualizó con éxito, false si no existe o el tipo es incompatible.
     */
    public boolean updateSymbolValue(String name, Object newValue, String valueType) {
        Symbol symbol = resolve(name);
        if (symbol == null) {
            return false;
        }

        if (valueType != null) {
            String normalizedValueType = valueType.toLowerCase();
            if (normalizedValueType.equals("verum") || normalizedValueType.equals("falsus")) {
                normalizedValueType = "boolean";
            }

            if (!typeTable.areTypesCompatible(symbol.getType(), normalizedValueType)) {
                return false;
            }
        }

        symbol.setValue(newValue);
        return true;
    }

    public boolean updateSymbolType(String name, String newType) {
        Symbol symbol = resolve(name);
        if (symbol != null) {
            if (newType != null) {
                String normalizedNewType = newType.toLowerCase();
                if (normalizedNewType.equals("verum") || normalizedNewType.equals("falsus")) {
                    normalizedNewType = "boolean";
                }

                if (typeTable.exists(normalizedNewType)) {
                    symbol.setType(normalizedNewType);
                    return true;
                }
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