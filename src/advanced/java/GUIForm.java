
package advanced.java;
import javax.swing.*;
import java.awt.event.*;
public class GUIForm implements ActionListener{
    JLabel lblname, lblpassword, lblcountry, lblgender, lbllevel, lblpackage;
    JLabel lname, lpassword, lcountry, lgender, llevel, lpackage;
    JTextField txtname;
    JPasswordField txtpassword;
    JCheckBox chkmale, chkfemale;
    JComboBox <String> cmb;
    JList list;
    JRadioButton rdo1, rdo2;
    JButton btnsubmit;
    JFrame frame;
    JPanel panel;
    public void createform(){
        lblname = new JLabel ("Name");        
        lblpassword = new JLabel ("Password");
        lblcountry = new JLabel ("Country");
        lblgender = new JLabel ("Gender");
        lbllevel = new JLabel ("Level");
        lblpackage = new JLabel ("Package");
        
        txtname = new JTextField();
        txtpassword = new JPasswordField();
        
        chkmale = new JCheckBox("Male");        
        chkfemale = new JCheckBox("Female");
        
        cmb = new JComboBox();
        cmb.addItem("Nepal");        
        cmb.addItem("USA");
        cmb.addItem("UK");
        cmb.addItem("Australia");
        cmb.addItem("Germany");
        
        String level[]={"Schooling","Intermediate","Bachelors","Masters","Doctorate"};
        list = new JList(level);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(list);
        
        rdo1 = new JRadioButton ("Standard");
        rdo2 = new JRadioButton ("Premium");
        
        ButtonGroup bg1 = new ButtonGroup();        
        ButtonGroup bg2 = new ButtonGroup();
        bg1.add(chkmale);        bg1.add(chkfemale);        
        bg2.add(rdo1);        bg2.add(rdo2);
        btnsubmit = new JButton("Submit");
        
        lblname.setBounds(50,40,200,25);        
        lblpassword.setBounds(50,80,200,25);
        lblcountry.setBounds(50,120,200,25);
        lblgender.setBounds(50,160,200,25);
        lbllevel.setBounds(50,200,200,25);
        lblpackage.setBounds(50,300,200,25);

        txtname.setBounds(250,40,150,25);        
        txtpassword.setBounds(250,80,150,25);
        cmb.setBounds(250,120,150,25);
        chkmale.setBounds(250,160,100,25);
        chkfemale.setBounds(350,160,100,25);
        scrollPane.setBounds(250,200,200,75);
        rdo1.setBounds(250,300,100,25);        
        rdo2.setBounds(350,300,100,25);

        btnsubmit.setBounds(200,380,100,30);
        btnsubmit.setToolTipText("Add a record");
        btnsubmit.addActionListener(this);

        frame = new JFrame("Register Form");
        panel = new JPanel();
        panel.setLayout(null);
        
        panel.add(lblname);        
        panel.add(lblpassword);
        panel.add(lblcountry);
        panel.add(lblgender);
        panel.add(lbllevel);
        panel.add(lblpackage);
        panel.add(txtname);
        panel.add(txtpassword);
        panel.add(cmb);
        panel.add(btnsubmit);
        panel.add(chkmale);        
        panel.add(chkfemale);
        panel.add(scrollPane);
        panel.add(rdo1);        
        panel.add(rdo2);
        
        frame.getContentPane().add(panel);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(btnsubmit)){
            JOptionPane.showMessageDialog(frame,"Information recorded successfully");
            String name = txtname.getText();
            String password = String.valueOf(txtpassword.getPassword());
            String country = cmb.getSelectedItem().toString();
            String gender;
            if(chkmale.isSelected())
                gender = "Male";
            else
                gender = "Female";
            String level = list.getSelectedValue().toString();
            String pack;
            if(rdo1.isSelected())
                pack = "Standard";
            else
                pack = "Premium";
            createNewForm(name,password,country,gender,level,pack);
        }
    }
    public void createNewForm(String name, String password, String country, String gender, String level, String pack){
        lblname = new JLabel("Name");        
        lblpassword = new JLabel("Passowrd");
        lblcountry = new JLabel("Country");
        lblgender = new JLabel("Gender");
        lbllevel = new JLabel("Selected Level");
        lblpackage = new JLabel("Selected Package");
        
        lname = new JLabel();        
        lpassword = new JLabel();
        lcountry = new JLabel();
        lgender = new JLabel();
        llevel = new JLabel();
        lpackage = new JLabel();
        
        lname.setText(name);
        lpassword.setText(password);
        lcountry.setText(country);
        lgender.setText(gender);
        llevel.setText(level);
        lpackage.setText(pack);
        
        lblname.setBounds(50,40,200,25);        
        lblpassword.setBounds(50,80,200,25);
        lblcountry.setBounds(50,120,200,25);
        lblgender.setBounds(50,160,200,25);
        lbllevel.setBounds(50,200,200,25);
        lblpackage.setBounds(50,240,200,25);
        
        lname.setBounds(250,40,150,25);        
        lpassword.setBounds(250,80,150,25);
        lcountry.setBounds(250,120,150,25);
        lgender.setBounds(250,160,150,25);
        llevel.setBounds(250,200,150,25);
        lpackage.setBounds(250,240,100,25);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        panel.add(lblname);        
        panel.add(lblpassword);
        panel.add(lblcountry);
        panel.add(lblgender);
        panel.add(lbllevel);
        panel.add(lblpackage);
        panel.add(lname);
        panel.add(lpassword);
        panel.add(lcountry);
        panel.add(lgender);
        panel.add(llevel);
        panel.add(lpackage);
        
        frame = new JFrame("Registered Infromation");
        frame.add(panel);
        //frame.getContentPane().add(panel);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String [] args){
        GUIForm fm = new GUIForm();
        fm.createform();
    }
}
