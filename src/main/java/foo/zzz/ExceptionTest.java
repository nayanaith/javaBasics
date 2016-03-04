package foo.zzz;

import org.junit.Test;

public class ExceptionTest {
	@Test(expected = ArithmeticException.class)
	public void divisionByZeroShouldThrowArithmaticExp(){
		int ans=10/0;
		
	}//end testDevisioExp
	
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
		public void pointingToOutShouldThrowArithmaticExp(){
		int[] myNumbers={1,2,34,5};
		System.out.printf("%d",myNumbers[4]);
	}//end 
}//end DivisionExceptionTest
