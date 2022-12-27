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
public class Player extends JPanel {

    private final int PLAYER_WIDTH = 50;
    private final int PLAYER_HEIGHT = 50;
    private int xPos;
    private int yPos;

    public void up() {
        yPos -= PLAYER_HEIGHT;
    }

    public void down() {
        yPos += PLAYER_HEIGHT;
    }

    public void left() {
        xPos -= PLAYER_WIDTH;
    }

    public void right() {
        xPos += PLAYER_WIDTH;
    }

    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.RED);
        graphics.fillRect(xPos, yPos, PLAYER_WIDTH, PLAYER_HEIGHT);
        repaint();
    }
}
