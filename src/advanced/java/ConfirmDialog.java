package advanced.java;

import javax.swing.*;
public class ConfirmDialog {
    public static void main (String [] args){
        String name = JOptionPane.showInputDialog(null,"What is your name?");
        int choice = JOptionPane.showConfirmDialog(null,"Do you like music, " + name + "?");
        switch(choice){
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null,"Sureeeee buddy :/");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null,"What a loser");
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null,"Afraid of a little question? :(");
        }
        System.exit(0);
    }
}
