package codex_latinus.backend.handlers;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.utils.TypeChecker;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class DeclarationHandler {

    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;
    private final TypeChecker typeChecker;

    public DeclarationHandler(SymbolTable symbolTable, List<CompilationError> semanticErrors) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
        this.typeChecker = new TypeChecker(this.symbolTable, this.semanticErrors);
    }

    /**
     * Procesa y registra una declaración de variable estándar en la tabla de símbolos.
     */
    public void recordDeclarationInTable(Codex_latinusParser.DeclaracionContext ctx) {
        if (ctx.VARIABLE() != null && !ctx.VARIABLE().isEmpty()) {
            String nameVar = ctx.VARIABLE(0).getText();
            String dataType = "desconocido";

            if (ctx.tipo_dato() != null) {
                dataType = ctx.tipo_dato().getText();
            } else if (ctx.TEXTUM() != null) {
                dataType = "textum";
            } else if (ctx.LITTERA() != null) {
                dataType = "littera";
            } else if (ctx.VARIABLE().size() > 1) {
                dataType = ctx.VARIABLE(1).getText();
            } else if (contextContainsText(ctx, "verum") || contextContainsText(ctx, "falsus")) {
                dataType = "boolean";
            } else if (ctx.expresion() != null) {
                dataType = "numerus";
            }

            int line = ctx.VARIABLE(0).getSymbol().getLine();
            int column = ctx.VARIABLE(0).getSymbol().getCharPositionInLine();

            if (symbolTable.isDeclaredInCurrentScope(nameVar)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + nameVar + "' ya ha sido declarada en este ámbito.", line, column));
                return;
            }

            Symbol sym = new Symbol(nameVar, dataType, "variable", symbolTable.getCurrentScope(), line, column);

            // Obtener el valor inicial bruto
            Object initialValue = null;
            if (ctx.expresion() != null) {
                initialValue = ctx.expresion().getText();
            } else if (ctx.CADENA_TEXTO() != null) {
                String text = ctx.CADENA_TEXTO().getText();
                if (text != null && text.startsWith("\"") && text.endsWith("\"")) {
                    text = text.substring(1, text.length() - 1); // Quitar comillas
                }
                initialValue = text;
            } else if (ctx.CARACTER() != null) {
                initialValue = ctx.CARACTER().getText();
            } else if (contextContainsText(ctx, "verum")) {
                initialValue = "verum";
            } else if (contextContainsText(ctx, "falsus")) {
                initialValue = "falsus";
            }

            // Normalizar y asignar el valor (traduciendo true/false a verum/falsus si aplica)
            sym.setValue(normalizeBooleanValue(dataType, initialValue));

            if (!symbolTable.define(sym)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El tipo '" + dataType + "' no está registrado.", line, column));
            }
        }
    }

    /**
     * Procesa y registra una declaración de arreglo (series) en la tabla de símbolos.
     */
    public void recordArrayDeclarationInTable(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        if (ctx.VARIABLE() != null && !ctx.VARIABLE().isEmpty()) {
            String nameVar = ctx.VARIABLE(0).getText();
            String dataType = ctx.tipo_dato() != null ? ctx.tipo_dato().getText().toLowerCase() : "numerus";

            int size = 0;
            if (ctx.NUMERO_ENTERO() != null) {
                try {
                    size = Integer.parseInt(ctx.NUMERO_ENTERO().getText());
                } catch (NumberFormatException ignored) {
                }
            }

            int line = ctx.VARIABLE(0).getSymbol().getLine();
            int column = ctx.VARIABLE(0).getSymbol().getCharPositionInLine();

            if (symbolTable.isDeclaredInCurrentScope(nameVar)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El series '" + nameVar + "' ya ha sido declarado en este ámbito.", line, column));
                return;
            }

            Symbol sym = new Symbol(nameVar, dataType, "series", 0, new ArrayList<>(), size, symbolTable.getCurrentScope(), line, column);

            if (!symbolTable.define(sym)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El tipo de series '" + dataType + "' no está registrado.", line, column));
            }
        }
    }

    public void recordLocalDeclarationInTable(Codex_latinusParser.Declaracion_localContext ctx) {
        if (ctx.VARIABLE() != null && !ctx.VARIABLE().isEmpty()) {
            String nameVar = ctx.VARIABLE(0).getText();
            String dataType = "desconocido";

            if (ctx.tipo_dato() != null) {
                dataType = ctx.tipo_dato().getText();
            } else if (ctx.TEXTUM() != null) {
                dataType = "textum";
            } else if (ctx.LITTERA() != null) {
                dataType = "littera";
            } else if (ctx.expresion() != null) {
                dataType = typeChecker.getTipoExpresion(ctx.expresion());
            }

            int line = ctx.VARIABLE(0).getSymbol().getLine();
            int column = ctx.VARIABLE(0).getSymbol().getCharPositionInLine();

            if (symbolTable.isDeclaredInCurrentScope(nameVar)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable local '" + nameVar + "' ya ha sido declarada en este ámbito.", line, column));
                return;
            }

            Symbol sym = new Symbol(nameVar, dataType, "variable", symbolTable.getCurrentScope(), line, column);

            if (!symbolTable.define(sym)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "El tipo '" + dataType + "' no está registrado.", line, column));
            }
        }
    }

    /**
     * Convierte valores booleanos o cadenas lógicas a la representación semántica de Codex Latinus (verum / falsus).
     */
    private Object normalizeBooleanValue(String dataType, Object value) {
        if (value == null) return null;
        if (dataType != null && (dataType.equalsIgnoreCase("boolean") || dataType.equalsIgnoreCase("verum") || dataType.equalsIgnoreCase("falsus"))) {
            String valStr = String.valueOf(value).trim();
            if (valStr.equalsIgnoreCase("true") || valStr.equalsIgnoreCase("verum")) {
                return "verum";
            } else if (valStr.equalsIgnoreCase("false") || valStr.equalsIgnoreCase("falsus")) {
                return "falsus";
            }
        }
        return value;
    }

    private boolean contextContainsText(ParserRuleContext ctx, String textToFind) {
        if (ctx == null || textToFind == null) return false;
        String fullText = ctx.getText();
        return fullText != null && fullText.contains(textToFind);
    }
}