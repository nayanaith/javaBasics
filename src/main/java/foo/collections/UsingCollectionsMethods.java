package foo.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollectionsMethods {
	public static void main(String args[]){
		Character[] letters={'P','C','M'};
		List<Character> list=Arrays.asList(letters);
		System.out.println("List contains");
		output(list);
		
		Collections.reverse(list);// reverse order of elements
		System.out.println("\nAfter calling reverse, list contains: ");
		output(list);
		
		//create copy list from array of 3 characters
		Character[] lettersCopy=new Character[3];
		List<Character> copyList=Arrays.asList(lettersCopy);
		
		//copy the contents of a list into copylist
		Collections.copy(copyList,list);
		System.out.println("\nAfter copying copy list contains: ");
		output(copyList);
		
		//fill with Rs
		Collections.fill(copyList,'R');
		System.out.println("\nAfter calling fill list contains: ");
		output(copyList);
	}//end main
	
	public static void output(List<Character> listRef){
		System.out.print("The list is:");
		for(Character element:listRef)
			System.out.printf("%s",element);
		
		System.out.printf("\nMax is: %s",Collections.max(listRef));
		System.out.printf("\nMin is: %s",Collections.min(listRef));
	}//end output
}//end UsingCollectionsMethods


