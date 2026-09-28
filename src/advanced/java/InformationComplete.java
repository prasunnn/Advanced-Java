
package advanced.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InformationComplete implements ActionListener {

    JLabel lblname, lbladdress, lbllevel;
    JTextField txtname, txtaddress, txtlevel;
    JButton btnregister;
    JFrame frame;
    JPanel panel;

    void display() {
        // Create components
        lblname = new JLabel("Name:");
        lbladdress = new JLabel("Address:");
        lbllevel = new JLabel("Level:");

        txtname = new JTextField();
        txtaddress = new JTextField();
        txtlevel = new JTextField();

        btnregister = new JButton("Register");
        btnregister.addActionListener(this);

        // Set bounds
        lblname.setBounds(10, 20, 80, 25);
        lbladdress.setBounds(10, 60, 80, 25);
        lbllevel.setBounds(10, 100, 80, 25);
        txtname.setBounds(100, 20, 160, 25);
        txtaddress.setBounds(100, 60, 160, 25);
        txtlevel.setBounds(100, 100, 160, 25);
        btnregister.setBounds(100, 150, 100, 25);

        // Create panel
        panel = new JPanel();
        panel.setLayout(null);

        // Add components to panel
        panel.add(lblname);
        panel.add(lbladdress);
        panel.add(lbllevel);
        panel.add(txtname);
        panel.add(txtaddress);
        panel.add(txtlevel);
        panel.add(btnregister);

        // Create frame
        frame = new JFrame("Data Entry Form");
        frame.add(panel);
        frame.setSize(300, 240);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnregister)) {
            if (!txtname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Successfully registered");
                String tname = txtname.getText();
                String taddress = txtaddress.getText();
                String tlevel = txtlevel.getText();
                newDisplay(tname, taddress, tlevel);
            } else {
                JOptionPane.showMessageDialog(frame, "Name cannot be empty");
            }
        }
    }

    void newDisplay(String tname, String taddress, String tlevel) {
        // Create a new frame to display the entered information
        JFrame displayFrame = new JFrame("Registered Information");
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(null);

        JLabel nameLabel = new JLabel("Name: " + tname);
        JLabel addressLabel = new JLabel("Address: " + taddress);
        JLabel levelLabel = new JLabel("Level: " + tlevel);

        nameLabel.setBounds(10, 20, 250, 25);
        addressLabel.setBounds(10, 60, 250, 25);
        levelLabel.setBounds(10, 100, 250, 25);

        displayPanel.add(nameLabel);
        displayPanel.add(addressLabel);
        displayPanel.add(levelLabel);

        displayFrame.add(displayPanel);
        displayFrame.setSize(300, 200);
        displayFrame.setLocationRelativeTo(null);
        displayFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        displayFrame.setVisible(true);
    }

    public static void main(String[] args) {
        InformationComplete info = new InformationComplete();
        info.display();
    }
}