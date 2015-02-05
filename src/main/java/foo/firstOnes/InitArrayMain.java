package foo.firstOnes;

public class InitArrayMain {
	public static void main(String args[]){
		if(args.length != 3){
			System.out.println("Error: please re-enter the the entire command, including\n"+"an array size, initial value and increment");
			}//end if
			else{
				int arrayLength=Integer.parseInt(args[0]);
				int[] array = new int [arrayLength];  //create array				
			
		
		//get initial value and increment command line arguments
		int initialValue=Integer.parseInt(args[1]);
		int increment=Integer.parseInt(args[2]);
		
		//calculate value for each array element
		for(int counter=0; counter<array.length; counter++){
			array[counter]=initialValue+increment*counter;
		}//end for
		System.out.printf("%s%8s\n","Index","Value");
		
		//display array index and value
		for(int counter=0; counter<array.length;counter++){
			System.out.printf("%5d%8d\n",counter,array[counter]);
		}//end for
	
	}//end else
	}//end main
}//end InitArrayMain
