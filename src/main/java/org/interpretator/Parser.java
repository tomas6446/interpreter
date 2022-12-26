package org.interpretator;

import java.util.Arrays;

/**
 * @author Tomas Kozakas
 */
public class Parser {
    private Player player;

    public Parser(Player player) {
        this.player = player;
    }

    public void parse(String text) {
        String[] instructions = text.split("\n; ");
        Arrays.stream(instructions).toList().forEach(System.out::println);

        Arrays.stream(instructions).toList().forEach(this::define);
    }

    private void define(String instruction) {
        switch (instruction) {
            case "up":
                player.up(5);
            case "down":
                player.down(5);
            case "left":
                player.left(5);
            case "right":
                player.right(5);
        }
    }
}
