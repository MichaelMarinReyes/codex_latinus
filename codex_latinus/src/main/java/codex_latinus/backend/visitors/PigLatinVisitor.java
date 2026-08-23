package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.handlers.DeclarationHandler;
import codex_latinus.backend.handlers.FunctionHandler;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Visitor encargado de traducir el código fuente de Codex Latinus a Pig Latin,
 * manteniendo el control semántico completo, ámbitos, arreglos y las reglas de
 * declaración y asignación adaptadas.
 */
public class PigLatinVisitor extends Codex_latinusBaseVisitor<String> {

    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;
    private final DeclarationHandler declarationHandler;
    private final FunctionHandler functionHandler;
    private int loopDepth = 0;

    public PigLatinVisitor(SymbolTable symbolTable, List<CompilationError> semanticErrors) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
        this.declarationHandler = new DeclarationHandler(this.symbolTable, this.semanticErrors);
        this.functionHandler = new FunctionHandler(this.symbolTable, this.semanticErrors);
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
        TerminalNode varNode = ctx.VARIABLE();
        String nombreStruct = (varNode != null) ? varNode.getText() : "";
        int line = (varNode != null) ? varNode.getSymbol().getLine() : ctx.getStart().getLine();
        int column = (varNode != null) ? varNode.getSymbol().getCharPositionInLine() : ctx.getStart().getCharPositionInLine();

        if (symbolTable.isDeclaredInCurrentScope(nombreStruct)) {
            semanticErrors.add(new CompilationError("SEMÁNTICO", "La estructura '" + nombreStruct + "' ya ha sido declarada.", line, column));
        }

        List<String> nombresAtributos = new ArrayList<>();

        for (Codex_latinusParser.Miembro_structuraContext miembro : ctx.miembro_structura()) {
            List<TerminalNode> miembroVars = miembro.VARIABLE();
            if (miembroVars != null && !miembroVars.isEmpty()) {
                String nombreAttr = miembroVars.get(0).getText();
                if (nombresAtributos.contains(nombreAttr)) {
                    semanticErrors.add(new CompilationError("SEMÁNTICO", "El atributo '" + nombreAttr + "' está repetido en la estructura '" + nombreStruct + "'.", miembro.getStart().getLine(), miembro.getStart().getCharPositionInLine()));
                } else {
                    nombresAtributos.add(nombreAttr);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule("structura")).append(" ");
        sb.append(nombreStruct).append(" ");
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

        String openSymbol = ">";
        if (ctx.getChildCount() > 1) {
            String text = ctx.getChild(1).getText();
            if (text.equals("[")) {
                openSymbol = "[";
            }
        }

        sb.append(applyPigLatinRule("VARIABILES")).append(" ").append(openSymbol);
        if (openSymbol.equals(">")) {
            sb.append("\n");
        } else {
            sb.append(" ");
        }

        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();

            if (text.equalsIgnoreCase("VARIABILES") || text.equals(">") || text.equals("[") || text.equals("]")) {
                continue;
            }

            String trad = visit(child);
            if (trad != null && !trad.isEmpty()) {
                if (openSymbol.equals(">")) {
                    sb.append(trad).append("\n");
                } else {
                    sb.append(trad).append(" ");
                }
            }
        }

        if (openSymbol.equals("[")) {
            sb.append("]");
        }

        return sb.toString().trim();
    }

    @Override
    public String visitDeclaracion(Codex_latinusParser.DeclaracionContext ctx) {
        declarationHandler.recordDeclarationInTable(ctx);
        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule("esto")).append(" ");

        String nombreVar = "";
        if (ctx.VARIABLE() != null && !ctx.VARIABLE().isEmpty()) {
            nombreVar = ctx.VARIABLE(0).getText();
            sb.append(applyPigLatinRule(nombreVar)).append(" : ");
        }

        String tipoDato = "numerus";
        if (ctx.tipo_dato() != null) {
            tipoDato = ctx.tipo_dato().getText();
        } else if (ctx.TEXTUM() != null) {
            tipoDato = "textum";
        } else if (ctx.LITTERA() != null) {
            tipoDato = "littera";
        } else if (ctx.VARIABLE() != null && ctx.VARIABLE().size() > 1) {
            tipoDato = ctx.VARIABLE(1).getText();
        } else if (ctx.expresion() != null) {
            tipoDato = getTipoExpresion(ctx.expresion());
        } else if (contextContainsText(ctx, "verum") || contextContainsText(ctx, "falsus")) {
            tipoDato = "boolean";
        }

        sb.append(applyPigLatinRule(tipoDato));

        Object valorInicial = null;
        if (!nombreVar.isEmpty()) {
            Symbol sym = symbolTable.resolve(nombreVar);
            if (sym != null) {
                valorInicial = sym.getValue();
            }
        }

        if (valorInicial != null) {
            sb.append(" ").append(valorInicial.toString());
        } else {
            if (ctx.expresion() != null) {
                String exprTrad = visit(ctx.expresion());
                if (exprTrad != null && !exprTrad.isEmpty()) {
                    sb.append(" ").append(exprTrad);
                }
            } else if (ctx.CADENA_TEXTO() != null) {
                sb.append(" ").append(ctx.CADENA_TEXTO().getText());
            } else if (ctx.CARACTER() != null) {
                sb.append(" ").append(ctx.CARACTER().getText());
            } else if (contextContainsText(ctx, "verum")) {
                sb.append(" ").append(applyPigLatinRule("verum"));
            } else if (contextContainsText(ctx, "falsus")) {
                sb.append(" ").append(applyPigLatinRule("falsus"));
            }
        }

        sb.append(";");
        return sb.toString();
    }

    @Override
    public String visitArreglo_declaracion(Codex_latinusParser.Arreglo_declaracionContext ctx) {
        declarationHandler.recordArrayDeclarationInTable(ctx);
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
    public String visitRatio_funcion(Codex_latinusParser.Ratio_funcionContext ctx) {
        StringBuilder sb = new StringBuilder();

        String tipo = ctx.tipo_dato() != null ? visit(ctx.tipo_dato()) : "";
        String nombre = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "";

        sb.append("ratio ").append(tipo).append(" ").append(nombre).append("(");

        if (ctx.parametros() != null) {
            sb.append(visit(ctx.parametros()));
        }
        sb.append(") {\n");

        if (ctx.sentencia() != null) {
            for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                sb.append("    ").append(visit(sent)).append("\n");
            }
        }
        sb.append("}\n");

        return sb.toString();
    }

    @Override
    public String visitActio_funcion(Codex_latinusParser.Actio_funcionContext ctx) {
        StringBuilder sb = new StringBuilder();

        String nombre = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : "";

        sb.append("actio ").append(nombre).append("(");

        if (ctx.parametros() != null) {
            sb.append(visit(ctx.parametros()));
        }
        sb.append(") {\n");

        if (ctx.sentencia() != null) {
            for (Codex_latinusParser.SentenciaContext sent : ctx.sentencia()) {
                sb.append("    ").append(visit(sent)).append("\n");
            }
        }
        sb.append("}\n");

        return sb.toString();
    }

    @Override
    public String visitFuncion(Codex_latinusParser.FuncionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitReddere(Codex_latinusParser.Reddere_sentenciaContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule("reddere")).append(" ");
        if (ctx.expresion() != null) {
            sb.append(visit(ctx.expresion()));
        }
        sb.append(" ;");
        return sb.toString();
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
        } else if (ctx.acceso_miembro() != null && ctx.acceso_miembro().VARIABLE() != null && !ctx.acceso_miembro().VARIABLE().isEmpty()) {
            varName = ctx.acceso_miembro().VARIABLE(0).getText();
        }

        if (varName != null) {
            Symbol sym = symbolTable.resolve(varName);
            if (sym == null) {
                semanticErrors.add(new CompilationError("SEMÁNTICO", "La variable '" + varName + "' no existe para almacenar la lectura.", ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
            }
        }

        String targetVar = varName != null ? applyPigLatinRule(varName) : "";
        return targetVar + " %OINK_OINK;";
    }

    @Override
    public String visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        String varName = "";
        if (ctx.VARIABLE() != null) {
            varName = ctx.VARIABLE().getText();
        } else if (ctx.acceso_miembro() != null && ctx.acceso_miembro().VARIABLE() != null && !ctx.acceso_miembro().VARIABLE().isEmpty()) {
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

        StringBuilder sb = new StringBuilder();
        sb.append(applyPigLatinRule(varName)).append(" = ");

        if (ctx.expresion() != null) {
            sb.append(visit(ctx.expresion()));
        } else if (ctx.condicion() != null) {
            sb.append(visit(ctx.condicion()));
        } else if (ctx.structura_instanciacion() != null) {
            sb.append(visit(ctx.structura_instanciacion()));
        } else if (ctx.arreglo_literal() != null) {
            sb.append(visit(ctx.arreglo_literal()));
        } else if (contextContainsText(ctx, "verum")) {
            sb.append(applyPigLatinRule("verum"));
        } else if (contextContainsText(ctx, "falsus")) {
            sb.append(applyPigLatinRule("falsus"));
        }

        sb.append(";");
        return sb.toString();
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

        if (termino.llamada_funcion() != null && termino.llamada_funcion().VARIABLE() != null) {
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

    /**
     * MÉTODO CLAVE AÑADIDO: Intercepta cualquier nodo terminal (palabras clave, identificadores, etc.)
     * que no tenga un visitante específico y les aplica la regla de traducción a Pig Latin.
     */
    @Override
    public String visitTerminal(TerminalNode node) {
        String text = node.getText();
        if (text == null) return "";
        if ((text.startsWith("\"") && text.endsWith("\"")) || (text.startsWith("'") && text.endsWith("'"))) {
            return text;
        }
        if (isAlphabeticWord(text)) {
            return applyPigLatinRule(text);
        }
        return text;
    }

    public String visitChildren(ParserRuleContext node) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < node.getChildCount(); i++) {
            ParseTree child = node.getChild(i);
            String res = visit(child);
            if (res != null && !res.isEmpty()) {
                sb.append(res).append(" ");
            }
        }
        return sb.toString().trim();
    }

    private String visitChildrenGeneric(ParserRuleContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            String res = visitGenericElement(ctx.getChild(i));
            if (res != null && !res.isEmpty()) {
                sb.append(res).append(" ");
            }
        }
        return sb.toString().trim();
    }

    private boolean contextContainsText(ParserRuleContext ctx, String textToFind) {
        if (ctx == null || textToFind == null) return false;
        String fullText = ctx.getText();
        return fullText != null && fullText.contains(textToFind);
    }

    private String visitGenericElement(ParseTree node) {
        if (node instanceof TerminalNode) {
            return visitTerminal((TerminalNode) node);
        } else {
            String res = visit(node);
            return res != null ? res : "";
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