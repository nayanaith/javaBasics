package foo.excercises;

public class Pyhogorean {
	public static void main(String args[]){
		int hypo=0;
		int side1=0;
		int side2=0;
		
		for(int k=0;k<500;k++){
			for(int j=0; j<500;j++){
				for(int i=0;i<500;i++ ){
					hypo++;
					if(Math.pow(hypo, 2)-(Math.pow(side1, 2)+Math.pow(side2, 2))==0){
						System.out.printf("%d\t%d\t%d\n",hypo,side1,side2);
					}
				}//for hypo
				side1++;
			}//for side2
			side2++;
			System.out.printf("%d\t%d\t%d\n",hypo,side1,side2);
		}//for side1
		
		
	}//end main
}//end class
