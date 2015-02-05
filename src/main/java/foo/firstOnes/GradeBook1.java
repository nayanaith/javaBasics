package foo.firstOnes;

public class GradeBook1 {
	private String crsename=null;
	
	public void setCourseName(String courseName){
		crsename=courseName;
	}
	
	public String getCourseName(){
		return crsename;
	}

	public void displayMessage(){
		System.out.printf("Welcome to the course %s",crsename);
	}
	
}
