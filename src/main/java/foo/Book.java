package foo;

public enum Book {
	//declare constants of enum type
	JHTP("Java how to progaram","2012"),
	CHTP("C How to program","2007"),
	IW3HTP("Internet & World Wide Web How to program","2008"),
	CPPHTP("C++ How to program","2012"),
	VBHTP("Visual Basic 2010 How to program","2011"),
	CSHARPHTP("Visual C# 2010 How to program","2011");
	
	
	//instance fields
	private final String title;
	private final String copyrightYear;
	
	//enum constructor
	Book(String bookTitle, String year){
		title=bookTitle;
		copyrightYear=year;
	}
	
	public String getTitle(){
		return title;
}
	
	public String getCopyrightYear(){
		return copyrightYear;
	}
}
