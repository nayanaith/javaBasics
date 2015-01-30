package foo.employee;

public class CommisionEmployee extends Employee{
	private double grossSales;
	private double commisionRate;
	
	public CommisionEmployee(String first,String last, String ssn, double sales, double rate){
		super(first,last,ssn);
		setSales(sales);
		setRate(rate);
	}//end CommisionEmployee constructor
	
	public void setSales(double sls){
		if (sls>0.0)
			grossSales=sls;
		else
			throw new IllegalArgumentException("Gross sales should be greater than 0.0");			
	}//end setSales
	
	public double getSales(){
		return grossSales;
	}//end getSales
	
	public void setRate(double rate){
		if(rate>0.0 && rate<1.0)
			commisionRate=rate;
		else 
			throw new IllegalArgumentException("Commision rate should between 0.0-1.0");
	}//end setRate
	
	public double getRate(){
		return commisionRate;
	}//end commisionRate	

	@Override
	public double earnings() {
		return getRate()*getSales();
	}//end earnings for commisionEmployee
	
	@Override
	public String toString(){
		return String.format("%s: %s\n%s: $%,.2f;%s:%.2f",
				"commision employee",super.toString(),
				"gross sales",getSales(),
				"commision rate",getRate());
	}//end toString for CommisionEmployee
}//end CommisionEmployee
