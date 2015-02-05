package foo.firstOnes;

import java.util.Scanner;

public class Exception1 {
	public static double quotient(int num, int divider){
		double result=num/divider;
		return result;
	}//end quotient
	
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("Observe exceptions....");
		System.out.printf("Enter the number: ");
		int num1=input.nextInt();
		
		System.out.printf("Enter the divider: ");
		int divider1=input.nextInt();
		System.out.printf("The answer is %.2f",quotient(num1,divider1));
		input.close();
	}//end main
}//end class
