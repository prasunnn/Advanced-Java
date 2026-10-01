
package advanced.java;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.border.Border;

public class ChatForm implements ActionListener{
    JLabel label;
    JTextField text;
    JButton send;
    JButton reset;
    JTextArea ta;
    JMenuItem m11,m12,m13,m21,m22,m31,m32;
    JMenu m1,m2,m3,m4;
    JMenuBar mb;
    JFrame frame;
    File file;
    public void createForm(){
        mb = new JMenuBar();
        m1 = new JMenu("File");        
        m2 = new JMenu("View");
        m3 = new JMenu("Settings");
        m4 = new JMenu("Help");
        
        m11 = new JMenuItem("Open");
        m11.addActionListener(this);
        m12 = new JMenuItem("Save as");
        m12.addActionListener(this);
        m13 = new JMenuItem("Close");
        m13.addActionListener(this);
        
        m21 = new JMenuItem("Standard View");
        m22 = new JMenuItem("Custom View");
        
        m31 = new JMenuItem("Connection Settings");
        m32 = new JMenuItem("User Settings");
        
        m1.add(m11);        m1.add(m12);        m1.add(m13);
        m2.add(m21);        m2.add(m22);        
        m3.add(m31);        m3.add(m32);
        
        mb.add(m1);        mb.add(m2);        mb.add(m3);        mb.add(m4);
        
        JPanel panel = new JPanel();
        label = new JLabel("Enter Text");
        text = new JTextField(10);
        send = new JButton("Send");
        send.addActionListener(this);
        reset = new JButton("Reset");
        reset.addActionListener(this);
        
        panel.add(label);        
        panel.add(text);
        panel.add(send);
        panel.add(reset);
        Border blackline = BorderFactory.createEmptyBorder(5,5,5,5);
        panel.setBorder(blackline);
        panel.setBorder(BorderFactory.createTitledBorder("Chat"));
        
        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setEditable(false);
        ta.setForeground(Color.BLUE);
        Font font = new Font("Dotum",Font.BOLD,18);
        ta.setFont(font);
        
        frame = new JFrame("Chat Frame");
        frame.setJMenuBar(mb);
        frame.getContentPane().add(BorderLayout.CENTER,ta);        
        frame.getContentPane().add(BorderLayout.SOUTH,panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String args[]){
        ChatForm chat = new ChatForm();
        chat.createForm();
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(send)){
            ta.append(" "+text.getText()+"\n");
            clear();
        }
        if(e.getSource().equals(reset)){
            text.setText(" ");
        }
        if(e.getSource().equals(m11)){
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(frame);
        }
        if(e.getSource().equals(m12)){
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showSaveDialog(frame);
            if(option == JFileChooser.APPROVE_OPTION){
                file = fileChooser.getSelectedFile();
                //create();            
            }
        }
        if(e.getSource().equals(m13)){
        System.exit(0);
        }
    }
    public void clear(){
        text.setText(" ");
    }
    public void create() throws IOException{
        if(!file.exists())
            file.createNewFile();
        else
            JOptionPane.showMessageDialog(frame,"File already exists.");
    }           
}