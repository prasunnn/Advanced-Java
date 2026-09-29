
package advanced.java;

import javax.swing.*;
public class Calculator {
    public static void main(String [] args){
        String num1, num2, operation;
        int a,b,result=0;
        num1= JOptionPane.showInputDialog("Enter first number");        
        num2= JOptionPane.showInputDialog("Enter second number");
        
        a= Integer.parseInt(num1);        
        b= Integer.parseInt(num2);
        
        operation = JOptionPane.showInputDialog("What operation do you want to perform? (+ , - , * , /)");
        switch(operation){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please input valid operator!");
                System.exit(0);
        }
        JOptionPane.showMessageDialog(null, a + " " + operation + " " + b + " = " + result);
        System.exit(0);
    }
}
