package foo.exceptions;

public class UseMultipleException {
	public static void main(String args[]) {
		try {
			printAnswr(13,5,6);
		} catch (MultipleException e) {
			System.out.println("This demonstrate the handle or declare rule");
			e.printStackTrace();
		}
	}//end main
	
		
	public static void printAnswr(int c,int d,int e) throws MultipleException{
		int ans=dividedAnswer(c,d,e);
		System.out.println(ans);
	}//end printAnswr
	
	
	public static int dividedAnswer (int a, int b,int c) throws MultipleException{
		int ans=0;
		if (a>b)
			ans = (a/b)*c;
		else if (a>b)
			ans =(b/a)*c;
		else
			throw new MultipleException();				
		return ans;
	}//end dividedAnswer
}//end  UseMultipleException
