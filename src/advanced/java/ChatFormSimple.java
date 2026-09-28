//Simple chatform

package advanced.java;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class ChatFormSimple implements ActionListener {
    JLabel lbltext;
    JTextField txtmsg;
    JButton send;
    JButton btnsend;
    JButton btnreset;
    
    JTextArea txtarea;
    JPanel panel;
    JFrame frame;
     public void createForm(){
         lbltext=new JLabel("enter text:");
         txtmsg=new JTextField(10);
         btnsend=new JButton("send");
         btnsend.addActionListener(this);
         btnreset=new JButton("Reset");
         btnreset.addActionListener(this);
         panel=new JPanel();
         panel.add(lbltext);
         panel.add(txtmsg);
         panel.add(btnsend);
         panel.add(btnreset);
         
       Border blackline = BorderFactory.createEmptyBorder(5,5,5,5);
        panel.setBorder(blackline);
        panel.setBorder(BorderFactory.createTitledBorder("Chat"));

        txtarea = new JTextArea();
        txtarea.setLineWrap(true);
        txtarea.setEditable(false);
        txtarea.setForeground(Color.blue);
        Font font=new Font("Dotum",Font.BOLD,18);
        txtarea.setFont(font);

        frame = new JFrame("Chat Frame");          
        frame.getContentPane().add(BorderLayout.CENTER, txtarea);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
         
    }
     public void actionPerformed(ActionEvent e){
         if(e.getSource().equals(btnsend)){
             if(btnsend.getText()!=""){
                 txtarea.append(" "+txtmsg.getText()+"\n");
                 txtmsg.setText("");
             }
         }
         if(e.getSource().equals(btnreset)){
             txtmsg.setText("");
         }
     }
     
     public static void main(String args[]){
         ChatFormSimple chat=new ChatFormSimple();
         chat.createForm();
     }
    
   }