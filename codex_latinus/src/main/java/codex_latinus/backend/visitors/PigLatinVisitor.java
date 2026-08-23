package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class PigLatinVisitor extends Codex_latinusBaseVisitor<String> {

    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;
    private int loopDepth = 0;

    public PigLatinVisitor() {
        this.symbolTable = new SymbolTable();
        this.semanticErrors = new ArrayList<>();
    }

    public PigLatinVisitor(SymbolTable symbolTable, List<CompilationError> semanticErrors) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public List<CompilationError> getSemanticErrors() {
        return semanticErrors;
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) return nextResult;
        if (nextResult == null) return aggregate;
        return aggregate + " " + nextResult;
    }

    @Override
    public String visitInit(Codex_latinusParser.InitContext ctx) {
        if (ctx.codex_latinus() != null) {
            return visit(ctx.codex_latinus());
        }
        return "";
    }

    @Override
    public String visitCodex_latinus(Codex_latinusParser.Codex_latinusContext ctx) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            String trad = visit(ctx.getChild(i));
            if (trad != null && !trad.isEmpty()) {
                resultado.append(trad).append("\n");
            }
        }
        return resultado.toString();
    }

    @Override
    public String visitStructura_def(Codex_latinusParser.Structura_defContext ctx) {
        String nombreStruct = ctx.VARIABLE().getText();
        int line = ctx.VARIABLE().getSymbol().getLine();
        int column = ctx.VARIABLE().getSymbol().getCharPositionInLine();

        if (symbolTable.isDeclaredInCurrentScope(nombreStruct)) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La estructura '" + nombreStruct + "' ya ha sido declarada.", line, column));
        }

        List<String> nombresAtributos = new ArrayList<>();

        for (Codex_latinusParser.Miembro_structuraContext miembro : ctx.miembro_structura()) {
            if (miembro.VARIABLE() != null && miembro.VARIABLE().size() > 0) {
                String nombreAttr = miembro.VARIABLE(0).getText();
                if (nombresAtributos.contains(nombreAttr)) {
                    semanticErrors.add(new CompilationError("SEMÁNTICO", "El atributo '" + nombreAttr + "' está repetido en la estructura '" + nombreStruct + "'.", miembro.getStart().getLine(), miembro.getStart().getCharPositionInLine()));
                } else {
                    nombresAtributos.add(nombreAttr);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule("structura")).append(" ");
        sb.append(visit(ctx.VARIABLE())).append(" ");
        sb.append("{ ");
        for (Codex_latinusParser.Miembro_structuraContext miembro : ctx.miembro_structura()) {
            sb.append(visit(miembro)).append(" ");
        }
        sb.append("} ");
        sb.append(applyPigLatinRule(ctx.FINIS().getText())).append(";");
        return sb.toString();
    }

    @Override
    public String visitMiembro_structura(Codex_latinusParser.Miembro_structuraContext ctx) {
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitVariables(Codex_latinusParser.VariablesContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String trad = visitGenericElement(child);
            if (trad != null && !trad.isEmpty()) {
                if (trad.equals("[") || trad.equals(">")) {
                    sb.append(trad).append("\n");
                } else if (child instanceof Codex_latinusParser.DeclaracionContext || child instanceof Codex_latinusParser.Arreglo_declaracionContext) {
                    sb.append(trad).append("\n");
                } else {
                    sb.append(trad);
                }
            }
        }
        return sb.toString().trim();
    }

    @Override
    public String visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx) {
        recordDeclarationInTable(ctx);
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitArreglo_declaracion(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        recordArrayDeclarationInTable(ctx);
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitMunera(Codex_latinusParser.MuneraContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule("MUNERA")).append(" >\n");
        for (Codex_latinusParser.FuncionContext func : ctx.funcion()) {
            sb.append(visit(func)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitFuncion(Codex_latinusParser.FuncionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitRatio_funcion(Codex_latinusParser.Ratio_funcionContext ctx) {
        String nombreFunc = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "funcion";
        String tipoRetorno = ctx.tipo_dato() != null ? ctx.tipo_dato().getText() : "void";
        int column = ctx.VARIABLE() != null ? ctx.VARIABLE().getSymbol().getCharPositionInLine() : ctx.getStart().getCharPositionInLine();

        return processFunction(nombreFunc, tipoRetorno, ctx, ctx.parametros(), column);
    }

    @Override
    public String visitActio_funcion(Codex_latinusParser.Actio_funcionContext ctx) {
        String nombreFunc = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "funcion";
        int column = ctx.VARIABLE() != null ? ctx.VARIABLE().getSymbol().getCharPositionInLine() : ctx.getStart().getCharPositionInLine();

        return processFunction(nombreFunc, "void", ctx, ctx.parametros(), column);
    }

    @Override
    public String visitMaior(Codex_latinusParser.MaiorContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule("MAIOR")).append(" >\n");
        for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
            String tradSent = visit(sent);
            if (tradSent != null) {
                sb.append(tradSent).append("\n");
            }
        }
        sb.append(applyPigLatinRule("finis")).append(";");
        return sb.toString();
    }

    @Override
    public String visitSentencia(Codex_latinusParser.SentenciaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();

            if (text.equals(">>") || text.equals(";")) {
                continue;
            }

            String valorImprimir = evaluarElementoImpresion(child);
            sb.append(valorImprimir).append(" ");
        }

        return sb.toString().trim();
    }

    private String evaluarElementoImpresion(ParseTree node) {
        String text = node.getText();

        if (text.startsWith("\"") && text.endsWith("\"")) {
            return text.substring(1, text.length() - 1);
        }

        Symbol sym = symbolTable.resolve(text);
        if (sym != null) {
            return sym.getValue() != null ? sym.getValue().toString() : "null";
        }

        String evaluado = visit(node);
        if (evaluado != null) {
            return evaluado;
        }

        return text;
    }

    @Override
    public String visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        String varName = null;

        if (ctx.VARIABLE() != null) {
            varName = ctx.VARIABLE().getText();
        } else if (ctx.acceso_miembro() != null && ctx.acceso_miembro().VARIABLE(0) != null) {
            varName = ctx.acceso_miembro().VARIABLE(0).getText();
        }

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String inputUsuario = "";
        if (scanner.hasNextLine()) {
            inputUsuario = scanner.nextLine();
        }

        if (varName != null) {
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                sym.setValue(inputUsuario);
            } else {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + varName + "' no existe para almacenar la lectura.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            }
        }

        return inputUsuario;
    }

    @Override
    public String visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        String varName = "";
        if (ctx.VARIABLE() != null) {
            varName = ctx.VARIABLE().getText();
        } else if (ctx.acceso_miembro() != null && ctx.acceso_miembro().VARIABLE(0) != null) {
            varName = ctx.acceso_miembro().VARIABLE(0).getText();
        }

        Symbol sym = symbolTable.resolve(varName);
        if (sym == null) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + varName + "' no ha sido declarada.",
                    ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            return visitChildrenGeneric(ctx);
        }

        if (ctx.expresion() != null) {
            String tipoVariable = sym.getType().toLowerCase();
            String tipoValor = getTipoExpresion(ctx.expresion());

            boolean compatible = symbolTable.getTypeTable().areTypesCompatible(tipoVariable, tipoValor);
            if (!compatible && !"desconocido".equals(tipoValor)) {
                semanticErrors.add(new CompilationError("SEMÁNTICO",
                        "Error de tipo: No se puede asignar '" + tipoValor + "' a una variable de tipo '" + tipoVariable + "'.",
                        ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            } else {
                sym.setValue(ctx.expresion().getText());
            }
        }

        return visitChildrenGeneric(ctx);
    }

    private String getTipoExpresion(Codex_latinusParser.ExpresionContext ctx) {
        if (ctx.termino() == null || ctx.termino().isEmpty()) {
            return "desconocido";
        }

        String tipoActual = getTipoTermino(ctx.termino(0));

        for (int i = 0; i < ctx.operacion_aritmetica().size(); i++) {
            String op = ctx.operacion_aritmetica(i).getText();
            String tipoSiguiente = getTipoTermino(ctx.termino(i + 1));

            if (tipoActual.equals("textum") || tipoSiguiente.equals("textum")) {
                if (!op.equals("+")) {
                    semanticErrors.add(new CompilationError("SEMÁNTICO",
                            "Error de tipo: El tipo 'textum' solo puede combinarse con operaciones de suma (+) para concatenación.",
                            ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
                    return "textum";
                }
                tipoActual = "textum";
                continue;
            }

            int jerarquia1 = getJerarquia(tipoActual);
            int jerarquia2 = getJerarquia(tipoSiguiente);

            if (jerarquia1 == -1 || jerarquia2 == -1) {
                tipoActual = "desconocido";
                continue;
            }

            int maxJerarquia = Math.max(jerarquia1, jerarquia2);
            tipoActual = getTipoByJerarquia(maxJerarquia);
        }

        return tipoActual;
    }

    private String getTipoTermino(Codex_latinusParser.TerminoContext termino) {
        if (termino == null) return "desconocido";

        if (termino.VARIABLE() != null) {
            Symbol s = symbolTable.resolve(termino.VARIABLE().getText());
            return (s != null) ? s.getType().toLowerCase() : "desconocido";
        }
        if (termino.NUMERO_ENTERO() != null) return "numerus";
        if (termino.NUMERO_DECIMAL() != null) return "decimalis";
        if (termino.VERUM() != null || termino.FALSUS() != null) return "boolean";
        if (termino.CADENA_TEXTO() != null) return "textum";
        if (termino.CARACTER() != null) return "littera";

        if (termino.llamada_funcion() != null) {
            String funcName = termino.llamada_funcion().VARIABLE().getText();
            Symbol s = symbolTable.resolve(funcName);
            return (s != null) ? s.getType().toLowerCase() : "desconocido";
        }
        return "numerus";
    }

    private int getJerarquia(String tipo) {
        if (tipo == null) return -1;
        switch (tipo.toLowerCase()) {
            case "textum": return 5;
            case "decimalis": return 4;
            case "numerus": return 3;
            case "littera": return 2;
            case "boolean":
            case "verum":
            case "falsus": return 1;
            default: return -1;
        }
    }

    private String getTipoByJerarquia(int j) {
        switch (j) {
            case 5: return "textum";
            case 4: return "decimalis";
            case 3: return "numerus";
            case 2: return "littera";
            case 1: return "boolean";
            default: return "desconocido";
        }
    }

    @Override
    public String visitSi_sentencia(Codex_latinusParser.Si_sentenciaContext ctx) {
        return visitChildrenGeneric(ctx);
    }

    @Override
    public String visitCiclo_dum(Codex_latinusParser.Ciclo_dumContext ctx) {
        loopDepth++;
        String res = visitChildrenGeneric(ctx);
        loopDepth--;
        return res;
    }

    @Override
    public String visitCiclo_facere(Codex_latinusParser.Ciclo_facereContext ctx) {
        loopDepth++;
        String res = visitChildrenGeneric(ctx);
        loopDepth--;
        return res;
    }

    @Override
    public String visitCiclo_per(Codex_latinusParser.Ciclo_perContext ctx) {
        loopDepth++;
        String res = visitChildrenGeneric(ctx);
        loopDepth--;
        return res;
    }

    @Override
    public String visitSalto_sentencia(Codex_latinusParser.Salto_sentenciaContext ctx) {
        if (loopDepth <= 0) {
            String palabraClave = ctx.getStart().getText();
            semanticErrors.add(new CompilationError(
                    "SEMÁNTICO",
                    "La instrucción '" + palabraClave + "' solo puede ser utilizada dentro de un ciclo (dum, facere o per).",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine()
            ));
        }
        return visitChildrenGeneric(ctx);
    }

    private String visitChildrenGeneric(ParserRuleContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            sb.append(visitGenericElement(ctx.getChild(i))).append(" ");
        }
        return sb.toString().trim();
    }

    private String processFunction(String nombreFunc, String tipoRetorno, ParserRuleContext ctx, Codex_latinusParser.ParametrosContext parametrosCtx, int column) {
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

                if (paramCtx.VARIABLE() != null) {
                    String paramName = paramCtx.VARIABLE(0).getText();
                    String paramType = paramTypes.get(i);

                    int pLine = paramCtx.getStart().getLine();
                    int pCol = paramCtx.getStart().getCharPositionInLine();
                    Symbol paramSym = new Symbol(paramName, paramType, "parametro", symbolTable.getCurrentScope(), pLine, pCol);
                    symbolTable.define(paramSym);
                }
            }
        }

        String result = visitChildrenGeneric(ctx);
        symbolTable.exitScope();

        return result;
    }

    private void recordDeclarationInTable(Codex_latinusParser.DeclaracionContext ctx) {
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
                dataType = getTipoExpresion(ctx.expresion());
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

    private void recordArrayDeclarationInTable(Codex_latinusParser.Arreglo_declaracionContext ctx) {
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

    private String visitGenericElement(ParseTree node) {
        if (node instanceof TerminalNode) {
            String text = node.getText();
            if (text.startsWith("\"") && text.endsWith("\"")) {
                return text;
            }
            if (isAlphabeticWord(text)) {
                return applyPigLatinRule(text);
            }
            return text;
        } else {
            String res = visit(node);
            if (res != null && !res.isEmpty()) {
                return res;
            }
            String text = node.getText();
            if (isAlphabeticWord(text)) {
                return applyPigLatinRule(text);
            }
            return text;
        }
    }

    private boolean isAlphabeticWord(String texto) {
        if (texto == null || texto.isEmpty()) return false;
        for (char c : texto.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    private String applyPigLatinRule(String palabra) {
        if (palabra == null || palabra.isEmpty()) return palabra;
        if (!isAlphabeticWord(palabra)) return palabra;

        char primera = Character.toLowerCase(palabra.charAt(0));
        boolean esVocal = "aeiou".indexOf(primera) >= 0;

        if (esVocal) {
            return palabra + "way";
        } else {
            int indexVocal = -1;
            for (int i = 0; i < palabra.length(); i++) {
                if ("aeiou".indexOf(Character.toLowerCase(palabra.charAt(i))) >= 0) {
                    indexVocal = i;
                    break;
                }
            }
            if (indexVocal == -1) return palabra + "ay";
            return palabra.substring(indexVocal) + palabra.substring(0, indexVocal) + "ay";
        }
    }
}