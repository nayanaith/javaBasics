package foo.comparision;

import java.util.Comparator;

public class HdtvPriceComparatorDescending implements Comparator<Hdtv> {
	
	@Override
	public int compare(Hdtv o1, Hdtv o2) {
		if(o1.getPrice()>o2.getPrice())
			return -1;
		else if(o1.getPrice()<o2.getPrice())
			return 1;
		else
			return 0;	
	}
}//end HdtvPriceComparatorDescending
