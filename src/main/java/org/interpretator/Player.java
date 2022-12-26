package org.interpretator;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.awt.*;

/**
 * @author Tomas Kozakas
 */
@Getter
@Setter
public class Player extends JComponent {
    private int xPos;
    private int yPos;
    private final int PLAYER_WIDTH = 10;
    private final int PLAYER_HEIGHT = 10;

    public void up(int val) {
        yPos -= val;
        revalidate();
        repaint();
    }

    public void down(int val) {
        yPos += val;
        revalidate();
        repaint();

    }

    public void left(int val) {
        xPos -= val;
        revalidate();
        repaint();

    }

    public void right(int val) {
        xPos += val;
        revalidate();
        repaint();
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int initialX = getWidth() / 2 - PLAYER_WIDTH / 2;
        int initialY = getHeight() / 2 - PLAYER_HEIGHT / 2;

        Graphics2D graphics2D = (Graphics2D) graphics;
        graphics2D.fillRect(xPos + initialX, yPos + initialY, PLAYER_WIDTH, PLAYER_HEIGHT);
        graphics2D.dispose();
    }
}
