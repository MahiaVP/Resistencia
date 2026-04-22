import Resistencia.Resistencia;
import Resistencia.*;
import javax.swing.*;

public class main {
    public static void main(String[] args){

        SwingUtilities.invokeLater(() -> {
            Resistencia ui = new Resistencia();
            JFrame frame = new JFrame("RCC");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(ui.getMainPanel());
            frame.setSize(600, 250);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}