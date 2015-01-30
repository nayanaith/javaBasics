package foo.excercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdditionExc {
	public static void main(String args[]){
		int a=5;
		int b=0;
//		Scanner input = new Scanner(System.in);
//		try{
//		System.out.printf("first int pls..:");
//		a=input.nextInt();
//		
//
//		System.out.printf("first int pls..:");
//		b=input.nextInt();
//		}
//		catch (InputMismatchException inputMismatchException){
//			System.out.printf("%s",inputMismatchException);
//		}
		//add(a,b);
		System.out.printf("\nThe answer is %d",add(a,b));	


	}//end main
	
public static int add(int c,int d)
{
		int z=0;
		
		try{		
		z=c/d;	
		}		
		catch(Exception e){
		System.out.printf("The exception %s occured",e.getMessage());		
		}
		return z;
	}//end add	
}//end class
