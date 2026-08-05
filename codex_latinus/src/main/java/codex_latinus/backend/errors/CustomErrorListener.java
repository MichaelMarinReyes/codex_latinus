package codex_latinus.backend.errors;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

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

        String errorType = (recognizer instanceof Lexer) ? "LEXICO" : "SINTACTICO";

        errorList.add(new CompilationError(errorType, msg, line, charPositionInLine));
    }

    public boolean hasErrors() {
        return !errorList.isEmpty();
    }
}
