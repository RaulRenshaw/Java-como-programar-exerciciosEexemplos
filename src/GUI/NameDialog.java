package GUI;

import javax.swing.*;

public class NameDialog {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("What is your name?");

        String menssage = String.format("Welcome, %s, to Java Programming", name);

        JOptionPane.showMessageDialog(null, menssage);
    }
}
