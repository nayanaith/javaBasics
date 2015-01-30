package foo.excercises;

import java.util.Scanner;

public class Account312test {
	public static void main(String args[]){
		Account312 ac312=new Account312(001,150.50);
		System.out.printf("The account details are:\n ID:%d \n Balance: %f \n",ac312.getId(),ac312.getBalance());
		
		System.out.println("Enter the amount to credit: ");
		Scanner input = new Scanner(System.in);
		double credit = input.nextDouble();
		ac312.credit(credit);
		
		System.out.printf("The new balance is: %f\n",ac312.getBalance());
		
		System.out.println("Enter the amount to debit: ");
		double debit=input.nextDouble();
		ac312.debit(debit);
		
		System.out.printf("The balance is: %f\n",ac312.getBalance());
		
		
	}//end main
}//end class
