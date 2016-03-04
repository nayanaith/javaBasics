package foo.generics;

public class ArrayPrintWithoutGenerics {
	public static void main(String args[]){
		Integer[] intArray={1,3,6,7,9,10};
		
		Double[] doubleArray={1.1,2.2,3.3,4.4};
		
		String[] stringArray={"H","E","L","L","O"};
		
		
		printArray(intArray);
		
		printArray(doubleArray);
		
		printArray(stringArray);
	}//end main
	
	
	public static void printArray(Integer[] intArry){
		for(Integer element:intArry)
			System.out.printf("%s, ",element);
			System.out.println();
	}//printArray int
	
	public static void printArray(Double[] dblArry){
		for(Double element:dblArry)
			System.out.printf("%s, ",element);
			System.out.println();
	}//printArray dbl
	
	public static void printArray(String[] stngArry){
		for(String element:stngArry)
			System.out.printf("%s, ",element);
			System.out.println();
	}//printArray strng
	
	
}//end ArrayPrintWithoutGenerics
