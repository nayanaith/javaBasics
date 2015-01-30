package foo.guingraphics;

import javax.swing.JOptionPane;

public class Addition {
	public static void main (String args[]){
//		int num1=JOptionPane.showInputDialog("Enter number 1: ");
//		int num2=JOptionPane.showInputDialog("Enter number 2: ");
		String str1=JOptionPane.showInputDialog("Enter number 1: ");
		int num1 = Integer.parseInt(str1);
		String str2=JOptionPane.showInputDialog("Enter number 2: ");	
		int num2 = Integer.parseInt(str2);
		
		String message=String.format("The answer is, %d, ",num1+num2);
		JOptionPane.showMessageDialog(null,message);
	}//end main
}//end class
