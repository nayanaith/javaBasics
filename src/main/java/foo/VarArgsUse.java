package foo;

public class VarArgsUse {
	public static double average(double... numbers){
		double total=0.0;
		
		for(double b:numbers){
			total+=b;
		}//end for
	return total/numbers.length;
	
}//end average


public static void main(String me[]){
	double d1=10.0;
	double d2=21.2;
	double d3=32.2;
	double d4=34.245;
	System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",d1,d2,d3,d4);
	
	System.out.printf("Average of d1 and d2 is %.1f\n",average(d1,d2));
	
	System.out.printf("Average of d1,d2 and d3 is %.1f\n",average(d1,d2,d3));
	
	System.out.printf("Average of d1, d2,d3 and d4 is %.1f\n",average(d1,d2,d3,d4));
	
}//end main
}//end class VarArgsUse