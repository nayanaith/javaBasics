package foo;

import java.util.Random;

public class RollDie {
	public static void main (String args[]){
		Random rdm = new Random();
		int[] frequency = new int [7];
		
		for(int roll=1; roll<=6000000;roll++){
			++frequency[1+rdm.nextInt(6)];
		}//end for
		
		System.out.printf("%s%10s\n","Face","Frequency");
		for (int face=1; face<frequency.length; face++){
			System.out.printf("%4d%10d\n",face,frequency[face]);
		}
	}//end main
}//end class
