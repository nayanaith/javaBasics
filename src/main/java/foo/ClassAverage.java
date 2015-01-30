package foo;

import java.util.Scanner;

public class ClassAverage {
	private int total;
	private int average;
	private int numOfGrds=0;
	
	public void enterGrades(){
		Scanner input=new Scanner(System.in);
		int grade=0;
		
		System.out.println("Please enter the grades or ':' to end:");
		grade=input.nextInt();
		
		while(grade!=999){
		total=total+grade;		
		numOfGrds++;
		grade=input.nextInt();
		}		
		displayAverge();
		input.close();
	}

	public double displayAverge(){
		average=total/numOfGrds;
		return average;		
	}
}
