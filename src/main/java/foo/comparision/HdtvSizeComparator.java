package foo.comparision;

import java.util.Comparator;

public class HdtvSizeComparator implements Comparator<Hdtv>{

	@Override
	public int compare(Hdtv o1, Hdtv o2) {
		if(o1.getSize()>o2.getSize())
			return 1;
		else if(o1.getSize()<o2.getSize())
			return -1;
		else
			return 0;		
	}//end compare
}//end HdtvSizeComparator
