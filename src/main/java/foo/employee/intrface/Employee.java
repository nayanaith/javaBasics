package foo.employee.intrface;

public abstract class Employee implements Payable{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee(String first, String last, String ssn){
		firstName=first;
		lastName=last;
		socialSecurityNumber=ssn;
	}//end Employee
	
	public void setFirstName(String frName){
		firstName=frName;
	}//end setFirstName
	
	public String getFirstName(){
		return firstName;
	}//end getFirstName
	
	public void setLastName(String lsName){
		lastName=lsName;
	}//end setLastName
	
	public String getLastName(){
		return lastName;
	}//end getLastName
	
	public void setSocialSecurityNumber(String ssn){
		socialSecurityNumber=ssn;
	}//end setSSN
	
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}//end getSocialSecurityNumber
	
	@Override
	public String toString(){
		return String.format("%s %s\n social security number: %s",getFirstName(),getLastName(),getSocialSecurityNumber());
	}//end toString
	

}
