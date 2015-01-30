package foo.excercises;

public class Switch {
	public static void main (String args[]){
		int var=10;
		switch (var)
		{
		case 1:
			System.out.printf("Its one");
			break;
		case 2:
			System.out.printf("Its two");
			break;
		case 3:
			System.out.printf("Its three");
			break;
		default:
			System.out.println("Its not one, two or three");
		}
		
		System.out.printf("%f",Math.pow(4,2));
		System.out.println();
		System.out.println();
		System.out.println();
		
		int i=1;
		int sum=0;
		while (i<100){
			sum+=i;
			i+=2;
			if(i<3)
				System.out.printf("%d",i);
		}
		System.out.printf("%d\n",sum);
		
		sum=0;
		for(int c=1;c<100;c+=2){
			sum+=c;
			if(c<3)
				System.out.printf("%d\t",c);
		}
		System.out.printf("%d\n",sum);
	}//end main
}//end class
