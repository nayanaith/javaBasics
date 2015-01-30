package foo;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
		
	public String toString(){
			return String.format("%s %s\n Hired:%s\n DOB: %s",firstName,lastName,birthDate,hireDate);
		}//end toString
	
	public Employee(String first, String last, Date bDate, Date hrDate){
				firstName=first;
				lastName=last;
				birthDate=bDate;
				hireDate=hrDate;
			}//end Employee constructor
			
	}//end Employee
