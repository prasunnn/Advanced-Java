package advanced.java;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyDemo2 extends KeyAdapter{
    String line1="";
    JTextArea txtarea;
    public void form(){
        txtarea = new JTextArea(10,15);
        txtarea.setText("Press any key on the keyboard...");
        txtarea.setEnabled(false);
        txtarea.setBackground(Color.BLUE);
        txtarea.setFont(new Font("Arial",Font.BOLD,14));
        
        JFrame frame = new JFrame("KeyEvent Example...");
        frame.add(txtarea);
        frame.addKeyListener(this);
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void setLine(KeyEvent e){
        txtarea.setText(String.format(line1));
    }
    public static void main(String args[]){
        KeyDemo d = new KeyDemo();
        d.form();
    }
}
