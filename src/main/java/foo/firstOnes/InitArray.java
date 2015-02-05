package foo.firstOnes;

public class InitArray {
	public static void main (String args[]){
		int[] one=new int[10];
		int[] two={1,2,3,4,5};
		System.out.println("Index\t\tValue\n");
		for(int counter = 0; counter<=one.length-1; counter++){
			System.out.printf("%d\t\t%d\n",counter,one[counter]);
			
		}
		
		System.out.println("Index\t\tValue\n");
		for(int c:one){
			System.out.println(c);
			System.out.println();
			}
}//end main
}//end class