package foo.firstOnes;

import java.util.Scanner;


public class AccountUse {
	public static void main(String args[]){
		double iniBalance;
		double credit;
		Scanner input= new Scanner(System.in);
		
		//creating an account with initial balance
		System.out.println("Enter the initial balance: ");
		iniBalance=input.nextDouble();
		Account myAc1=new Account(iniBalance);
		System.out.printf("The initial balance is: %f\n",myAc1.getBalance());
	
		//Crediting and displaying the money
		System.out.println("Enter the amount to credit");
		credit=input.nextDouble();
		myAc1.credit(credit);
		
		System.out.printf("The balance after credting is: %f",myAc1.getBalance());
		input.close();
	}
}
