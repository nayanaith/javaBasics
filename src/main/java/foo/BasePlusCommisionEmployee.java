package foo;

public class BasePlusCommisionEmployee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;
	private double commisionRate;
	private double baseSalary;
	
	//six-argument constructor
	public BasePlusCommisionEmployee(String first, String last, String ssn, double sales,
			double rate,double salary){
		firstName=first;
		lastName=last;
		socialSecurityNumber=ssn;
		setGrossSales(sales);
		setCommisionRate(rate);
		setBaseSalary(salary);		
	}
	
	public void setFirstName(String fname){
		firstName=fname;
	}//end setfirstName
	
	
	public String getFirstName(){
		return firstName;
	}//end getFirstName
	
	public void setLastName(String lname){
		lastName=lname;
	}//end setLastName
	
	public String getLastName(){
		return lastName;
	}//end getLastName
	
	public void setSocialSecurityNumber(String ssn){
		socialSecurityNumber=ssn;
	}//end setSocialSecurityNumber
	
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}//end getSocialSecurityNumber
	
	public void setGrossSales(double sales){
		if(sales>=0.0)
			grossSales=sales;
		else
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
	}//end method setGrossSales
	
	public double getGrossSales(){
		return grossSales;
	}//end getGrossSales
	
	public void setCommisionRate(double rate){
		if(rate > 0.0 && rate < 1.0)
			commisionRate=rate;
		else
			throw new IllegalArgumentException("Commision rate must be > 0.0 and < 1.0");
	}//end setCommisionRate
	
	public double getCommisionRate(){
		return commisionRate;
	}//end getCommisionRate
	
	public void setBaseSalary(double salary){
		if (salary >= 0.0)
			baseSalary=salary;
		else 
			throw new IllegalArgumentException("Base salary has to be > 0");
	}//end setBaseSalary
	
	public double getBaseSalary(){
		return baseSalary;
	}//end getBaseSalary
	
	public double earnings(){
		return baseSalary+(commisionRate*grossSales);
	}//end earnings
	
@Override
public String toString(){
	return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s:%.2f\n%s: %.2f",
			"base-salaried commision employee",firstName,lastName,
			"Social security number",socialSecurityNumber,
			"gross sales",grossSales,
			"commision rate",commisionRate,
			"base salary",baseSalary);
	}	//end method toString 
}//end BasePlusCommisionEmployee
