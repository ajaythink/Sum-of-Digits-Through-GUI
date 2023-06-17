package mypac;

import javax.swing.JOptionPane;

public class JarFileCreate {
	public static void main(String... args) {
		
	
	String firstNumber = JOptionPane.showInputDialog("Enter the First Number");
	String secondNumber = JOptionPane.showInputDialog("Enter the Second Number");
	
	int num1 = Integer.parseInt(firstNumber);
	int num2 = Integer.parseInt(secondNumber);
	
	int sum = num1 + num2;
	
	JOptionPane.showMessageDialog(null, "The sum is " +sum,"Sum of Two Numbers",JOptionPane.PLAIN_MESSAGE);
	}
}
