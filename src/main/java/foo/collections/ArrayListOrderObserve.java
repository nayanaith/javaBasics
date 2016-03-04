package foo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*All the Lists are ordered by default. Which means data is stored in the order which those entered*/


public class ArrayListOrderObserve {
	public static void main (String args[]){
		List<String> aryListToObsrv=new ArrayList<>();
		aryListToObsrv.add("First ");
		aryListToObsrv.add("Second ");
		aryListToObsrv.add("Third ");
		aryListToObsrv.add("Fourth ");
		
		printList(aryListToObsrv);
		aryListToObsrv.clear();
		
		aryListToObsrv.add("First ");
		aryListToObsrv.add("Fourth ");
		aryListToObsrv.add("Third ");
		aryListToObsrv.add("Second ");
		
		printList(aryListToObsrv);
	
		aryListToObsrv.add(3, "Sixth ");
		printList(aryListToObsrv);
	}//end main
	
	public static void printList(List<String> aryListToObsrv){
		Iterator<String> itr = aryListToObsrv.iterator();
		
		while(itr.hasNext()){
			System.out.printf("%s",itr.next());
		}
		System.out.println();
	}// end printList
}//end ArrayListOrderObserve
