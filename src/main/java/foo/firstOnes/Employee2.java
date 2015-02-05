package foo.firstOnes;

public class Employee2 {
	private String firstName;
	private String lastName;
	private static int count=0;//number of employee classes created
	
	public Employee2(String first, String last){
		firstName=first;
		lastName=last;
		++count;
		System.out.printf("Employee constructor: %s %s; count=%d\n",firstName,lastName,count);
	}//end Employee constructor
	
	//get first Name
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public static int getCount(){
		return count;
	}
	
}
