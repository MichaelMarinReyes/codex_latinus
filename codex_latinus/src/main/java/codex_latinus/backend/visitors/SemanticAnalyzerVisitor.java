package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.handlers.*;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.utils.TypeChecker;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Visitante encargado del análisis semántico del lenguaje Codex Latinus.
 * Recorre el árbol de análisis sintáctico (AST) para validar declaraciones,
 * control de tipos, ámbitos (scopes), y poblar la tabla de símbolos.
 */
public class SemanticAnalyzerVisitor extends Codex_latinusBaseVisitor<Object> {

    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;
    private final FunctionHandler functionHandler;
    private final LoopHandler loopHandler;
    private final DeclarationHandler declarationHandler;
    private final TypeChecker typeChecker;
    private final AssignmentHandler assignmentHandler;
    private final StructHandler structHandler;
    private String currentFunctionReturnType = null;
    private boolean hasReturned = false;
    private final ConditionalHandler conditionalHandler;
    private boolean structPrePassDone = false;

    public SemanticAnalyzerVisitor(SymbolTable symbolTable, List<CompilationError> semanticErrors) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
        this.functionHandler = new FunctionHandler(this.symbolTable, this.semanticErrors);
        this.declarationHandler = new DeclarationHandler(this.symbolTable, this.semanticErrors);
        this.typeChecker = new TypeChecker(symbolTable, semanticErrors);
        this.structHandler = new StructHandler(this.symbolTable, this.semanticErrors, this.typeChecker);
        this.assignmentHandler = new AssignmentHandler(symbolTable, semanticErrors, typeChecker);
        this.conditionalHandler = new ConditionalHandler(this.symbolTable, semanticErrors, typeChecker);
        this.loopHandler = new LoopHandler(this.symbolTable, this.semanticErrors, this.typeChecker);
    }

    /**
     * PASADA PREVIA: Intercepta la raíz para registrar todas las estructuras
     * globalmente antes de procesar cualquier declaración o sentencia.
     */
    @Override
    public Object visit(ParseTree tree) {
        if (!structPrePassDone) {
            structPrePassDone = true;
            runStructPrePass(tree);
        }
        return super.visit(tree);
    }

    private void runStructPrePass(ParseTree tree) {
        if (tree == null) return;
        if (tree instanceof Codex_latinusParser.Structura_defContext) {
            structHandler.handleStructDef((Codex_latinusParser.Structura_defContext) tree);
        } else {
            for (int i = 0; i < tree.getChildCount(); i++) {
                runStructPrePass(tree.getChild(i));
            }
        }
    }

    /**
     * Se omite en el recorrido normal ya que se procesó en el pre-pass para evitar duplicados.
     */
    @Override
    public Object visitStructura_def(Codex_latinusParser.Structura_defContext ctx) {
        return null;
    }

    @Override
    public Object visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx) {
        declarationHandler.recordDeclarationInTable(ctx);

        if (ctx.VARIABLE() != null && ctx.VARIABLE().size() >= 2) {
            String varName = ctx.VARIABLE().get(0).getText();
            String structTypeName = ctx.VARIABLE().get(1).getText();

            boolean structExists = structHandler.getStructRegistry().containsKey(structTypeName);
            String foundKey = structTypeName;
            if (!structExists) {
                for (String key : structHandler.getStructRegistry().keySet()) {
                    if (key.equalsIgnoreCase(structTypeName)) {
                        structExists = true;
                        foundKey = key;
                        break;
                    }
                }
            }

            if (structExists) {
                int line = ctx.getStart().getLine();
                int column = ctx.getStart().getCharPositionInLine();

                Symbol sym = new Symbol(varName, foundKey, "struct", symbolTable.getCurrentScope(), line, column);
                symbolTable.define(sym);

                if (ctx.structura_instanciacion() != null) {
                    structHandler.validarInstanciacionStruct(foundKey, ctx.structura_instanciacion(), line, column);
                }
            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Object visitDeclaracion_local(Codex_latinusParser.Declaracion_localContext ctx) {
        declarationHandler.recordLocalDeclarationInTable(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitArreglo_declaracion(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        declarationHandler.recordArrayDeclarationInTable(ctx);

        if (ctx.VARIABLE() != null && ctx.VARIABLE().size() >= 2) {
            String arrName = ctx.VARIABLE(0).getText();
            String structTypeName = ctx.VARIABLE(1).getText();

            boolean structExists = structHandler.getStructRegistry().containsKey(structTypeName);
            String foundKey = structTypeName;
            if (!structExists) {
                for (String key : structHandler.getStructRegistry().keySet()) {
                    if (key.equalsIgnoreCase(structTypeName)) {
                        structExists = true;
                        foundKey = key;
                        break;
                    }
                }
            }

            if (structExists) {
                int line = ctx.getStart().getLine();
                int column = ctx.getStart().getCharPositionInLine();

                Symbol sym = new Symbol(arrName, foundKey, "series_struct", symbolTable.getCurrentScope(), line, column);
                symbolTable.define(sym);

                if (ctx.elemento_arreglo_struct() != null) {
                    for (Codex_latinusParser.Structura_instanciacionContext sInst : ctx.elemento_arreglo_struct().structura_instanciacion()) {
                        structHandler.validarInstanciacionStruct(foundKey, sInst, line, column);
                    }
                }
            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Object visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        assignmentHandler.handleAsignacion(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitSi_sentencia(Codex_latinusParser.Si_sentenciaContext ctx) {
        conditionalHandler.handleSi(ctx);
        return visitChildren(ctx);
    }

    @Override
    public Object visitCiclo_dum(Codex_latinusParser.Ciclo_dumContext ctx) {
        return loopHandler.handleCicloDum(ctx, c -> visitChildren(c));
    }

    @Override
    public Object visitCiclo_facere(Codex_latinusParser.Ciclo_facereContext ctx) {
        return loopHandler.handleCicloFacere(ctx, c -> visitChildren(c));
    }

    @Override
    public Object visitCiclo_per(Codex_latinusParser.Ciclo_perContext ctx) {
        return loopHandler.handleCicloPer(ctx, c -> visitChildren(c));
    }

    @Override
    public Object visitSalto_sentencia(Codex_latinusParser.Salto_sentenciaContext ctx) {
        return loopHandler.handleSaltoSentencia(ctx);
    }

    @Override
    public Object visitRatio_funcion(Codex_latinusParser.Ratio_funcionContext ctx) {
        String funcName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "";
        String expectedReturnType = ctx.tipo_dato() != null ? ctx.tipo_dato().getText().toLowerCase() : "desconocido";

        // Registrar firma de la función en la tabla global
        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        List<String> paramTypes = new ArrayList<>();
        if (ctx.parametros() != null && ctx.parametros().parametro() != null) {
            for (Codex_latinusParser.ParametroContext p : ctx.parametros().parametro()) {
                paramTypes.add(p.tipo_dato() != null ? p.tipo_dato().getText().toLowerCase() : "desconocido");
            }
        }
        Symbol funcSym = new Symbol(funcName, expectedReturnType, "ratio", paramTypes.size(), paramTypes, 0, symbolTable.getCurrentScope(), line, col);
        symbolTable.define(funcSym);

        String prevReturnType = currentFunctionReturnType;
        boolean prevHasReturned = hasReturned;

        currentFunctionReturnType = expectedReturnType;
        hasReturned = false;

        functionHandler.handleRatioFuncion(ctx, null, c -> {
            if (ctx.variables_locales() != null) {
                visit(ctx.variables_locales());
            }

            if (ctx.sentencia() != null) {
                for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                    if (hasReturned) {
                        semanticErrors.add(new CompilationError("SEMÁNTICO",
                                "Código muerto: la sentencia no será ejecutada debido a un retorno previo.",
                                sent.getStart().getLine(), sent.getStart().getCharPositionInLine()));
                        break;
                    }
                    visit(sent);
                }
            }

            if (ctx.reddere_sentencia() != null) {
                if (hasReturned) {
                    semanticErrors.add(new CompilationError("SEMÁNTICO",
                            "Código muerto: la sentencia reddere no será ejecutada debido a un retorno previo.",
                            ctx.reddere_sentencia().getStart().getLine(), ctx.reddere_sentencia().getStart().getCharPositionInLine()));
                } else {
                    visit(ctx.reddere_sentencia());
                }
            }

            return null;
        });

        if (!hasReturned) {
            semanticErrors.add(new CompilationError("SEMÁNTICO",
                    "La función con retorno '" + funcName + "' no garantiza un retorno en todos sus caminos.",
                    ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
        }

        currentFunctionReturnType = prevReturnType;
        hasReturned = prevHasReturned;

        return null;
    }

    @Override
    public Object visitActio_funcion(Codex_latinusParser.Actio_funcionContext ctx) {
        String funcName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "";

        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();
        List<String> paramTypes = new ArrayList<>();
        if (ctx.parametros() != null && ctx.parametros().parametro() != null) {
            for (Codex_latinusParser.ParametroContext p : ctx.parametros().parametro()) {
                paramTypes.add(p.tipo_dato() != null ? p.tipo_dato().getText().toLowerCase() : "desconocido");
            }
        }
        Symbol funcSym = new Symbol(funcName, "void", "actio", paramTypes.size(), paramTypes, 0, symbolTable.getCurrentScope(), line, col);
        symbolTable.define(funcSym);

        String prevReturnType = currentFunctionReturnType;
        boolean prevHasReturned = hasReturned;

        currentFunctionReturnType = null;
        hasReturned = false;

        functionHandler.handleActioFuncion(ctx, null, c -> {
            if (ctx.variables_locales() != null) {
                visit(ctx.variables_locales());
            }

            if (ctx.sentencia() != null) {
                for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                    visit(sent);
                }
            }

            return null;
        });

        currentFunctionReturnType = prevReturnType;
        hasReturned = prevHasReturned;
        return null;
    }

    @Override
    public Object visitReddere_sentencia(Codex_latinusParser.Reddere_sentenciaContext ctx) {
        hasReturned = true;

        int line = ctx.getStart().getLine();
        int col = ctx.getStart().getCharPositionInLine();

        if (currentFunctionReturnType == null || currentFunctionReturnType.equals("void")) {
            semanticErrors.add(new CompilationError(
                    "SEMÁNTICO",
                    "Las funciones de tipo 'actio' no pueden utilizar la sentencia 'reddere'.",
                    line, col
            ));
        } else if (ctx.expresion() != null) {
            String returnedType = typeChecker.getTipoExpresion(ctx.expresion());

            if (returnedType != null && !returnedType.equalsIgnoreCase(currentFunctionReturnType)) {
                semanticErrors.add(new CompilationError(
                        "SEMÁNTICO",
                        "El tipo de retorno no coincide. Se esperaba '" + currentFunctionReturnType +
                                "', pero se encontró '" + returnedType + "'.",
                        line, col
                ));
            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Object visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym == null) {
                semanticErrors.add(new CompilationError("SEMÁNTICO",
                        "La variable '" + varName + "' no ha sido declarada antes de recibir lectura.",
                        ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            }
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        if (ctx.VARIABLE() != null) {
            for (org.antlr.v4.runtime.tree.TerminalNode varNode : ctx.VARIABLE()) {
                String varName = varNode.getText();
                Symbol sym = symbolTable.resolve(varName);
                if (sym == null) {
                    semanticErrors.add(new CompilationError("SEMÁNTICO",
                            "La variable '" + varName + "' no existe en este ámbito para ser impresa.",
                            varNode.getSymbol().getLine(), varNode.getSymbol().getCharPositionInLine()));
                }
            }
        }
        return visitChildren(ctx);
    }
}