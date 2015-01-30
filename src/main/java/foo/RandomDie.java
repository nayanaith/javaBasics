package foo;

import java.util.Random;

public class RandomDie {
	public static void main(String args[]){
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int temp=0;
		
		Random rnGen=new Random();
		
		for(int count = 0; count<=600000;count++){
			temp=1+rnGen.nextInt(6);
			
			switch(temp){
			case 1:
				one++;
				break;
				
			case 2:
				two++;
				break;
				
			case 3:
				three++;
				break;
			
			case 4:
				four++;
				break;
				
			case 5:
				five++;
				break;
			
			case 6:
				six++;
				break;
			
			}//end switch
		}//end for
		
		System.out.printf("Total face 1 count is: %d\n",one);	
		System.out.printf("Total face 2 count is: %d\n",two);	
		System.out.printf("Total face 3 count is: %d\n",three);	
		System.out.printf("Total face 4 count is: %d\n",four);	
		System.out.printf("Total face 5 count is: %d\n",five);
		System.out.printf("Total face 6 count is: %d\n",six);	
	}//end main
}//end class
