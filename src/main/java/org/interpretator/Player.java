package org.interpretator;

import javax.swing.*;
import java.awt.*;

/**
 * @author Tomas Kozakas
 */
public class Player extends JComponent {
    public Player() {

    }

    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.fillRect(10, 10, 10, 10);
    }
}
