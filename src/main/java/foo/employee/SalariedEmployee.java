package foo.employee;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee(String first,String last, String ssn, double salary){
		super(first, last, ssn);
		setWeeklySalary(salary);		
	}//end SalariedEmployee
	
	public void setWeeklySalary(double sal){
		if(sal>=0.0)
			weeklySalary=sal;
		else
			throw new IllegalArgumentException("Salary must be greater than 0.0");
	}//end setWeeklySalary
	
	public double getWeeklySalary(){
		return weeklySalary;
	}//end getWeeklySalary
	
	@Override
	public double earnings(){
		return getWeeklySalary();
	}//end getWeeklySalary
	
	@Override
	public String toString(){
		return String.format("Salaried employee: %s\n%s: $%,.2f",super.toString(),"Weekly salary",getWeeklySalary());
		
	}//end toString
	

	
}
