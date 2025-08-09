package GUI;

import javax.swing.*;

public class SomaGUI {

    public static void main(String[] args) {

        String numero1 = JOptionPane.showInputDialog(null,"qual primeiro numero?");
        String numero2= JOptionPane.showInputDialog(null,"qual segundo numero?");

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);
        int total = num1 + num2;

        JOptionPane.showMessageDialog(null, total);
    }
}
