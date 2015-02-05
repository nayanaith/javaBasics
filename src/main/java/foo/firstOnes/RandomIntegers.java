package foo.firstOnes;

import java.util.Random;

public class RandomIntegers {
	public static void main(String args[]){
		Random randomNumbrs= new Random();
		
		int face;
		
		for(int counter=1; counter<=20; counter++){
			System.out.printf("%d\t",(1+randomNumbrs.nextInt(6)));
			
			if (counter%5==0)
				System.out.println();
		}
	}
}
