package codex_latinus.backend.symbols;

public class TypeInfo {
    private final String name;
    private final int sizeInBytes;

    public TypeInfo(String name, int sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }

    public String getName() {
        return name;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }
}