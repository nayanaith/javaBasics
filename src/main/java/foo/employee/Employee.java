package foo.employee;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	//three argument constructor
	public Employee(String fname, String lname, String ssn){
		firstName=fname;
		lastName=lname;
		socialSecurityNumber=ssn;
	}//end Employee constructor
	
	public void setFirstName(String first){
		firstName=first;
	}//end setFirstName
	
	public String getFirstName(){
		return firstName;
	}//end getFirstName
	
	public void setLastName(String last){
		lastName=last;
	}//end setLastName
	
	public String getLastName(){
		return lastName;
	}//end getLastName
	
	public void setSocialSecurityNumber(String ssn){
		socialSecurityNumber=ssn;
	}//end setSSN
	
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}//end getSSN
	
	@Override
	public String toString(){
		return String.format("%s %s\nSocial Security number: %s",getFirstName(),getLastName(),getSocialSecurityNumber());
	}
	
	public abstract double earnings();
	//end earnings abstract
}//end Employee abstract
