package codex_latinus.backend;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DotGenerator {
    private int idCounter = 0;

    public String generarDot(ParseTree root) {
        idCounter = 0;
        StringBuilder dot = new StringBuilder();
        dot.append("digraph G {\n");
        dot.append("  node [shape=box, style=filled, fillcolor=lightblue];\n");

        recorrerNodo(root, dot);

        dot.append("}\n");
        return dot.toString();
    }

    private void recorrerNodo(ParseTree node, StringBuilder dot) {
        if (node == null) return;

        int currentId = idCounter++;

        String label = node.getClass().getSimpleName();
        if (node instanceof TerminalNode) {
            label = node.getText();
        }

        dot.append("  node").append(currentId)
                .append(" [label=\"").append(label.replace("\"", "\\\"")).append("\"];\n");

        int childCount = node.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ParseTree child = node.getChild(i);
            int childId = idCounter;
            recorrerNodo(child, dot);
            dot.append("  node").append(currentId)
                    .append(" -> node").append(childId).append(";\n");
        }
    }
}
