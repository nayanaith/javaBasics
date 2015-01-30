package foo.excercises;

import java.util.Arrays;


public class Elipsis {
	public static void main(String args[]){
		System.out.printf("%f",average(23.4,52.9425,522.12,223.13));
		System.out.println();
		int[] d34=new int[34];
		int[] d11={1,2,3,4,5,6,7,8,9,10,11};
		d34=d11;
	
		//Use of Arrays class functions
		System.out.printf("%d\n",Arrays.binarySearch(d34,5));
		for(int c:d34)
			System.out.printf("%d\t",c);
	}//end main
	

	//Use of ellipsis
	public static double average(double...nums){
		double total=0;
		for(double c:nums){
			total+=c;
		}//end for		
		return (double)total/nums.length;
	}//end average
}//end class


