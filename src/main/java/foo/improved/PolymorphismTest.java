package foo.improved;

public class PolymorphismTest {
	public static void main(String args[]){
		
		//assign superclass reference to superClass variable
		CommisionEmployee commisionEmployee=new CommisionEmployee("Sue","Jones","222-22-2222",10000,0.06);
	
		//assign subclass reference to subclass variable
		BasePlusCommisionEmployee basePlusCommisionEmployee = new BasePlusCommisionEmployee("Bob","Lewis","333-33-3333",5000,0.04,300);
		
		//invoke toString on superclass object using superclass variable
		System.out.printf("%s %s:\n\n%s\n\n","Call CommisionEmployee's toString with superclass reference",
				"To superclass object", 
				commisionEmployee.toString());
		
		//invoke toString on subclass object using subclass variable
		System.out.printf("%s %s:\n\n%s\n\n","Call BasePlusCommisionEmployee's toString with subclass",
				"reference to subclass object",
				basePlusCommisionEmployee.toString());
		
		//invoke toString on subclass object using superclass variable
		CommisionEmployee commisionEmployee2=basePlusCommisionEmployee;
		
		System.out.printf("%s %s:\n\n%s\n","Call BasePlusCommisionEmployee's toString with superclass",
				"reference to subclass object",commisionEmployee2.toString());
		
	}//end main

}//end PolymorphismTest
