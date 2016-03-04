package foo.comparision;

import java.util.Comparator;

public class HdtvBrandNameComparatorAscending implements Comparator<Hdtv>{

	@Override
	public int compare(Hdtv tv1, Hdtv tv2) {
	  	   return tv1.getBrandName().compareTo(tv2.getBrandName());
	}}//end  HdtvBrandNameComparatorAscending
