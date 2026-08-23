package codex_latinus.backend.handlers;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;

import java.util.ArrayList;
import java.util.List;

public class DeclarationHandler {

    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;

    public DeclarationHandler(SymbolTable symbolTable, List<CompilationError> semanticErrors) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
    }

    /**
     * Procesa y registra una declaración de variable estándar en la tabla de símbolos.
     */
    public void recordDeclarationInTable(Codex_latinusParser.DeclaracionContext ctx, String tipoExpresionIncurrida) {
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
            } else if (ctx.expresion() != null) {
                dataType = tipoExpresionIncurrida;
            }

            int line = ctx.VARIABLE(0).getSymbol().getLine();
            int column = ctx.VARIABLE(0).getSymbol().getCharPositionInLine();

            if (symbolTable.isDeclaredInCurrentScope(nameVar)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + nameVar + "' ya ha sido declarada en este ámbito.", line, column));
                return;
            }

            Symbol sym = new Symbol(nameVar, dataType, "variable", symbolTable.getCurrentScope(), line, column);

            if (ctx.expresion() != null) {
                sym.setValue(ctx.expresion().getText());
            }

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
}