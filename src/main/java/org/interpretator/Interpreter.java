package org.interpretator;

import javax.swing.*;

/**
 * @author Tomas Kozakas
 */

public class Interpreter {
    private JPanel jPanel;
    private JTextArea codeArea;
    private JButton parse;
    private final Parser parser;

    public Interpreter(Player player) {
        parser = new Parser(player);

        parse.addActionListener(e -> parser.parse(codeArea.getText()));
    }

    public JPanel getjPanel() {
        return jPanel;
    }

}
