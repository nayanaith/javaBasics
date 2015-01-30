package foo.fileHandling;

public class CreateTextFileTest {
	public static void main(String[] args){
		CreateTextFile application=new CreateTextFile();
		application.openFile();
		application.addRecord();
		application.closeFile();
	}//end main	
}//end class
