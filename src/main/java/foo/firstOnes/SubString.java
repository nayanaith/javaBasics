package foo.firstOnes;

public class SubString {
	public static void main(String args[]){
		String letters="abcdefghijlkmabcdefghijklm";
		
		//test substring methods
		System.out.printf("Substring from index 20 to end is: %s\n",letters.substring(20));
		System.out.printf("%s \"%s\"\n", "Substring from index 3 up to, but not including 6 is: ",letters.substring(3,6));
		
		stringConcatenation();
		System.out.printf("\n------------Next program-----------\n");
		stringMiscellaneous2();
		System.out.printf("\n------------Next program-----------\n");
		stringValueOf();
		System.out.printf("\n------------Next program-----------\n");
		stringBuilderConstructors();
		System.out.printf("\n------------Next program-----------\n");
		stringBuilderCapLen();
		System.out.printf("\n------------Next program-----------\n");
	}//end main
	
	public static void stringConcatenation(){
		String s1 = "Happy";
		String s2 = "Birthday";
		System.out.printf("s1 = %s\n s2=%s\n\n",s1,s2);
		System.out.printf("Result of s1.concat(s2) = %s \n",s1.concat(s2));
		System.out.printf("s1 after concatenation = %s\n", s1);
		
	}//end stringConcatenation
	
	public static void stringMiscellaneous2(){
		String s1="hello";
		String s2="GOODBYE";
		String s3="     spaces  ";
		
		System.out.printf("s1 = %s\n s2=%s\n s3=%s\n\n",s1,s2,s3);
		
		//test method replace
		System.out.printf("Replace 'l' with 'L' in s1: %s\n\n", s1.replace('l','L'));
		
		//test toLowerCase and upperCase
		System.out.printf("s1.toUpperCase() = %s\n",s1.toUpperCase());
		System.out.printf("s2.toLowerCase() = %s\n\n", s2.toLowerCase());
		
		//test trim method
		System.out.printf("s3 after trim = \"%s\"\n\n",s3.trim());
		
		//test toCharArray method
		char[] charArray=s1.toCharArray();
		System.out.print("s1 as a charater array = ");
		
		for(char character:charArray)
			System.out.print(character);
		
		System.out.println();						
	}//end stringMiscellaneous2
	
	public static void stringValueOf(){
		char[] charArray={'a','b','c','d','e','f'};
		boolean booleanValue=true;
		char charaterValue='Z';
		int integerValue=7;
		long longValue=10000000000L;
		float floatValue=2.5f;
		double doubleValue=33.3333;
		Object objectRef="hello";
		
		System.out.printf("char array = %s\n",String.valueOf(charArray));
		System.out.printf("part of char array = %s\n", String.valueOf(charArray,3,3));
		System.out.printf("boolean =%s\n",String.valueOf(booleanValue));
		System.out.printf("char = %s\n", String.valueOf(charaterValue));
		System.out.printf("int = %s\n",String.valueOf(integerValue));
		System.out.printf("long = %s\n",String.valueOf(longValue));
		System.out.printf("float = %s\n", String.valueOf(floatValue));
		System.out.printf("double = %s\n",String.valueOf(doubleValue));
		System.out.printf("Object = %s",String.valueOf(objectRef));		
	}//end StringValueOf
	
	public static void stringBuilderConstructors(){
		StringBuilder buffer1=new StringBuilder();
		StringBuilder buffer2=new StringBuilder();
		StringBuilder buffer3=new StringBuilder("hello");
		
		System.out.printf("buffer1 = \"%s\"\n",buffer1);
		System.out.printf("buffer2 = \"%s\"\n", buffer2);
		System.out.printf("buffer3 = \"%s\"\n", buffer3);		
	}//end stringBuilderConstructors
	
	
	public static void stringBuilderCapLen(){
		StringBuilder buffer = new StringBuilder("Hello, how are you?");
		System.out.printf("buffer= %s\n length=%d\n capacity= %d\n\n ",buffer.toString(),buffer.length(),buffer.capacity());
		
		buffer.ensureCapacity(75);
		System.out.printf("New capacity: %d\n\n",buffer.capacity());
		buffer.setLength(10);
		System.out.printf("New length= %d\n buffer= %s\n",buffer.length(),buffer.toString());		
	}//end stringBuilderCapLen
}
