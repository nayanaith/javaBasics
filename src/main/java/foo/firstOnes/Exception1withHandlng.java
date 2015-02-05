package foo.firstOnes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1withHandlng {
	public static int quotient(int numerator, int devider)
		throws ArithmeticException
		{
		return numerator/devider;
	}//end method quotient
	
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		boolean continueLoop=true; //determine if more input needed
		do{
			try//read two numbers and calculate quotient
			{
				System.out.println("Please enter an integer number: ");
				int number1=input.nextInt();
				System.out.println("Please enter an integer divider: ");
				int devider1=input.nextInt();
				
				int result1=quotient(number1,devider1);
				System.out.printf("\nResult:%d / %d = %d\n",number1,devider1,result1);
				continueLoop = false;
				
			}//end try
			catch(InputMismatchException inputMismatchException){
				System.err.printf("\nException:%s\n",inputMismatchException);
				//input.nextLine();
				System.out.println("You must enter integers, Please try again..\n");
			}//end catch
			
			catch(ArithmeticException arithmeticException){
				System.err.printf("\nException: %s\n",arithmeticException);
				System.out.println("Zero in an invalid devider, Please try again..\n");
				
			}//end catch
			System.out.println("came here too");
		}while(continueLoop==true);//end do while
		input.close();
	}//end main
}//end class
