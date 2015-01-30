package foo;

import java.util.Arrays;

public class ArrayManipulations {
	public static void main(String args[]){
		double[] doulbeArray1= {8.4,9.3,0.2,7.9,3.4};
		displayArray(doulbeArray1,"Before sorting double array:");
		Arrays.sort(doulbeArray1);	
		displayArray(doulbeArray1,"After sorting double array:");

		
		//fill 10-element array with 7s'
		int[] filledIntArray=new int[10];
		Arrays.fill(filledIntArray,7);
		displayArray(filledIntArray,"filledArray");
		
		//copy array IntArray into array intArrayCopy
		int[] intArray={1,2,3,5,4,7,8};
		int[] intArrayCopy=new int[intArray.length];
		System.arraycopy(intArray,0,intArrayCopy, 0,intArray.length);
		displayArray(intArray,"intArray");
		displayArray(intArrayCopy,"intArrayCopy");
		System.out.println();
		
		//compare intArray and intArrayCopy for equality
		boolean b=Arrays.equals(intArray,intArrayCopy);
		System.out.printf("IntArray %s IntArrayCopy\n",b?"==":"!=");
		
		boolean c=Arrays.equals(intArray,filledIntArray);
		System.out.printf("IntArray %s IntArrayCopy\n",c?"==":"!=");
		System.out.println();
		
		//search intArray for value 5
		int location =Arrays.binarySearch(intArray,5);
		if(location>=0)
			System.out.printf("Found 5 at the array element %d\n",location);
		else
			System.out.printf("Not Found 5 at the array element ");
		
		//search int array for the
		location=Arrays.binarySearch(intArray,8732);
		if (location>=0)
			System.out.printf("Found 8763 at element %d in intArray\n",location);
		else 
			System.out.printf("The value was not found");
			
		
	}//end main
	
	//output values in each array
	public static void displayArray(int[] array, String description){
		System.out.printf("\n%s: ",description);
		for(int value:array)
			System.out.printf("%d",value);
	}
	
	public static void displayArray(double[] array, String description){
		System.out.printf("\n%s ",description);
		for(double value:array)
			System.out.printf("%.1f\t",value);
	}
}//end classArrayManipulations
