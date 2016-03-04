package foo.generics;

public class ArrayPrintWithGenerics {
	public static void main(String args[]){
		Integer[] intArray={1,3,6,7,9,10};
		
		Double[] doubleArray={1.1,2.2,3.3,4.4};
		
		String[] stringArray={"H","E","L","L","O"};
		
		
		printArray(intArray);
		
		printArray(doubleArray);
		
		printArray(stringArray);
	}//end main
	

	public static <T> void printArray(T [] inputArray )
	{
	// display array elements
	for (T element : inputArray )
		System.out.printf( "%s ", element );
		System.out.println();
	} // end method printArray

	
	
	
}//end ArrayPrintWithGenerics
