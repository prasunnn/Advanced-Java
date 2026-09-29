package advanced.java;

import javax.swing.*;
public class DialogNum {
    public static void main (String [] args){
        String num1, num2, num3;
        int a,b,c,greatest;
        num1= JOptionPane.showInputDialog("Enter first number: ");        
        num2= JOptionPane.showInputDialog("Enter second number: ");
        num3= JOptionPane.showInputDialog("Enter third number: ");
        
        a= Integer.parseInt(num1);        
        b= Integer.parseInt(num2);
        c= Integer.parseInt(num3);
        
        if(a>b && a>c)  greatest = a;        
        else if(a<b && b>c)  greatest = b;
        else  greatest = c;

        JOptionPane.showMessageDialog(null, "Greatest number is: " + greatest);
        System.exit(0);
    }
}
