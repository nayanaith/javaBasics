package foo;

public class Time2Use {
	public static void main(String args[]){
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(15);
		Time2 t3 = new Time2(15,12);
		Time2 t4 = new Time2(15,12,45);
		Time2 t5 = new Time2(t4);
		
		System.out.println(t1.toString());
		System.out.println(t1.toUniversalString());
		System.out.printf("\n");
		
	
		System.out.println(t2.toString());
		System.out.println(t2.toUniversalString());
		System.out.printf("\n");
		

		System.out.println(t3.toString());
		System.out.println(t3.toUniversalString());
		System.out.printf("\n");

		System.out.println(t4.toString());
		System.out.println(t4.toUniversalString());
		System.out.printf("\n");

		System.out.println(t5.toString());
		System.out.println(t5.toUniversalString());
		System.out.printf("\n");
		
			
	}
}
