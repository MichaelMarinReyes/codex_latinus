package codex_latinus.backend.handlers;

import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.symbols.SymbolTable;
import codex_latinus.backend.visitors.InterpreterVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Manejador encargado de gestionar las sentencias de control de flujo y saltos
 * (como retornos de función y rupturas de bucles) en el lenguaje Codex Latinus.
 */
public class ControlFlowHandler {

    private final InterpreterVisitor visitor;
    private SymbolTable symbolTable;

    /**
     * Constructor para inicializar el manejador de control de flujo.
     *
     * @param visitor Instancia del visitante principal del intérprete.
     * @param symbolTable Tabla de símbolos actual.
     */
    public ControlFlowHandler(InterpreterVisitor visitor, SymbolTable symbolTable) {
        this.visitor = visitor;
        this.symbolTable = symbolTable;
    }

    /**
     * Actualiza la tabla de símbolos asociada al manejador.
     *
     * @param symbolTable Nueva tabla de símbolos.
     */
    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    /**
     * Procesa la sentencia de salto (*salto_sentencia*), interceptando palabras clave
     * para interrumpir bucles o retornar valores desde funciones.
     *
     * @param ctx Contexto de la sentencia de salto en el análisis sintáctico.
     * @return El resultado de la evaluación interna si aplica.
     */
    public Object handleSaltoSentencia(Codex_latinusParser.Salto_sentenciaContext ctx) {
        String text = ctx.getText();
        if (text != null && text.contains("interrumpe")) {
            throw new BreakException();
        }
        if (text != null && text.startsWith("reddere")) {
            Object valorRetorno = null;
            for (int i = 0; i < ctx.getChildCount(); i++) {
                ParseTree child = ctx.getChild(i);
                if (child instanceof Codex_latinusParser.ExpresionContext) {
                    valorRetorno = visitor.visit(child);
                    break;
                }
            }
            throw new ReturnException(valorRetorno);
        }
        return visitor.visitChildren(ctx);
    }

    /**
     * Excepción interna utilizada para propagar la interrupción (*break*) a través de los bloques y bucles.
     */
    public static class BreakException extends RuntimeException {
    }

    /**
     * Excepción interna utilizada para gestionar y propagar el valor de retorno (*return*)
     * desde el cuerpo de una función hacia su invocador.
     */
    public static class ReturnException extends RuntimeException {
        private final Object value;

        public ReturnException(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }
    }
}