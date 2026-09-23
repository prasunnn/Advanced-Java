//PLargest among three numbers

package advanced.java;
import java.awt.event.*;
import javax.swing.*;
public class Largest implements ActionListener{
    JLabel lblnum1, lblnum2, lblnum3, lblresult;
    JTextField txtnum1, txtnum2, txtnum3;
    JButton btncheck;
    JFrame frame;
    JPanel panel;
    
    void createForm(){
        lblnum1 = new JLabel ("Enter first number: ");
        lblnum2 = new JLabel ("Enter second number: ");
        lblnum3 = new JLabel ("Enter third number: ");
        lblresult = new JLabel();
        txtnum1 = new JTextField(10);
        txtnum2 = new JTextField(10);
        txtnum3 = new JTextField(10);
        
        btncheck = new JButton("Check");
        btncheck.addActionListener(this);
        
        
        lblnum1.setBounds(80,40,135,20);        
        txtnum1.setBounds(220,40,120,20);
        
        lblnum2.setBounds(80,70,135,20);        
        txtnum2.setBounds(220,70,120,20);
        
        lblnum3.setBounds(80,100,135,20);        
        txtnum3.setBounds(220,100,120,20);
        
        btncheck.setBounds(220,130,120,20);
        lblresult.setBounds(120,180,200,20);
        
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(lblnum1);        
        panel.add(txtnum1);
        panel.add(lblnum2);        
        panel.add(txtnum2);
        panel.add(lblnum3);        
        panel.add(txtnum3);
        panel.add(btncheck);
        panel.add(lblresult);
        
        frame = new JFrame("Checking the number");
        frame.add(panel);
        frame.setSize(400,250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btncheck)){
            int a = Integer.parseInt(txtnum1.getText());            
            int b = Integer.parseInt(txtnum2.getText());
            int c = Integer.parseInt(txtnum3.getText());

            if(a>b && a>c)
                lblresult.setText(a + " is the Largest");
            else if (b>a && b>c)
                lblresult.setText(b + " is the Largest");
            else if (c>a && b<c)
                lblresult.setText(c + " is the Largest");
        }
    }
    public static void main(String args[]){
        Largest c = new Largest();
        c.createForm();
    }
}
