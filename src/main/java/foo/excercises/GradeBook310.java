package foo.excercises;

public class GradeBook310 {
	private String courseName;
	private String instructorName;
	
	public GradeBook310(String csName, String csInstructor){
		this.setCourseName(csName);
		this.setInstructorName(csInstructor);		
		//		String courseName=csName;
//		String instructorName=csInstructor;
	}//end constructor
	
//	public GradeBook310(String csName, String csInstructor) {
//		// TODO Auto-generated constructor stub
//	}

	public void setCourseName(String csName){
		courseName=csName;
	}//end setCourseName
	
	public String getCourseName(){
		return courseName;
	}//end getCourseName
	
	
	public void setInstructorName(String csInstructor){
		instructorName=csInstructor;
	}//end setInstructorName
	
	public String getInstructorName(){
		return instructorName;
	}//end getInstructorName
	
	public void displayMessage(){
		System.out.printf("Welcome to the course %s ...!\nThis course is presented by: %s",this.getCourseName(),this.getInstructorName());
	}//end displayMessage
}//end class
