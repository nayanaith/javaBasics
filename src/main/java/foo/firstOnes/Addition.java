package foo.firstOnes;

import java.util.Scanner;

public class Addition {
	public static void main (String args[]){
		int num1=0,
			num2=0;
			//sum=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number one: ");
		num1=input.nextInt();
		
		System.out.println("Enter number one: ");
		num2=input.nextInt();
		
		System.out.printf("The answer is %d",(num1+num2));
		input.close();                                        
	}
}
