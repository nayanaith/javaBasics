package foo.annonations;

import java.util.Date;

@SuppressWarnings("unused")
//@SuppressWarnings("all")
//@SuppressWarnings({"unused","deprecation"})
public class UseStandatrJavaAnnonations extends UsedStndAnnoSuperClass {
	
	//@SuppressWarnings("unused")
	private String name="Jonathan";
	
	
	public static void main(){
		printEveryName();
	}
	
	
	@SuppressWarnings("deprecation")
	public String setingDate(){
		String myDate="";
		Date g = new Date();
		myDate=String.valueOf(g.getDate());
		return myDate;
	}//setingDate
	
	
	private void demoName(){
		System.out.println("mamai raju");
	}//end demoName

	
	@Override
	public void printMyname(){
		System.out.println("My name is not khan");
	}//end printMyname
}//end UseStandatrJavaAnnonations
