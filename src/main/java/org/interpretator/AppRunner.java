package org.interpretator;

import javax.swing.*;

/**
 * @author Tomas Kozakas
 */
public class AppRunner {
    public static void main(String[] args) {
        Player player = new Player();

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("App");
            frame.setContentPane(new Interpreter(player).getjPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            frame.add(player);
            frame.pack();
            frame.setSize(1200, 800);
            frame.setVisible(true);
        });
    }
}
