//Event Handling Program 1 


package advanced.java;
import javax.swing.*;
import java.awt.event.*;
public class EventSample implements ActionListener{
    JButton btnopen, btnedit, btnsave;
    JLabel lbllabel;
    public void setButtons(){
        btnopen = new JButton("Open");
        btnopen.setBounds(30,20,200,25);
        btnopen.addActionListener(this);
        
        btnedit = new JButton("Edit");
        btnedit.setBounds(30,50,200,25);
        btnedit.addActionListener(this);
        
        btnsave = new JButton("Save");
        btnsave.setBounds(30,80,200,25);
        btnsave.addActionListener(this);
        
        lbllabel = new JLabel();
        lbllabel.setBounds(40,140,150,25);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        panel.add(btnopen);        
        panel.add(btnedit);
        panel.add(btnsave);
        panel.add(lbllabel);
        
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setTitle("Button in Action");
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnopen)){
            lbllabel.setText("You clicked open button!!!");
        }
        else if(e.getSource().equals(btnedit)){
            lbllabel.setText("You clicked edit button!!!");
        }
        else if(e.getSource().equals(btnsave)){
            lbllabel.setText("You clicked save button!!!");
        }
    }
    public static void main(String args[]){
        EventSample sam = new EventSample();
        sam.setButtons();
    }
}