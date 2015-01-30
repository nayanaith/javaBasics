package foo;

public class Time1 {
	private int hour;
	private int minute;
	private int seconds;
	
	public void setTime(int h, int m, int s){
		
		//validate hour, minute and seconds
		if((h>=0 && h<24) && (m>=0 && m<60) && (s>=0 && s<60)){
			hour=h;
			minute=m;
			seconds=s;
		}//end if
		
		else 
			throw new IllegalArgumentException("Entered hour or minute or second was out of range");
	}//end setTime
	
	
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d",hour,minute,seconds);
	}//end toUniversalString
		
	
	public String toString(){
		return String.format("%d:%02d:%02d %s",
			((hour==0 || hour == 12) ? 12 : hour % 12), minute, seconds, (hour < 12 ? "AM":"PM"));
	}//end toString
	
}//end class
