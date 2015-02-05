package foo.firstOnes;

public class PassArray {
	public static void main(String args[]){
		int[] array={1,2,3,4,5,6};
		System.out.println("Effects of passing reference to entire array:\n"+"The values of the original array are\n");
		
		for(int value:array){
			System.out.printf("%d\n",value);
		}//end for
		System.out.println();
		
		modifyArray(array);
		System.out.println("The modified array values are:\n");
		for(int b:array){
			System.out.printf("%d\n",b);
		}
		System.out.println();
		
		System.out.println("The modified array element value");
		System.out.printf("The value before modification of element[3]: %d\n", array[3]);
	
		System.out.printf("%d\n",modifyElement(array[3]));
		System.out.printf("The array value still is: %d\n",array[3]);
		
	}//end main
	
	public static void modifyArray(int[] ary){
		for(int i=0; i<ary.length;i++){
			ary[i]=ary[i]*3;
		}//end for
	}//end modifyArray
	
	public static int modifyElement(int b){
		b=b*3;
		return b;
	}//end mofifyElement

}//end class
