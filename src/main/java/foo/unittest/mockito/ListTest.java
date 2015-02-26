package foo.unittest.mockito;
import static org.mockito.Mockito.*;

import java.awt.List;

import org.junit.Test;

public class ListTest {
	@Test
	public void verifyList(){
	List mockedList=mock(List.class);
	
	mockedList.add("one");
	mockedList.clear();
	
	verify(mockedList).add("one");
	verify(mockedList).clear();
	}
}//end ListTest

