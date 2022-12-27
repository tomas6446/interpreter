package org.interpretator;

import java.util.Arrays;
import java.util.List;

/**
 * @author Tomas Kozakas
 */
public enum Instruction {

    UP(List.of("up", "player.up()")),
    DOWN(List.of("down", "player.down()")),
    LEFT(List.of("left", "player.left()")),
    RIGHT(List.of("right", "player.right()")),
    LOOP(List.of("for")),
    ERROR(List.of("error"));

    private final List<String> operation;

    Instruction(List<String> operation) {
        this.operation = operation;
    }

    public static Instruction getEnum(String instruction) {
        return Arrays.stream(values())
                .filter(value -> value.operation.contains(instruction))
                .findFirst()
                .orElse(ERROR);
    }
}
