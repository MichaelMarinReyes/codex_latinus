package codex_latinus.backend.errors;

import org.antlr.v4.runtime.*;

import java.util.List;

public class CustomErrorListener extends BaseErrorListener {
    private final List<CompilationError> errorList;

    public CustomErrorListener(List<CompilationError> errorList) {
        this.errorList = errorList;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine, String msg,
                            RecognitionException e) {

        boolean isLexer = (recognizer instanceof Lexer);
        String errorType = isLexer ? "LEXICO" : "SINTACTICO";
        String friendlyMessage;

        if (isLexer) {
            String badChar = (offendingSymbol != null) ? offendingSymbol.toString() : "desconocido";
            friendlyMessage = "Carácter o símbolo no reconocido por el lenguaje: '" + badChar + "'.";
        } else {
            String tokenText = "";
            if (offendingSymbol instanceof Token) {
                tokenText = ((Token) offendingSymbol).getText();
            }

            if (msg != null && msg.contains("mismatched input")) {
                friendlyMessage = "Estructura incorrecta o token inesperado cerca de '" + tokenText + "'.";
            } else if (msg != null && msg.contains("extraneous input")) {
                friendlyMessage = "Hay un elemento sobrante o mal ubicado: '" + tokenText + "'.";
            } else if (msg != null && msg.contains("missing")) {
                friendlyMessage = "Falta un componente o delimitador obligatorio antes o cerca de '" + tokenText + "'.";
            } else if (msg != null && msg.contains("no viable alternative")) {
                friendlyMessage = "La sentencia no coincide con ninguna estructura válida del lenguaje cerca de '" + tokenText + "'.";
            } else {
                friendlyMessage = "Error de sintaxis cerca de '" + tokenText + "'. Verifique la gramática.";
            }
        }

        errorList.add(new CompilationError(errorType, friendlyMessage, line, charPositionInLine));
    }

    public boolean hasErrors() {
        return !errorList.isEmpty();
    }
}
