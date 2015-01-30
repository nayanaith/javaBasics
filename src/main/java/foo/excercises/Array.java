package foo.excercises;

public class Array {
	public static void main(String args[]){
		int[] c={1,2,3,4,5};
		String[] charr={"sunaya","kalapaya", "bakaya","huna"};
	
		for(int x:c){
			System.out.printf("%d\t",x);
		}//end for
		
		for(String x:charr){
			System.out.printf("%s\t",x);
						
		}//end for
		System.out.println();
		System.out.println();
		//MULTI DIMENTION ARRAYS....
		int[][] b={{1,3,5},{7,9,11}};
		for(int[] x:b){
			for(int y:x){
				System.out.printf("%d\t",y);
			}//end for
			System.out.println();
		}//for 1
		
	
	}//end main
}//end class
