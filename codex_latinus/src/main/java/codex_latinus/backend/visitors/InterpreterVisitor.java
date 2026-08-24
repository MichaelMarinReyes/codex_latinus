package codex_latinus.backend.visitors;

import codex_latinus.Codex_latinusBaseVisitor;
import codex_latinus.Codex_latinusParser;
import codex_latinus.backend.symbols.Symbol;
import codex_latinus.backend.symbols.SymbolTable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InterpreterVisitor extends Codex_latinusBaseVisitor<Object> {

    private final SymbolTable symbolTable;
    private final Queue<String> mockInputs;
    private final StringBuilder consoleOutput;

    public InterpreterVisitor(SymbolTable symbolTable, List<String> predefinedInputs) {
        this.symbolTable = symbolTable != null ? symbolTable : new SymbolTable();
        this.mockInputs = new LinkedList<>(predefinedInputs != null ? predefinedInputs : new ArrayList<>());
        this.consoleOutput = new StringBuilder();
    }

    public String getConsoleOutput() {
        return consoleOutput.toString();
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Object visitImprimir_sentencia(Codex_latinusParser.Imprimir_sentenciaContext ctx) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            String text = child.getText();

            if (text.equals(">>") || text.equals(";")) {
                continue;
            }

            if (text.startsWith("\"") && text.endsWith("\"")) {
                // Quitar comillas a las cadenas literales
                output.append(text.substring(1, text.length() - 1));
            } else {
                // Buscar si es una variable y obtener su valor actual
                Symbol sym = symbolTable.resolve(text);
                if (sym != null && sym.getValue() != null) {
                    output.append(sym.getValue());
                } else {
                    Object val = visit(child);
                    if (val != null) output.append(val);
                }
            }
            output.append(" ");
        }

        String lineaImpresa = output.toString().trim();
        System.out.println(lineaImpresa); // Muestra en consola
        consoleOutput.append(lineaImpresa).append("\n");
        return null;
    }
/*
    @Override
    public Object visitReddere(Codex_latinusParser.Reddere_sentenciaContext ctx) {
        if (ctx.expresion() != null) {
            return visit(ctx.expresion());
        }
        return null;
    }*/

    @Override
    public Object visitLeer_sentencia(Codex_latinusParser.Leer_sentenciaContext ctx) {
        if (ctx.VARIABLE() != null) {
            String varName = ctx.VARIABLE().getText();
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                String valorSimulado = mockInputs.poll();
                if (valorSimulado == null) {
                    valorSimulado = "";
                }

                sym.setValue(valorSimulado);

                System.out.println(valorSimulado);
                consoleOutput.append(valorSimulado).append("\n");
            }
        }
        return null;
    }

    @Override
    public Object visitAsignacion_sentencia(Codex_latinusParser.Asignacion_sentenciaContext ctx) {
        String varName = ctx.VARIABLE() != null ? ctx.VARIABLE().getText() : null;
        if (varName != null && ctx.expresion() != null) {
            Object evaluatedValue = visit(ctx.expresion());
            Symbol sym = symbolTable.resolve(varName);
            if (sym != null) {
                sym.setValue(evaluatedValue);
            }
        }
        return super.visitAsignacion_sentencia(ctx);
    }
}