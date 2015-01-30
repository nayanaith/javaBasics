package foo;

public class StudentPoll {
	public static void main (String args[]){
		int[] responses={1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
		int[] frequency=new int[6];
		
		for(int answr=0; answr<responses.length; answr++){
			try{
				++frequency[responses[answr]];
			}//end try
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
				System.out.printf("responses[%d]=%d\n\n",answr,responses[answr]);
			}//end catch
		}//end for
			System.out.printf("%s%10s\n","Rating","Frequency");
			
			for(int rating=1;rating<frequency.length;rating++){
				System.out.printf("%6d%10d\n",rating,frequency[rating]);
			}//end for
		
	}//end main
}//end class
