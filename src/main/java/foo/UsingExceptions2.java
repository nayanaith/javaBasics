package foo;

public class UsingExceptions2 {
	public static void main(String args[]){
		try{
			method1();
		}//end try
		
		catch(Exception exception){
			System.err.printf("%s\n\n",exception.getMessage());
			exception.printStackTrace(); //print exception stack trace
			
			//obtain stack-trace information
			StackTraceElement[]  traceElements=exception.getStackTrace();
			
			System.out.println("\nStack trace from getStackTrace:");
			System.out.println("Class\t\t\tFile\t\t\tcLine\tMethod");
			
			//loop through traceElements to get element description
			for(StackTraceElement element:traceElements){
				System.out.printf("%s\t",element.getClassName());
				System.out.printf("%s\t",element.getFileName());
				System.out.printf("%s\t",element.getLineNumber());
				System.out.printf("%s\t",element.getMethodName());	
				System.out.println();
			}//end for
			
		}//end catch
	}//end main
	
	
	public static void method1() throws Exception{
		method2();
	}//end method1
	
	public static void method2() throws Exception{
		method3();
	}//end method2
	
	public static void method3() throws Exception{
		throw new Exception("Exception thrown in method3");
	}//end method3
}//end UsingExceptions2
