package foo.firstOnes;

public class Hello {
	public static int go=2;
	
	public static void main (String args[]){
		System.out.println("Hello....I am back");
		 int x=5,
				 y=2,
				 z=0;
		 System.out.printf("%d",(x++)+y);
		 System.out.printf("%d",x);
		 System.out.printf("%s\n\n",x>10?"Greater than 5":"");
		 System.out.printf("The sum is  "+z);
	}
}
