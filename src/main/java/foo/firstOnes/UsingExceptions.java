package foo.firstOnes;

public class UsingExceptions {
	public static void main(String args[]){
		try{
			throwException();
		}//end try
		
		catch(Exception exception){
			System.err.println("Exception handled in main");
		}//end catch
		
		doesNotThrowException();		
	}//end main
	
	//demonstrate try...catch finally
	public static void throwException() throws Exception{
		try //throw an exception immediately catch it
		{
			System.out.println("Method throwException");
			throw new Exception();			
		}//end try
		
		catch(Exception exception){
			System.err.println("Exception handled in method exception");
			throw exception;
			//code here would not be reached; would cause in compilation errors
		}//end catch
		
		finally //executes regardless of what occurs in try ...catch
		{
			System.err.println("Finally executed in throwException");
		}//end finally
		//code here would not be reached; would cause in compilation errors
	}//end throwException
	
	public static void doesNotThrowException(){
		try{ //try block does not throw an exception
			System.out.println("Method doesNotThrowEception");
		}//end try
		catch(Exception exception){
			System.err.println(exception);
		}//end catch
		finally //executes regardless of what executes in try...catch
		{
			System.err.println("Finally executed in doesNotThrowException");
		}//end finally
		
		System.out.println("End of method doesNotThrowException");
	}//end doesNotThrowException
}//end class
