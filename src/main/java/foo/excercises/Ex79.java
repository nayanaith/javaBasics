package foo.excercises;

public class Ex79 {
	public static void main (String args[]){
		//int[][] t=new int[2][3];
		int[][] t={{1,2,3},{0,0,0}};
		int a=5;
		
		for(int r=0;r<2;r++){
			for(int c=0;c<3;c++){
			System.out.printf("%d\t",t[r][c]);
			}
			System.out.println();
		}		

	}//end main

}//end class
