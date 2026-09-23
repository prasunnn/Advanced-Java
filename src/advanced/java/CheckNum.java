//Positive Negative or Zero

package advanced.java;
import java.awt.event.*;
import javax.swing.*;
public class CheckNum implements ActionListener{
    JLabel lblnum, lblresult;
    JTextField txtnum;
    JButton btncheck;
    JFrame frame;
    JPanel panel;
    
    void createForm(){
        lblnum = new JLabel ("Enter a number: ");
        lblresult = new JLabel();
        txtnum = new JTextField(10);
        
        btncheck = new JButton("Check");
        btncheck.addActionListener(this);
        
        lblnum.setBounds(80,40,120,20);        
        txtnum.setBounds(200,40,120,20);
        btncheck.setBounds(150,80,120,20);
        lblresult.setBounds(150,120,200,20);
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(lblnum);        
        panel.add(txtnum);
        panel.add(btncheck);
        panel.add(lblresult);
        
        frame = new JFrame("Checking the number");
        frame.add(panel);
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btncheck)){
            int a = Integer.parseInt(txtnum.getText());
            if(a>0)
                lblresult.setText("It is positive");
            else if (a<0)
                lblresult.setText("It is negative");
            else if (a==0)
                lblresult.setText("It is zero");
        }
    }
    public static void main(String args[]){
        CheckNum c = new CheckNum();
        c.createForm();
    }
}
