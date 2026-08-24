package codex_latinus.backend.handlers;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

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
        TerminalNode varNode = ctx.VARIABLE(); // Aquí sí es único en ratio_funcion
        return processFunction(ctx, varNode, ctx.parametros(), "ratio", argValues, bodyVisitor);
    }

    public Object handleActioFuncion(Codex_latinusParser.Actio_funcionContext ctx, List<Object> argValues, Function<ParserRuleContext, Object> bodyVisitor) {
        TerminalNode varNode = ctx.VARIABLE(); // Aquí sí es único en actio_funcion
        return processFunction(ctx, varNode, null, "actio", argValues, bodyVisitor);
    }

    private Object processFunction(ParserRuleContext ctx,
                                   TerminalNode varNode,
                                   Codex_latinusParser.ParametrosContext parametrosCtx,
                                   String kind,
                                   List<Object> argValues,
                                   Function<ParserRuleContext, Object> bodyVisitor) {

        String nombreFunc = varNode != null ? varNode.getText() : "funcion";

        // 1. Extraer los tipos de los parámetros manejando la lista de ANTLR
        List<String> paramTypes = new ArrayList<>();
        if (parametrosCtx != null && parametrosCtx.parametro() != null) {
            for (Codex_latinusParser.ParametroContext paramCtx : parametrosCtx.parametro()) {
                if (paramCtx.tipo_dato() != null) {
                    paramTypes.add(paramCtx.tipo_dato().getText().toLowerCase());
                } else {
                    List<TerminalNode> varList = paramCtx.VARIABLE();
                    if (varList != null && varList.size() > 1) {
                        paramTypes.add(varList.get(1).getText()); // Tipo struct (segunda variable)
                    } else {
                        paramTypes.add("desconocido");
                    }
                }
            }
        }

        // 2. Entrar al ámbito de la función
        symbolTable.enterScope(kind + "_" + nombreFunc);

        // 3. Registrar los parámetros en la tabla de símbolos
        if (parametrosCtx != null && parametrosCtx.parametro() != null) {
            for (int i = 0; i < parametrosCtx.parametro().size(); i++) {
                Codex_latinusParser.ParametroContext paramCtx = parametrosCtx.parametro().get(i);
                List<TerminalNode> varList = paramCtx.VARIABLE();

                // El nombre del parámetro es siempre la primera variable (índice 0)
                if (varList != null && !varList.isEmpty()) {
                    String paramName = varList.get(0).getText();
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