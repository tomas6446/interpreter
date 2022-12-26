package org.interpretator;

import lombok.SneakyThrows;

import javax.swing.*;
import java.util.Arrays;

/**
 * @author Tomas Kozakas
 */
public class Parser {
    private final Player player;

    public Parser(Player player) {
        this.player = player;


    }

    public void parse(String text) {
        String[] instructions = text.split("\n");
        Arrays.stream(instructions).toList().forEach(System.out::println);
        Arrays.stream(instructions).toList().forEach(this::define);

    }

    @SneakyThrows
    private void define(String instruction) {
        new Timer(1000, e -> {
            switch (instruction) {
                case "up" -> player.up();
                case "down" -> player.down();
                case "left" -> player.left();
                case "right" -> player.right();
                default -> throw new IllegalStateException("Unexpected value: " + instruction);
            }
            player.repaint();
        }).start();

    }
}
