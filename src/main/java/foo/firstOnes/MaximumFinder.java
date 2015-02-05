package foo.firstOnes;

import java.util.Scanner;

public class MaximumFinder {
	public static void main (String args[]){
			
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value 1:");
		int a=input.nextInt();

		System.out.println("Enter value 2:");
		int b=input.nextInt();

		System.out.println("Enter value 3:");
		int c=input.nextInt();
	
		
		System.out.printf("Max value is: %d\n\n",(maxima(a,b,c)));
		System.out.printf("In java %d",Math.max(c,Math.max(a,b)));
	}
	
	public static int maxima(int x, int y, int z)
	{
		int max=0;
		if (x<y)
			max=y;
		else	
			max=x;
		
		if (z>max)
			max=z;
				
			return max;	
	}//end maxima

}//end class
