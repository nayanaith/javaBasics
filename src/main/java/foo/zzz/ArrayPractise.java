package foo.zzz;

import java.util.ArrayList;

public class ArrayPractise {
	public static void main(String args[]){
	
		String[] names=new String[5];
		names[0]="sajan";
		names[1]="pahan";
		names[2]="sepala";
		
		printArray1(names);
		
		ArrayList<String> lists=new ArrayList<String>();
		lists.add("arjuna");
		lists.add("sana");
		lists.add("aravinda");
		}//end main	
		
	public static void printArray1(String[] aria) { 
		try{
		for(String c:aria)
			System.out.println("\n"+c);		
			System.out.printf(""+aria[10]);			
		}//end try
		
		catch(ArrayIndexOutOfBoundsException e){
			//System.out.println("please check the index");
			//e.printStackTrace();
		}//end catch
	}//end printArray1	
	
	
}//end ArrayPractise
