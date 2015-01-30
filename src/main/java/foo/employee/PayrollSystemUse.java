package foo.employee;

public class PayrollSystemUse {
	public static void main(String agrs[]){
		//creating objects
		SalariedEmployee slEmp= new SalariedEmployee("Bob","Marley","111-11-1111",800);
		HourlyEmployee hrEmp=new HourlyEmployee("Danny","Nikalson","222-22-2222",16.75,40);
		CommisionEmployee cmEmp=new CommisionEmployee("Pie","Peterson","333-33-3333",10000,0.06);
		BasePlusCommisionEmployee bscEmp= new BasePlusCommisionEmployee("Nike","Edwardson","444-44-444",5000,0.04,300);
		
		System.out.printf("%s\n%s: $%,.2f,\n\n",slEmp,"earned",slEmp.earnings());
		System.out.printf("%s\n%s: $%,.2f,\n\n",hrEmp,"earned",hrEmp.earnings());
		System.out.printf("%s\n%s: $%,.2f,\n\n",cmEmp,"earned",cmEmp.earnings());
		System.out.printf("%s\n%s: $%,.2f,\n\n",bscEmp,"earned",bscEmp.earnings());
	
		Employee[] employees=new Employee[4];
		employees[0]=slEmp;
		employees[1]=hrEmp;
		employees[2]=cmEmp;
		employees[3]=bscEmp;
		
		System.out.println("Employees processed polymorphically:\n");
		
		//generally process each element in array employees
		for (Employee currentEmployee:employees){
			System.out.println(currentEmployee);
			
			if (currentEmployee instanceof BasePlusCommisionEmployee){
				BasePlusCommisionEmployee employee =(BasePlusCommisionEmployee)currentEmployee;
			
			employee.setBaseSalary(1.10*employee.getBaseSalary());
			
			System.out.printf("new base salary with 10%% increase is: $%,.2f\n",employee.getBaseSalary());
			}//end if
			
				System.out.printf("earned $%,.2f\n\n",currentEmployee.earnings());
		}//end for
		
		for(int j=0; j<employees.length; j++)
			System.out.printf("Employee %d is a %s\n",j,employees[j].getClass().getName());
	
	}//end main
}//end PayrollSystemUse
