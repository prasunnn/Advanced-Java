//Colour Changing Buttons RGB

package advanced.java;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class RGB implements ActionListener{
    JButton btnred, btngreen, btnblue;
    JFrame frame;
    public void eventHandler(){
        btnred = new JButton("Red color");        
        btngreen = new JButton("Green color");
        btnblue = new JButton("Blue color");
        
        btnred.setActionCommand("red");        
        btngreen.setActionCommand("green");
        btnblue.setActionCommand("blue");
        
        btnred.addActionListener(this);        
        btngreen.addActionListener(this);
        btnblue.addActionListener(this);
        
        frame = new JFrame();
        FlowLayout f1 = new FlowLayout();
        frame.setLayout(f1);
        
        frame.add(btnred);        
        frame.add(btngreen);
        frame.add(btnblue);
        
        frame.setTitle("Button in Action");
        frame.setSize(300,350);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String str = e.getActionCommand();
        
        if(str.equals("red")){
            frame.getContentPane().setBackground(Color.red);
        }
        else if(str.equals("green")){
            frame.getContentPane().setBackground(Color.green);
        }
        else if(str.equals("blue")){
            frame.getContentPane().setBackground(Color.blue);
        }
    }
    public static void main(String args[]){
        RGB r = new RGB();
        r.eventHandler();
    }
}