package foo;

public class Time2 {
	private int hour;
	private int minute;
	private int second;
	
	public Time2(){
//		hour=0;
//		minute=0;
//		second=0;
		this (0,0,0);
	}
	
	public Time2(int h){
//		hour=h;
//		minute=0;
//		second=0;
		this (h,0,0);
	}
	
	public Time2(int h, int m){
//		hour=h;
//		minute=m;
//		second=0;
		this(h,m,0);
	}
	
	public Time2(int h, int m, int s){
//	hour=h;
//	minute=m;
//	second=s;
		setTime(h,m,s);
	}
	
	public Time2(Time2 time){
		this(time.getHour(),time.getMinute(),time.getSecond());
	}
	
	public void setTime(int h,int m, int s){
		hour=h;
		minute=m;
		second=s;
	}
	
	public void setHour(int h){
		if (h>=0 && h<24)
			hour=h;
		else throw new IllegalArgumentException("hour must be in 0-23 range");
	}//end setH
	
	public void setMinute(int m){
		if (m>=0 && m<60){
			minute=m;
		}
		else throw new IllegalArgumentException("minute must be in 0-59 range");
	}//end setM
		
	public void setSecond(int s){
		if (s>=0 && s<60){
			second=s;
		}
		else throw new IllegalArgumentException("second must be in 0-59 range");		
	}//end set S

	public int getHour(){
		return hour;
	}//end getH
	
	public int getMinute(){
		return minute;
	}//end getM
	
	public int getSecond(){
		return second;
	}//end getS

	public String toUniversalString(){
		return String.format("%02d:%02d:%02d",this.getHour(),this.getMinute(),this.getSecond());
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d %s",(this.getHour()==0 || this.getHour()==12 ? 12:this.getHour()%12),
				this.minute,
				this.getSecond(),
				(this.getHour()>12?"PM":"AM"));
	}
}
