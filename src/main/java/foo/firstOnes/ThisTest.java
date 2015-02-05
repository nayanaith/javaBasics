package foo.firstOnes;

public class ThisTest {
	public static void main (String args[]){
		SimpleTime time = new SimpleTime(15,30,9);
		System.out.println(time.buildString());
	}//end main
}//end ThisTest


class SimpleTime{
	private int hour;
	private int minute;
	private int second;
	
	
public SimpleTime(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}//end constructor
	
	public String buildString()
	{
		return String.format("%24s:%s\n%24s: %s","this.toUniversalString()",this.toUniversalString(),
							"toUniversalString()",toUniversalString());
	}//end method buildString
	
		
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", this.hour,this.minute,this.second);
	}//end toUniversalString
}//end class simpleTime
