package foo.employee.intrface;

public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee(String first,String lst,String ssn, double salary){
		super(first,lst,ssn);
		setWeeklySalary(salary);
	}//end constructor
	
	public void setWeeklySalary(double salary){
		if(salary > 0)
			weeklySalary=salary;
		else 
			throw new IllegalArgumentException("Weekly salary must be, it should be more tha 0");
	}//end setWeeklySalary
	
	public double getWeeklySalary(){
		 return weeklySalary;
	}//end getWeeklySalary
	

	public double getPaymentAmount(){
		return getWeeklySalary();
	}//end getPaymentAmnt

}//end salariedEmp
