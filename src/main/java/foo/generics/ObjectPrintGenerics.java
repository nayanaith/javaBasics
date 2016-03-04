package foo.generics;

public class ObjectPrintGenerics {
	public static void main (String args[]){
		
			Integer[] ints={1,3,5,6,8,9,29};
			String[] stings={"H","E","L","L","O"};
			Double[] dubs={1.21,2.21,34.1,35.22};
			
			printArray(ints);
			printArray(stings);
			printArray(dubs);
	}//end main
	
	public static<T> void printArray(Object[] inArry){
		for(Object element:inArry)
			System.out.printf("%s ",element);
		
		System.out.println();
	}//end printArray
}//end ObjectPrintGenerics
