package foo.improved;

public class BasePlusCommisionEmployeeUse {
	public static void main(String args[]){
		BasePlusCommisionEmployee emp=new BasePlusCommisionEmployee(
				"Bob","Lewis","333-333-333",5000,0.04,300);
		System.out.println("Employee information obtained by get methods: \n");
		System.out.printf("%s %s\n","First Name is",emp.getFirstName());
		System.out.printf("%s %s\n","Last Name is",emp.getLastName());
		System.out.printf("%s %s\n","SSN is",emp.getSocialSecurityNumber());
		System.out.printf("%s %.2f\n","Gross sales is",emp.getGrossSales());
		System.out.printf("%s %.2f\n","Commision rate is",emp.getCommisionRate());
		System.out.printf("%s %.2f\n","Base salary is",emp.getBaseSalary());
		emp.setBaseSalary(10000);
		
		System.out.printf("\n%s:\n\n%s\n","Updated employee information obtained by toString",emp.toString());
		
		
	}//end main
}//end BasePlusCommisionEmployeeUse
