package foo.firstOnes;

public class CommisionEmployeeUse {
	
	public static void main(String args[]){
		CommisionEmployee comEmp= new CommisionEmployee("Jones","Adams","222-22-3333",10000,0.06);
		System.out.print("Employee information obtained by get methods: \n");
		
		System.out.printf("%s\t%s\n","First Name:",comEmp.getFirstName());
		System.out.printf("%s\t%s\n","Last Name:",comEmp.getLastName());
		System.out.printf("%s\t%s\n","Social security number:",comEmp.getSocialSecurityNumber());
		System.out.printf("%s\t%s\n","Gross Sales:",comEmp.getGrossSales());
		System.out.printf("%s\t%s\n","Commision rate is:",comEmp.getCommisionRate());
		
		comEmp.setCommissionRate(500);
		comEmp.setCommissionRate(0.02);
		
		System.out.printf("\n%s: \n\n%s\n","Updated employee information obtained by toString",comEmp);	
		
	}//end main

}//end CommisionEmployeeUse
