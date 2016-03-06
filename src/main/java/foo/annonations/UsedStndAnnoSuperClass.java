package foo.annonations;

public class UsedStndAnnoSuperClass {
	public void printMyname(){
		System.out.println("get this printed");
	}//end printMyName
	
	
	@Deprecated
	public static void printEveryName(){
		String[] names={"soya","deynna","mage","ran tharu"};
		for(String name:names)
			System.out.println(name);
	}//end printEveryName
}//end UsedStndAnnoSuperClass
