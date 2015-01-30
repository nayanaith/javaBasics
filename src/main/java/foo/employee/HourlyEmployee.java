package foo.employee;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	//five argument constructor
	public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked){
		super(first,last,ssn);
		setHourlyWage(hourlyWage);
		setHours(hoursWorked);
	}//end HourlyEmployee constructor
	
	public void setHourlyWage(double hWage){
		if(hWage > 0.0)
			wage=hWage;
		else
			throw new IllegalArgumentException("Hourly wage must be > 0.0");
	}//end setHourlyWage
	
	public double getHourlyWage(){
		return wage;
	}//end getHourlyWage
	
	public void setHours(double hr){
		if(hr>0.0 && hr<=168.0)
			hours=hr;
		else
			throw new IllegalArgumentException("Hours worked must be betwen 0.0-168.0");
	}//end setHours
	
	public double getHours(){
		return hours;
	}//end getHours
	
	
	@Override
	public double earnings()
	{
		if(getHours()<=40)
			return getHourlyWage()*getHours();
		else
			return 40*getHourlyWage()+(getHours()-40)*getHourlyWage()*1.5;
	}//end earnings
	
	
	@Override
	public String toString(){
		return String.format("hourly employee: %s\n%s: $%,.2f;%s:%,.2f", 
				super.toString(),"hourly wage",getHourlyWage(),"hours worked",getHours());
	}
}
