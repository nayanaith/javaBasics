package foo;

public class Time1Use {
	public static void main (String args[]){
		Time1 time = new Time1();
		
		System.out.println("The initial universal time is: ");
		System.out.println(time.toUniversalString());
		System.out.println("The initial standard time is: ");
		System.out.println(time.toString());
		System.out.println();
		
		//Change and output updated time
		time.setTime(14, 23, 56);
		System.out.print("Universal time after set time is: ");
		System.out.println(time.toUniversalString());
		
		System.out.print("Standard time after set time is: ");
		System.out.println(time.toString());
		System.out.println();
		
		try{
			time.setTime(99,45, 54);
		}//end try
		catch(IllegalArgumentException e)
		{
			System.out.printf("Exception: %s\n\n", e.getMessage());
		}//end catch
		
		System.out.println("After attempting invalid settings: ");
		System.out.print("Universal time: ");
		System.out.println(time.toUniversalString());
		System.out.print("Standard time: ");
		System.out.println(time.toString());
	}//end main
	
}//end class Time1set

