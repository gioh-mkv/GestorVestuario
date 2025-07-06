package gvp;

import javax.swing.SwingUtilities;
import gvp.view.TelaPrincipal;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }
}

