package foo.guingraphics;

import javax.swing.JOptionPane;

public class NameDialog {
	public static void main(String args[]){
		//prompt to user to enter name
		String name=JOptionPane.showInputDialog("What is your name?");
		
		//create message
		String message=String.format("Welcome , %s, to Java programing..!",name);
		JOptionPane.showMessageDialog(null,message);
	}//end main
}//end class
