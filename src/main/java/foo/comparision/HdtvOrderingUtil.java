package foo.comparision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HdtvOrderingUtil {
	protected static ArrayList<Hdtv> tvList=new ArrayList<>();
	public static void main(String args[]){
		Hdtv htv1=new Hdtv("Samsung","High",23000,17);
		Hdtv htv2=new Hdtv("Singer","Low",33000,27);
		Hdtv htv3=new Hdtv("Sanyo","Poor",45800,57);
		Hdtv htv4=new Hdtv("Gold Star","Medium",38500,42);
			
		tvList.add(htv1);
		tvList.add(htv2);
		tvList.add(htv3);
		tvList.add(htv4);
		
		System.out.println("\nWhen orgazined based on the Price (ascending)\n");
			Collections.sort(tvList,new HdtvPriceComparatorAscending());
			printArrayList(tvList);
			
		System.out.println("\nWhen orgazined based on the Price (descending)\n");
			Collections.sort(tvList,new HdtvPriceComparatorDescending());
			printArrayList(tvList);
		
		System.out.println("\nWhen orgazined based on the Brand name (ascending)\n");
			Collections.sort(tvList,new HdtvBrandNameComparatorAscending());
			printArrayList(tvList);
			
		System.out.println("\n\nWhen organized based on Size\n");
			Collections.sort(tvList,new HdtvSizeComparator());
			printArrayList(tvList);
	}//end main
	
	protected static void printArrayList(ArrayList<Hdtv> htv){
		for(Hdtv htvp:tvList){
			if(htvp.getBrandName().length()<=7)
				System.out.printf("%s\t%s\t\t%s\t%s\n",htvp.getPrice(),htvp.getBrandName(),htvp.getQuality(),htvp.getSize());
			else
				System.out.printf("%s\t%s\t%s\t%s\n",htvp.getPrice(),htvp.getBrandName(),htvp.getQuality(),htvp.getSize());
		}//end for	
	}//end printArrayList
}//end HdtvOrderingUtil
