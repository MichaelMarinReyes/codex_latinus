package codex_latinus.backend.handlers;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionHandler {

    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;

    public FunctionHandler(SymbolTable symbolTable, List<CompilationError> semanticErrors) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
    }

    /**
     * Procesa una función con tipo de retorno (ratio_funcion).
     */
    public String handleRatioFuncion(Codex_latinusParser.Ratio_funcionContext ctx, Function<ParserRuleContext, String> bodyVisitor) {
        String nombreFunc = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "funcion";
        String tipoRetorno = ctx.tipo_dato() != null ? ctx.tipo_dato().getText() : "void";
        int column = ctx.VARIABLE() != null ? ctx.VARIABLE().getSymbol().getCharPositionInLine() : ctx.getStart().getCharPositionInLine();

        return processFunction(nombreFunc, tipoRetorno, ctx, ctx.parametros(), column, bodyVisitor);
    }

    /**
     * Procesa una función o procedimiento sin tipo de retorno (actio_funcion).
     */
    public String handleActioFuncion(Codex_latinusParser.Actio_funcionContext ctx, Function<ParserRuleContext, String> bodyVisitor) {
        String nombreFunc = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "funcion";
        int column = ctx.VARIABLE() != null ? ctx.VARIABLE().getSymbol().getCharPositionInLine() : ctx.getStart().getCharPositionInLine();

        return processFunction(nombreFunc, "void", ctx, ctx.parametros(), column, bodyVisitor);
    }

    /**
     * Lógica central para registrar la función, aislar su ámbito y registrar sus parámetros formales.
     */
    private String processFunction(String nombreFunc, String tipoRetorno, ParserRuleContext ctx, Codex_latinusParser.ParametrosContext parametrosCtx, int column, Function<ParserRuleContext, String> bodyVisitor) {
        int line = ctx.getStart().getLine();
        int numParams = 0;
        List<String> paramTypes = new ArrayList<>();

        if (parametrosCtx != null && parametrosCtx.parametro() != null) {
            numParams = parametrosCtx.parametro().size();
            for (Codex_latinusParser.ParametroContext paramCtx : parametrosCtx.parametro()) {
                if (paramCtx.tipo_dato() != null) {
                    paramTypes.add(paramCtx.tipo_dato().getText().toLowerCase());
                } else {
                    paramTypes.add("desconocido");
                }
            }
        }

        Symbol funcSym = new Symbol(nombreFunc, tipoRetorno, "actio", numParams, paramTypes, 0, symbolTable.getCurrentScope(), line, column);
        if (!symbolTable.define(funcSym)) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La función '" + nombreFunc + "' ya está declarada.", line, column));
        }

        symbolTable.enterScope("actio_" + nombreFunc);

        if (parametrosCtx != null && parametrosCtx.parametro() != null) {
            for (int i = 0; i < parametrosCtx.parametro().size(); i++) {
                Codex_latinusParser.ParametroContext paramCtx = parametrosCtx.parametro().get(i);

                if (paramCtx.VARIABLE() != null && !paramCtx.VARIABLE().isEmpty()) {
                    String paramName = paramCtx.VARIABLE(0).getText();
                    String paramType = paramTypes.get(i);

                    int pLine = paramCtx.getStart().getLine();
                    int pCol = paramCtx.getStart().getCharPositionInLine();
                    Symbol paramSym = new Symbol(paramName, paramType, "parametro", symbolTable.getCurrentScope(), pLine, pCol);
                    symbolTable.define(paramSym);
                }
            }
        }

        String result = bodyVisitor.apply(ctx);
        symbolTable.exitScope();

        return result;
    }
}