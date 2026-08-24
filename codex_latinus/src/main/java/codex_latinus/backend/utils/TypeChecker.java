package codex_latinus.backend.utils;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;

import java.util.List;

public class TypeChecker {
    private final SymbolTable symbolTable;
    private final List<CompilationError> semanticErrors;

    public TypeChecker(SymbolTable symbolTable, List<CompilationError> semanticErrors) {
        this.symbolTable = symbolTable;
        this.semanticErrors = semanticErrors;
    }

    /**
     * Determina el tipo de dato resultante de evaluar una expresión aritmética, lógica o de comparación.
     */
    public String getTipoExpresion(Codex_latinusParser.ExpresionContext ctx) {
        if (ctx == null || ctx.termino() == null || ctx.termino().isEmpty()) {
            return "desconocido";
        }

        // Si la expresión contiene operadores lógicos o de comparación, su tipo es booleano
        if (contieneOperadoresLogicosOComparacion(ctx)) {
            return "boolean";
        }

        String tipoActual = getTipoTermino(ctx.termino(0));

        for (int i = 0; i < ctx.operacion_aritmetica().size(); i++) {
            String op = ctx.operacion_aritmetica().get(i).getText();
            String tipoSiguiente = getTipoTermino(ctx.termino(i + 1));

            // Regla estricta de Textum: Solo se permite concatenación con '+'
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

            // Regla de división (/): por defecto produce decimalis si opera sobre números
            if (op.equals("/")) {
                tipoActual = "decimalis";
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

    private boolean contieneOperadoresLogicosOComparacion(Codex_latinusParser.ExpresionContext ctx) {
        String fullText = ctx.getText();
        return fullText != null && (
                fullText.contains("||") || fullText.contains("&&") ||
                        fullText.contains("==") || fullText.contains("!=") ||
                        fullText.contains("<") || fullText.contains(">") ||
                        fullText.contains("<=") || fullText.contains(">=")
        );
    }

    /**
     * Obtiene el tipo de dato correspondiente a un término individual (variable, número, cadena, arreglo, etc.).
     */
    public String getTipoTermino(Codex_latinusParser.TerminoContext termino) {
        if (termino == null) return "desconocido";

        if (termino.VARIABLE() != null) {
            String varName = termino.VARIABLE().getText();
            Symbol s = symbolTable.resolve(varName);
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

        // Si el término contiene un acceso a arreglo (ej. nombres[0])
        String terminoText = termino.getText();
        if (terminoText != null && terminoText.contains("[")) {
            String varName = terminoText.substring(0, terminoText.indexOf('['));
            Symbol s = symbolTable.resolve(varName);
            return (s != null) ? s.getType().toLowerCase() : "desconocido";
        }

        return "numerus";
    }

    /**
     * Define la jerarquía numérica de tipos para conversiones implícitas.
     */
    public int getJerarquia(String tipo) {
        if (tipo == null) return -1;
        switch (tipo.toLowerCase()) {
            case "textum":
                return 5;
            case "decimalis":
                return 4;
            case "numerus":
                return 3;
            case "littera":
                return 2;
            case "boolean":
            case "verum":
            case "falsus":
                return 1;
            default:
                return -1;
        }
    }

    /**
     * Retorna el nombre del tipo basado en su valor de jerarquía.
     */
    public String getTipoByJerarquia(int j) {
        switch (j) {
            case 5:
                return "textum";
            case 4:
                return "decimalis";
            case 3:
                return "numerus";
            case 2:
                return "littera";
            case 1:
                return "boolean";
            default:
                return "desconocido";
        }
    }
}