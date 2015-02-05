package foo.firstOnes;
//ASSUMPTIONS:
//array length will be vary
//array will be always integer which contains numbers below 10
public class AnalyzeArray {
	public static void main(String args[]){
		int[] arry={1,1,5,2,7,5,5};
		int one=0,
		two=0,
		three=0,
		four=0,
		five=0,
		six=0,
		seven=0,
		eight=0,
		nine=0,
		ten=0,
		value=0;
		
		for (int counter=0; counter<=(arry.length-1); counter++){
			value = arry[counter];
			switch (value) {
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
				
			case 7:
				seven++;
				break;
				
			case 8:
				eight++;
				break;
				
			case 9:
				nine++;
				break;
				
			case 10:
				ten++;
				break;				
			}//end switch
		}//end for
		
		System.out.printf("The number of number one occurances are: %d\n",one);

		System.out.printf("The number of number two occurances are: %d\n",two);

		System.out.printf("The number of number three occurances are: %d\n",three);

		System.out.printf("The number of number four occurances are: %d\n",four);

		System.out.printf("The number of number five occurances are: %d\n",five);

		System.out.printf("The number of number six occurances are: %d\n",six);

		System.out.printf("The number of number seven occurances are: %d\n",seven);

		System.out.printf("The number of number eight occurances are: %d\n",eight);

		System.out.printf("The number of number nine occurances are: %d\n",nine);

		System.out.printf("The number of number ten occurances are: %d\n",ten);		
		
	}//end class
}//end main

