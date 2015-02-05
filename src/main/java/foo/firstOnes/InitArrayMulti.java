package foo.firstOnes;

public class InitArrayMulti {
	public static void main (String args[]){
		int[][] multi1={{1,2,3},{4,5,6}};
		int[][] multi2={{10,11},{12},{13,14,15}};
		int[] enFor={9,10,11,13};
		
//		outPutArray(multi1);
//		System.out.println();
//		System.out.println();
//		outPutArray(multi2);
		
//		for(int[] row:multi1){
//			for(int a:a])
//				System.out.printf("%d",row[a])
//		System.out.println();
//		}
		
		for(int c:enFor){
			System.out.printf("%d\t",c);
		}
		System.out.println();
		
		for(int p[]:multi1){
			for(int x:p){
				System.out.printf("%d\t",x);
			}
			System.out.println();
		}
	}//end main
	
	public static void outPutArray(int[][] multi){
			for(int row=0; row<multi.length;row++){
				
				for(int coulmn=0; coulmn<multi[row].length;coulmn++){
					System.out.printf("%d\t",multi[row][coulmn]);
				} //end for2
					System.out.println();
				
			}//end for1
			
					
	}//end outPutArray
	
}//end class
