package foo.employee;

public class BasePlusCommisionEmployee extends CommisionEmployee {
	private double baseSalary;
	
	public	BasePlusCommisionEmployee(String first, String last, String ssn,
			double sales,double rate, double salary){
		super(first,last,ssn,sales,rate);
		setBaseSalary(salary);		
	}//end BasePlusCommisionEmployee constructor
	
	public void setBaseSalary(double sal){
		if(sal>0)
			baseSalary=sal;
		else 
			throw new IllegalArgumentException("Base salary should be greater than 0");
	}//end setBaseSalary
	
	public double getBaseSalary(){
		return baseSalary;
	}//end getBaseSalary
	
	@Override
		public double earnings(){
		return baseSalary+super.earnings();
	}//end earnings 
	
	@Override
	public String toString(){
		return String.format("%s %s; %s: $%,.2f",
				"base salaried",super.toString(),
				"base salary",getBaseSalary());
}//end toString

}
