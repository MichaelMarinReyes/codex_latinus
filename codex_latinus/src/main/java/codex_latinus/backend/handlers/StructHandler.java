package codex_latinus.backend.handlers;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.utils.TypeChecker;

import java.util.*;

public class StructHandler {

    // Estructuras de datos internas para almacenar definiciones de estructuras
    public static class StructField {
        private final String name;
        private final String type;
        private final boolean isSeries;
        private final int arraySize;

        public StructField(String name, String type, boolean isSeries, int arraySize) {
            this.name = name.toLowerCase();
            this.type = type.toLowerCase();
            this.isSeries = isSeries;
            this.arraySize = arraySize;
        }

        public String getName() { return name; }
        public String getType() { return type; }
        public boolean isSeries() { return isSeries; }
        public int getArraySize() { return arraySize; }
    }

    public static class StructDefinition {
        private final String name;
        private final Map<String, StructField> fields = new LinkedHashMap<>();

        public StructDefinition(String name) {
            this.name = name;
        }

        public String getName() { return name; }
        public Map<String, StructField> getFields() { return fields; }

        public boolean addField(StructField field) {
            if (fields.containsKey(field.getName())) {
                return false; // Ya existe el atributo duplicado
            }
            fields.put(field.getName(), field);
            return true;
        }
    }

    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;
    private final TypeChecker typeChecker;

    // Registro global de estructuras definidas en el programa
    private final Map<String, StructDefinition> structRegistry = new HashMap<>();

    public StructHandler(SymbolTable symbolTable, List<CompilationError> semanticErrors, TypeChecker typeChecker) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
        this.typeChecker = typeChecker != null ? typeChecker : new TypeChecker(this.symbolTable, this.semanticErrors);
    }

    public Map<String, StructDefinition> getStructRegistry() {
        return structRegistry;
    }

    /**
     * 1. Procesa y registra la definición de una estructura, validando que no se repitan atributos.
     */
    public void handleStructDef(Codex_latinusParser.Structura_defContext ctx) {
        if (ctx.VARIABLE() == null) return;
        String structName = ctx.VARIABLE().getText();
        int line = ctx.getStart().getLine();
        int column = ctx.getStart().getCharPositionInLine();

        if (structRegistry.containsKey(structName)) {
            semanticErrors.add(new CompilationError("SEMÁNTICO",
                    "La estructura '" + structName + "' ya ha sido definida anteriormente.", line, column));
            return;
        }

        StructDefinition structDef = new StructDefinition(structName);

        if (ctx.miembro_structura() != null) {
            for (Codex_latinusParser.Miembro_structuraContext miembro : ctx.miembro_structura()) {
                parsearMiembroStructura(miembro, structDef);
            }
        }

        structRegistry.put(structName, structDef);
    }

    private void parsearMiembroStructura(Codex_latinusParser.Miembro_structuraContext miembro, StructDefinition structDef) {
        int line = miembro.getStart().getLine();
        int column = miembro.getStart().getCharPositionInLine();

        String fieldName = "";
        String fieldType = "";
        boolean isSeries = false;
        int arraySize = 0;

        List<org.antlr.v4.runtime.tree.TerminalNode> vars = miembro.VARIABLE();

        // Determinar si es un miembro de tipo 'esto' o 'series'
        if (miembro.SERIES() != null) {
            isSeries = true;
            if (vars.size() >= 2) {
                fieldName = vars.get(0).getText();
                fieldType = vars.get(1).getText();
            } else if (vars.size() == 1) {
                fieldName = vars.get(0).getText();
                if (miembro.tipo_dato() != null) {
                    fieldType = miembro.tipo_dato().getText();
                }
            }
            if (miembro.NUMERO_ENTERO() != null) {
                try {
                    arraySize = Integer.parseInt(miembro.NUMERO_ENTERO().getText());
                } catch (NumberFormatException ignored) {}
            }
        } else {
            // Es de tipo 'esto'
            if (vars.size() >= 2) {
                fieldName = vars.get(0).getText();
                fieldType = vars.get(1).getText();
            } else if (vars.size() == 1) {
                fieldName = vars.get(0).getText();
                if (miembro.tipo_dato() != null) {
                    fieldType = miembro.tipo_dato().getText();
                }
            }
        }

        if (!fieldName.isEmpty()) {
            StructField field = new StructField(fieldName, fieldType, isSeries, arraySize);
            boolean added = structDef.addField(field);
            if (!added) {
                semanticErrors.add(new CompilationError("SEMÁNTICO",
                        "Error de definición: El atributo '" + fieldName + "' está repetido en la estructura '" + structDef.getName() + "'.", line, column));
            }
        }
    }

    /**
     * 2. Valida la instanciación de una estructura
     */
    public void validarInstanciacionStruct(String structTypeName, Codex_latinusParser.Structura_instanciacionContext instCtx, int line, int column) {
        StructDefinition def = structRegistry.get(structTypeName);
        if (def == null) {
            semanticErrors.add(new CompilationError("SEMÁNTICO",
                    "Tipo de estructura desconocido o no declarado: '" + structTypeName + "'.", line, column));
            return;
        }

        if (instCtx.atributo_asignacion() == null) {
            semanticErrors.add(new CompilationError("SEMÁNTICO",
                    "Faltan los atributos para inicializar la estructura '" + structTypeName + "'.", line, column));
            return;
        }

        // Mapear los atributos provistos en la instanciación (sin importar el orden)
        Map<String, Codex_latinusParser.Atributo_asignacionContext> atributosProporcionados = new HashMap<>();
        for (Codex_latinusParser.Atributo_asignacionContext atrib : instCtx.atributo_asignacion()) {
            if (atrib.VARIABLE() != null) {
                atributosProporcionados.put(atrib.VARIABLE().getText().toLowerCase(), atrib);
            }
        }

        // Verificar que TODOS los atributos requeridos tengan un valor explícito y validar sus tipos
        for (StructField requiredField : def.getFields().values()) {
            if (!atributosProporcionados.containsKey(requiredField.getName())) {
                semanticErrors.add(new CompilationError("SEMÁNTICO",
                        "Falta el atributo obligatorio '" + requiredField.getName() + "' en la instanciación de '" + structTypeName + "'.", line, column));
            } else {
                Codex_latinusParser.Atributo_asignacionContext atribCtx = atributosProporcionados.get(requiredField.getName());
                validarAtributoValor(requiredField, atribCtx);
                atributosProporcionados.remove(requiredField.getName());
            }
        }

        // Detectar si se pasaron atributos que no pertenecen a la estructura
        for (String extraAttr : atributosProporcionados.keySet()) {
            Codex_latinusParser.Atributo_asignacionContext atribCtx = atributosProporcionados.get(extraAttr);
            semanticErrors.add(new CompilationError("SEMÁNTICO",
                    "Atributo desconocido '" + extraAttr + "' para la estructura '" + structTypeName + "'.",
                    atribCtx.getStart().getLine(), atribCtx.getStart().getCharPositionInLine()));
        }
    }

    private void validarAtributoValor(StructField field, Codex_latinusParser.Atributo_asignacionContext atribCtx) {
        int line = atribCtx.getStart().getLine();
        int col = atribCtx.getStart().getCharPositionInLine();

        if (field.isSeries()) {
            // Puede ser inicializado con un arreglo literal o una instanciación de arreglo (ej. Animal[7])
            if (atribCtx.structura_instanciacion() != null) {
                Codex_latinusParser.Structura_instanciacionContext sInst = atribCtx.structura_instanciacion();
                if (sInst.VARIABLE() != null) {
                    String tipoArreglo = sInst.VARIABLE().getText();
                    if (!tipoArreglo.equalsIgnoreCase(field.getType())) {
                        semanticErrors.add(new CompilationError("SEMÁNTICO",
                                "Error de tipo en serie: Se esperaba un arreglo de tipo '" + field.getType() + "' pero se asignó '" + tipoArreglo + "'.", line, col));
                    }
                }
            } else if (atribCtx.arreglo_literal() == null) {
                semanticErrors.add(new CompilationError("SEMÁNTICO",
                        "El atributo serie '" + field.getName() + "' requiere una asignación de arreglo válida.", line, col));
            }
        } else {
            if (atribCtx.structura_instanciacion() != null) {
                validarInstanciacionStruct(field.getType(), atribCtx.structura_instanciacion(), line, col);
            } else if (atribCtx.expresion() != null) {
                String tipoVal = typeChecker.getTipoExpresion(atribCtx.expresion());
                if (!esTipoCompatible(field.getType(), tipoVal)) {
                    semanticErrors.add(new CompilationError("SEMÁNTICO",
                            "Error de tipo en atributo '" + field.getName() + "': Se esperaba '" + field.getType() + "' y se recibió '" + tipoVal + "'.", line, col));
                }
            }
        }
    }

    private boolean esTipoCompatible(String targetType, String valType) {
        targetType = targetType.toLowerCase();
        valType = valType.toLowerCase();
        if (targetType.equals(valType) || targetType.equals("desconocido") || valType.equals("desconocido")) return true;
        if (targetType.equals("decimalis") && valType.equals("numerus")) return true;

        boolean targetBool = targetType.equals("boolean") || targetType.equals("verum") || targetType.equals("falsus");
        boolean valBool = valType.equals("boolean") || valType.equals("verum") || valType.equals("falsus");
        if (targetBool && valBool) return true;

        return false;
    }
}