package codex_latinus.backend.symbols;

import java.util.HashMap;
import java.util.Map;

public class TypeTable {

    private final Map<String, TypeInfo> types;

    public TypeTable() {
        this.types = new HashMap<>();
        registrarTiposPrimitivos();
    }

    private void registrarTiposPrimitivos() {
        defineType(new TypeInfo("numerus", 4));
        defineType(new TypeInfo("decimalis", 8));
        defineType(new TypeInfo("textum", 4));
        defineType(new TypeInfo("littera", 2));
        defineType(new TypeInfo("verum", 1));
        defineType(new TypeInfo("falsus", 1));
        defineType(new TypeInfo("void", 0));
    }

    public boolean defineType(TypeInfo typeInfo) {
        if (types.containsKey(typeInfo.getName().toLowerCase())) {
            return false;
        }
        types.put(typeInfo.getName().toLowerCase(), typeInfo);
        return true;
    }

    public TypeInfo resolveType(String name) {
        if (name == null) return null;
        return types.get(name.toLowerCase());
    }

    public boolean exists(String name) {
        return resolveType(name) != null;
    }

    public boolean areTypesCompatible(String targetType, String sourceType) {
        if (targetType == null || sourceType == null) return false;

        targetType = targetType.toLowerCase();
        sourceType = sourceType.toLowerCase();

        if (targetType.equals(sourceType)) {
            return true;
        }

        if (targetType.equals("decimalis") && sourceType.equals("numerus")) {
            return true;
        }

        return false;
    }
}