package foo;

public class EmployeeUse {
	public static void main (String args[]){
		Date birth=new Date(7,24,1999);
		Date hire=new Date(8,12,2010);
		
		Employee employee = new Employee("Bob","Blue",birth,hire);
		System.out.println(employee);
	}
}
