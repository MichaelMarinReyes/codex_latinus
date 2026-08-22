package codex_latinus.frontend;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author michael
 */
public class LineNumberComponent extends JPanel {

    private final JTextPane textArea;

    public LineNumberComponent(JTextPane textArea) {
        this.textArea = textArea;
        setBackground(new Color(230, 230, 230));
        setForeground(new Color(120, 120, 120));

        // Establecer un ancho fijo inicial seguro
        setPreferredSize(new Dimension(45, 0));

        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateWidthAndRepaint();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateWidthAndRepaint();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateWidthAndRepaint();
            }
        });
    }

    private void updateWidthAndRepaint() {
        // Opcional: ajustar el ancho dinámicamente si hay más de 999 líneas, 
        // pero fuera del ciclo de pintado.
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(textArea.getFont());
        java.awt.FontMetrics fm = g.getFontMetrics();

        try {
            int height = fm.getHeight();
            int lines = textArea.getDocument().getDefaultRootElement().getElementCount();

            int y = fm.getAscent();
            for (int i = 0; i < lines; i++) {
                String lineNumStr = String.valueOf(i + 1);
                g.drawString(lineNumStr, getWidth() - fm.stringWidth(lineNumStr) - 10, y);
                y += height;
            }
        } catch (Exception e) {
            // Manejo de excepciones
        }

        // ¡ELIMINADO! Ya no se llama a setPreferredSize aquí dentro.
    }
}
