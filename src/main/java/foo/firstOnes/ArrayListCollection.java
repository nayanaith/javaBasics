package foo.firstOnes;

import java.util.ArrayList;

public class ArrayListCollection {
	public static void main(String args[]){
			//array list of capacity 10
		ArrayList<String>items=new ArrayList<String>();
		items.add("Red");
		items.add(0,"yellow");//insert the value at index 0
		
		//header
		System.out.print("Display list contained counter controlled loop:\t");
		for(int i=0;i<items.size();i++){
			System.out.printf("%s\t",items.get(i));			
			}//end for
			System.out.println();
			System.out.println();
			
			
			//display colors using foreach in the display method
			display(items,"Display list contents with enchanced for statement:");
			items.add("Green");
			items.add("Blue");
			items.add("yellow");
			display(items,"The list with three new elements:");
			System.out.println();
			System.out.println();
			
			items.remove("yellow");
			display(items,"Removed first instance of yellow:");
			items.remove(1);
			System.out.println();
			display(items,"Remove second list element (green):");
			System.out.println();
			
			//check whether the value is already in the list
			System.out.printf("\"red\" is %s in the list\n",items.contains("red")?"":"not");
			System.out.println();
			
			//display number of elements in the list
			System.out.printf("Array list size: %s\n",items.size());	
	}//end main
	
	
	public static void display(ArrayList<String>items,String header){
		System.out.printf("Header:	%s\n",header);		
		//display each items in list
		for(String item:items)
			System.out.printf("%s\t",item);
		System.out.println();
	}//end display
}//end ArrayListCollection
