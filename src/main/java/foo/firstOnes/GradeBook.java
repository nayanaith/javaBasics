package foo.firstOnes;

public class GradeBook {
	private String courseName;
	private int[][] grades;
	
	public GradeBook(String name, int[][] gradesArray){
		courseName=name;
		grades=gradesArray;
	}//end method gradeBook
	
	public void setCourseName(String name){
		courseName=name;
	}//end setCourseName
	
	public String getCourseName(){
		return courseName;
	}//end getCourseName
	
	public void displayMessage(){
		System.out.printf("Welcome to the grade book for \n%s!\n\n",getCourseName());
	}//end displayMessage
	
	public void processGrade(){
		outPutGrades();
		
		System.out.printf("\n%s %d\n%s %d\n\n","Lowest grade in the grade book is",getMinimum(),
				"Highest grade in the grade book is",getMaximum());
		
		outPutBarChart();		
	}//end processGrade
	
	public int getMinimum(){
		int lowGrade=grades[0][0];
		
		for(int[] studentGrades:grades){
			for (int grade:studentGrades){
				if(grade<lowGrade)
					lowGrade=grade;
			}//end for
			
		}//end for
		return lowGrade;
	}//end getMinimum
	
	public int getMaximum(){
		int highGrade=grades[0][0];
		
		for(int[] studentGrades:grades){
			for(int grade:studentGrades){
				if(grade>highGrade)
					highGrade=grade;
			}//end for2
		}//end for1
		return highGrade;
	}//end getMaximum
	
	public double getAverage(int[] setOfGrades){
		int total=0;
		for (int grade:setOfGrades){
			total+=grade;
		}//end for
		
		return (double)total/setOfGrades.length;
	}//end method getAverage
	
	public void outPutBarChart(){
		System.out.println("Overall grade distribution:");
		int[] frequency= new int[11];
		
		//for each grade in Gradebook increment appropriate frequency
		for(int[] studentGrades:grades){
			for(int grade:studentGrades){
				++frequency[grade/10];
			}//end for2
		}//end for1
		
		//for each grade frequency, print bar in chart
		for(int count=0;count<frequency.length;count++){
				//output bar label("00-09:",...."90-99","100")
			if(count==10)
				System.out.printf("%5d: ",100);
			else
				System.out.printf("%02d-%02d: ",count*10,count*10+9);
		//print bar asteriks
			for(int stars=0; stars<frequency[count];stars++){
				System.out.print("*");
			
			}//end for2	
			System.out.println();
				
		}//end for1
	}//end outPutBarChart
	
	
	public void outPutGrades(){
		System.out.println("The grades are:\n");
		System.out.print("		");//align column heads
		
		//create a column heading for each of the tests
		for(int test=0; test<grades[0].length;test++)
			System.out.printf("Test%d\t",test+1);
			System.out.println("Average");
			
			for(int student=0;student<grades.length;student++){
				System.out.printf("Student %2d",student+1);
				for (int test:grades[student])//output student grades
					System.out.printf("%8d",	test);
				
				//call method getAverage to calculate student average grade
				//pass row of grades as the argument to the average
				double average=getAverage(grades[student]);
				System.out.printf("%9.2f\n",average);				
			}//end for		
	}
	
}//end class gradeBook
