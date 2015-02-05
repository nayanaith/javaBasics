package foo.firstOnes;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		String original="";
		String reverse="";
		
		System.out.println("Enter a String to check if it is a Palindrome");
		original=input.nextLine();
		
		int length = original.length();
		
		for(int i=length-1; i>=0;i--){
			reverse=reverse+original.charAt(i);
		}
		
		if(original.equals(reverse))
			System.out.println("Entered String is a palindrome..!");
		
		else
			System.out.println("Entered string is not a palindrome..!");
	}

}
