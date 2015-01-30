package foo;
import static java.lang.Math.*;

public class StaticImport {
	public static void main(String args[]){
		System.out.printf("sqrt(900)=%.2f\n",sqrt(900));
		System.out.printf("ceil(-9.8)=%.1f\n",ceil(-9.8));
		System.out.printf("E=%.5f\n",E);
		System.out.printf("PI=%.5f",PI);
	}
}
