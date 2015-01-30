package foo.excercises;

import java.util.Scanner;

public class BarChart {
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		int[] nums=new int[5];
		
		for(int i=0;i<5;i++){
		System.out.printf("Enter the number %d: ",i);
		nums[i]=input.nextInt();
		}//end for
		
		for(int c:nums)
			System.out.printf("%d\n",c);		
		
		for(int m=0;m<nums.length;m++){
				for(int n=0;n<nums[m];n++){
					System.out.printf("*");
				}
				System.out.println();
		}
		
	System.out.printf("%s",Math.ceil( -Math.abs( -8 + Math.floor( -5.5 ) ) ));
}//end main
}//end class
