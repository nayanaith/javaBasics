package foo.exceptions;

public class SmpleExpHandle {
	public static void main (String args[]){
        try {
            System.out.printf("%d", dividee(10, 0));
        }
        catch (ArithmeticException a){
            System.out.print("Kolla mattu..! ");
        }
	}//end main
	
	
	public static int dividee(int a, int b){
		int ans;
		ans = a/b;
		return ans;
	}//end dividee
}//end SmpleExpHandle
