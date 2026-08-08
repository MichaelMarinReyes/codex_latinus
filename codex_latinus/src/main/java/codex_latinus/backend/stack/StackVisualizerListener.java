package codex_latinus.backend.stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackVisualizerListener implements ParseTreeListener {
    private final List<StackState> history = new ArrayList<>();
    private final Stack<String> internalStack = new Stack<>();
    private int stepCounter = 0;

    public List<StackState> getHistory() {
        return history;
    }

    private void recordState(String operation) {
        List<String> stackSnapshot = new ArrayList<>(internalStack);
        history.add(new StackState(stepCounter++, stackSnapshot, operation));
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        String ruleName = ctx.getClass().getSimpleName().replace("Context", "");
        internalStack.push(ruleName);
        recordState("Entrar a regla: " + ruleName);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        String ruleName = ctx.getClass().getSimpleName().replace("Context", "");
        if (!internalStack.isEmpty() && internalStack.peek().equals(ruleName)) {
            internalStack.pop();
            recordState("Salir de regla: " + ruleName);
        }
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        String tokenText = node.getText();
        internalStack.push(tokenText);
        recordState("Reconocer token: " + tokenText);
        internalStack.pop();
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        recordState("Error sintáctico en: " + node.getText());
    }
}
