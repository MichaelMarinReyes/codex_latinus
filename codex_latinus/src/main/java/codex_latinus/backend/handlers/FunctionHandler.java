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

    public Object handleRatioFuncion(Codex_latinusParser.Ratio_funcionContext ctx, List<Object> argValues, Function<ParserRuleContext, Object> bodyVisitor) {
        return processFunction(ctx, ctx.VARIABLE(), ctx.tipo_dato(), ctx.parametros(), "ratio", argValues, bodyVisitor);
    }

    public Object handleActioFuncion(Codex_latinusParser.Actio_funcionContext ctx, List<Object> argValues, Function<ParserRuleContext, Object> bodyVisitor) {
        return processFunction(ctx, ctx.VARIABLE(), null, ctx.parametros(), "actio", argValues, bodyVisitor);
    }

    /**
     * Lógica central unificada para el manejo de funciones, ámbitos y parámetros.
     */
    private Object processFunction(ParserRuleContext ctx,
                                   org.antlr.v4.runtime.tree.TerminalNode varNode,
                                   Codex_latinusParser.Tipo_datoContext tipoCtx,
                                   Codex_latinusParser.ParametrosContext parametrosCtx,
                                   String kind,
                                   List<Object> argValues,
                                   Function<ParserRuleContext, Object> bodyVisitor) {

        String nombreFunc = varNode != null ? varNode.getText() : "funcion";
        String tipoRetorno = tipoCtx != null ? tipoCtx.getText().toLowerCase() : (kind.equals("ratio") ? "desconocido" : "void");
        int line = ctx.getStart().getLine();
        int column = varNode != null ? varNode.getSymbol().getCharPositionInLine() : ctx.getStart().getCharPositionInLine();

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

        // Registrar la función en la tabla de símbolos del ámbito actual (padre)
        Symbol funcSym = new Symbol(nombreFunc, tipoRetorno, kind, numParams, paramTypes, 0, symbolTable.getCurrentScope(), line, column);
        if (!symbolTable.define(funcSym)) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La función '" + nombreFunc + "' ya está declarada.", line, column));
        }

        // Entrar a un nuevo ámbito exclusivo para la función
        symbolTable.enterScope(kind + "_" + nombreFunc);

        // Registrar los parámetros dentro del nuevo ámbito local
        if (parametrosCtx != null && parametrosCtx.parametro() != null) {
            for (int i = 0; i < parametrosCtx.parametro().size(); i++) {
                Codex_latinusParser.ParametroContext paramCtx = parametrosCtx.parametro().get(i);

                if (paramCtx.VARIABLE() != null && !paramCtx.VARIABLE().isEmpty()) {
                    String paramName = paramCtx.VARIABLE(0).getText();
                    String paramType = paramTypes.get(i);
                    int pLine = paramCtx.getStart().getLine();
                    int pCol = paramCtx.getStart().getCharPositionInLine();

                    if (symbolTable.isDeclaredInCurrentScope(paramName)) {
                        semanticErrors.add(new CompilationError("SEMÁNTICO", "El parámetro '" + paramName + "' está duplicado en la función '" + nombreFunc + "'.", pLine, pCol));
                    } else {
                        Symbol paramSym = new Symbol(paramName, paramType, "parametro", symbolTable.getCurrentScope(), pLine, pCol);
                        if (argValues != null && i < argValues.size()) {
                            paramSym.setValue(argValues.get(i));
                        }
                        symbolTable.define(paramSym);
                    }
                }
            }
        }

        Object result = null;
        try {
            if (bodyVisitor != null) {
                result = bodyVisitor.apply(ctx);
            }
        } finally {
            symbolTable.exitScope();
        }

        return result;
    }
}