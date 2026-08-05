package codex_latinus;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMaterialLighterIJTheme;
import codex_latinus.frontend.MainWindow;
import javax.swing.SwingUtilities;

/**
 *
 * @author michael
 */
public class Codex_latinus {

    public static void main(String[] args) {
        FlatMTMaterialLighterIJTheme.setup();

        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}
