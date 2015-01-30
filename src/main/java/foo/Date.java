package foo;

public class Date {
	private int month;
	private int date;
	private int year;
	
	private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	// call checkDay to confirm proper value for day
	public Date(int theMonth, int theDay, int theYear){
		month=checkMonth(theMonth);
		year=theYear;
		date=checkDay(theDay);
		
	//	System.out.printf("Date object constructor for date %s\n",this);		
	}//end Date constructor
	
	//checking for proper month value
	private int checkMonth(int testMonth){
		if(testMonth>0 &&  testMonth<=12)
			return testMonth;
		else
			throw new IllegalArgumentException("Entered month value is not valid");
	}//end Check month
	
	private int checkDay(int testDay){
		if(testDay <= daysPerMonth[month] && testDay>0)
			return testDay;
		
		if(month==2 && testDay==29 && ((year%400==0) || (year % 4==0 && year%100 !=0)))
			return testDay;
			
		throw new IllegalArgumentException("Entered date value is not valid");		
	}//end checkDay
	
	public String toString(){
		return String.format("%d / %d / %d", month, date, year);
	}
	
	
}
