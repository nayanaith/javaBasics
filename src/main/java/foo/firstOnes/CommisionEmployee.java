package foo.firstOnes;

public class CommisionEmployee extends Object{
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private double grossSales;//gross weekly sales
	private double commisionRate;
	
	//five-argument constructor
	public CommisionEmployee (String fName, String lName, String ssn, double grSales, double rate){
		firstName=fName;
		lastName=lName;
		socialSecurityNumber=ssn;
		setGrossSales(grSales);
		setCommissionRate(rate);
	}//end constructor
	
	public void setFirstName(String first){
		firstName=first;
	}//end setFirstName
	
	public String getFirstName(){
		return firstName;
	}//end getFirstName
	
	public void setLastName(String last){
		lastName=last;
	}//end setLastName
	
	public String getLastName(){
		return lastName;
	}//end getLastName
	
	public void setSocialSecurityNumber(String ssn){
		socialSecurityNumber=ssn;
	}//end setSSN
	
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}//end getSSN
	
	public void setGrossSales(double sales){
		if(sales>=0.0)
			grossSales=sales;
		else 
			throw new IllegalArgumentException("Gross sales must be >=0.0");
	}//end setGrossSales
	
	public double getGrossSales(){
		return grossSales;
	}//end getGrossSales
	
	public void setCommissionRate(double rate){
		if(rate >=0.0 && rate<=1.0){
			commisionRate=rate;
		}
//		else {
//			throw new IllegalArgumentException("Commision rate must be between 0.0 - 1.0");
//		}
	}//end setCommisionRate
	
	public double getCommisionRate(){
		return commisionRate;
	}//end getCommisionRate
	
	public double earnings(){
		return commisionRate*grossSales;
	}//end earnings
	
@Override
public String toString(){
		return String.format("%s : %s %s\n%s: %s\n%s: %.2f\n%s: %.4f",
				"Commision Employee",firstName,lastName,
				"Social Security Number",socialSecurityNumber,
				"Gross sales",grossSales,
				"Commision Rate",commisionRate);
	}//end toString	
}//end CommisionEmployee
