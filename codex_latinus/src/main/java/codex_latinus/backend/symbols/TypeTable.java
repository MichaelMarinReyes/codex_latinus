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
        defineType(new TypeInfo("boolean", 1));
        defineType(new TypeInfo("void", 0));
    }

    public boolean defineType(TypeInfo typeInfo) {
        if (typeInfo == null || typeInfo.getName() == null) return false;
        String key = typeInfo.getName().toLowerCase();
        if (types.containsKey(key)) {
            return false;
        }
        types.put(key, typeInfo);
        return true;
    }

    public TypeInfo resolveType(String name) {
        if (name == null) return null;
        String normalizedName = name.toLowerCase();

        if (normalizedName.equals("verum") || normalizedName.equals("falsus")) {
            normalizedName = "boolean";
        }

        return types.get(normalizedName);
    }

    public boolean exists(String name) {
        return resolveType(name) != null;
    }

    public boolean areTypesCompatible(String targetType, String sourceType) {
        if (targetType == null || sourceType == null) return false;

        targetType = targetType.toLowerCase();
        sourceType = sourceType.toLowerCase();

        if (targetType.equals("verum") || targetType.equals("falsus")) {
            targetType = "boolean";
        }
        if (sourceType.equals("verum") || sourceType.equals("falsus")) {
            sourceType = "boolean";
        }

        if (targetType.equals(sourceType)) {
            return true;
        }

        if (targetType.equals("decimalis") && sourceType.equals("numerus")) {
            return true;
        }

        return false;
    }

    /**
     * Convierte un literal de texto del lenguaje ("verum" / "falsus") a un Boolean de Java.
     */
    public static Boolean parseBooleanValue(String textValue) {
        if (textValue == null) return null;
        String lower = textValue.trim().toLowerCase();
        if (lower.equals("verum")) {
            return true;
        } else if (lower.equals("falsus")) {
            return false;
        }
        return null;
    }

    /**
     * Convierte un Boolean de Java de vuelta a su representación en Codex Latinus.
     */
    public static String toCodexBoolean(boolean javaBoolean) {
        return javaBoolean ? "verum" : "falsus";
    }
}