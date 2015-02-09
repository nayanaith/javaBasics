package foo.excercises.jenkov;

public class Excercise3 {
	public static void main(String args[]){
		int[] numbers= {2,3,4,5,6};
		
		int sum=0;
		
		for(int number:numbers)
			sum=sum+number;
		
		System.out.printf("answer is %d",sum);
	}//end main
}//end Excercise3
