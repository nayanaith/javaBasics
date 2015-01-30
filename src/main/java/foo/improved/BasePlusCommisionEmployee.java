package foo.improved;

public class BasePlusCommisionEmployee extends CommisionEmployee{
	private double baseSalary;
	
	public BasePlusCommisionEmployee(String first,String last,String ssn,double sales,double rate,double salary){
		super(first,last,ssn,sales,rate);
		setBaseSalary(salary);
	}
	
	public void setBaseSalary(double salary){
		if(salary > 0.0)
			baseSalary=salary;
		else
			throw new IllegalArgumentException("Base salary must be > 0.0");
	}//end setBaseSalary
	
	public double getBaseSalary(){
		return baseSalary;
	}//end getBaseSalary

	@Override
	public double earnings(){
		return baseSalary+super.earnings();
		//return baseSalary+(getCommisionRate()*getGrossSales());
	}//end method earnings
	
	@Override
	//THIS CODE GETS FAILED SINCE PRIVATE MEMBERS OF SUPER CLASS CANNOT BE ACCESSED BY A SUBCLASS
//	public String toString(){
//		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
//				"base-salaried commision employee",firstName,lastname,
//				"Social security number",socialSecurityNumber,
//				"Gross sales:",grossSales,
//				"commision rate: ",commisionRate,
//				"base salary",baseSalary);
	
	public String toString(){
		//THIS IS NOT A GOOD PRACTISE, WE HAVE TO USE super.toString() AND CONTINUE FROM THERE.
//		return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
//				"base-salaried commision employee",getFirstName(),getLastName(),
//				"Social security number",getSocialSecurityNumber(),
//				"Gross sales:",getGrossSales(),
//				"commision rate: ",getCommisionRate(),
//				"base salary",baseSalary);
		return String.format("%s %s\n%s: %.2f","base-salaried",super.toString(),"base salary",getBaseSalary());
	}//end toString
}//end BasePlusCommisionEmployee
