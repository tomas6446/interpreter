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

    @SneakyThrows
    public void parse(String text) {
        String[] instructions = text.split("[\n ]");
        Arrays.stream(instructions).toList().forEach(System.out::println);

        int i = 1;
        for (String instruction : Arrays.stream(instructions).toList()) {
            Timer timer = new Timer(i++ * 700, e -> processInstruction(Instruction.getEnum(instruction)));
            timer.start();
            timer.setRepeats(false);
        }
    }

    private void processInstruction(Instruction instruction) {
        switch (instruction) {
            case UP -> player.up();
            case DOWN -> player.down();
            case LEFT -> player.left();
            case RIGHT -> player.right();
            default -> throw new IllegalStateException("Unexpected value: " + instruction);
        }
    }
}
