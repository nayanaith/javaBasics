package foo.comparision;

public class Tv_comparableExUse {
	public static void main(String args[]){
		Tv_comparableEx rd1=new Tv_comparableEx("Samsung",20000,17);
		Tv_comparableEx rd2=new Tv_comparableEx("Singer",25000,34);
		
		if(rd1.compareTo(rd2)<0)
			System.out.println(rd1.getBrandName()+" is better");	
		else
		{
			System.out.println(rd2.getBrandName()+" is better");	
			System.out.printf("%s",rd1.perInchPrice(rd1.getPrice(),rd1.getSize()));
		}//end else
		
	}//end main
}//end Radio_comparableExUse
