package codex_latinus.backend.handlers;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.errors.CompilationError;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Manejador encargado de gestionar la ejecución, profundidad y control de saltos
 * dentro de los bucles (dum, facere, per) del lenguaje Codex Latinus.
 */
public class LoopHandler {

    private int loopDepth = 0;
    private final List<CompilationError> semanticErrors;

    public LoopHandler(List<CompilationError> semanticErrors) {
        this.semanticErrors = semanticErrors != null ? semanticErrors : new ArrayList<>();
    }

    /**
     * Procesa el ciclo 'dum' incrementando la profundidad y capturando interrupciones.
     */
    public Object handleCicloDum(Codex_latinusParser.Ciclo_dumContext ctx, Function<ParserRuleContext, Object> bodyVisitor) {
        loopDepth++;
        Object res = null;
        try {
            res = bodyVisitor.apply(ctx);
        } catch (BreakException e) {
            // Captura la interrupción y sale del bucle limpiamente
        } finally {
            loopDepth--;
        }
        return res;
    }

    /**
     * Procesa el ciclo 'facere' incrementando la profundidad y capturando interrupciones.
     */
    public Object handleCicloFacere(Codex_latinusParser.Ciclo_facereContext ctx, Function<ParserRuleContext, Object> bodyVisitor) {
        loopDepth++;
        Object res = null;
        try {
            res = bodyVisitor.apply(ctx);
        } catch (BreakException e) {
            // Captura la interrupción
        } finally {
            loopDepth--;
        }
        return res;
    }

    /**
     * Procesa el ciclo 'per' incrementando la profundidad y capturando interrupciones.
     */
    public Object handleCicloPer(Codex_latinusParser.Ciclo_perContext ctx, Function<ParserRuleContext, Object> bodyVisitor) {
        loopDepth++;
        Object res = null;
        try {
            res = bodyVisitor.apply(ctx);
        } catch (BreakException e) {
            // Captura la interrupción
        } finally {
            loopDepth--;
        }
        return res;
    }

    /**
     * Valida que las sentencias de salto (interrupción/break) se utilicen únicamente dentro de un ciclo.
     */
    public Object handleSaltoSentencia(Codex_latinusParser.Salto_sentenciaContext ctx, Function<ParserRuleContext, Object> bodyVisitor) {
        if (loopDepth <= 0) {
            String palabraClave = ctx.getStart().getText();
            semanticErrors.add(new CompilationError(
                    "SEMÁNTICO",
                    "La instrucción '" + palabraClave + "' solo puede ser utilizada dentro de un ciclo (dum, facere o per).",
                    ctx.getStart().getLine(),
                    ctx.getStart().getCharPositionInLine()
            ));
        }
        return bodyVisitor.apply(ctx);
    }

    public int getLoopDepth() {
        return loopDepth;
    }

    /**
     * Excepción interna utilizada para propagar la interrupción (*break*) en los bucles.
     */
    public static class BreakException extends RuntimeException {
    }
}