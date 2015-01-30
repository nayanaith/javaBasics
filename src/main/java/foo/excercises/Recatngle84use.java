package foo.excercises;

public class Recatngle84use {
	public static void main(String args[]){
		Recatngle84 recta=new Recatngle84(3.25,4.56);
		
		double para=recta.parameter(recta.getLength(),recta.getWidth());
		System.out.printf("%f\n",para);
		
//		double are=recta.area(recta.getLength(),recta.getWidth());
//		System.out.printf("%f",are);
	}//end main
}//end class
