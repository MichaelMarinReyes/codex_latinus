package codex_latinus;

import codex_latinus.frontend.MainWindow;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author michael
 */
public class Codex_latinus {

    public static void main(String[] args) {
        FlatArcDarkIJTheme.setup();
        
        UIManager.put("Button.arc", 8);
        UIManager.put("Component.arc", 8);
        UIManager.put("TextComponent.arc", 5);

        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}
