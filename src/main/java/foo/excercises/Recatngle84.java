package foo.excercises;

public class Recatngle84 {
	private double width=0;
	private double length=0;
	
	public Recatngle84(double x,double y){
		setWidth( x);
		setLength( y);
	}//end constructor
	
	public void setWidth(double wid){
		if(wid>0.0 && wid<=20.0)
			width=wid;
		else{
			System.out.printf("Width should be in the range of 0.0-20.0\n");
			}
	}//end setWidth
	
	public double getWidth(){
		return width;
	}//end getWidth
	
	public void setLength(double len){
		//if(0.0<len && 20.0>len){
		if(len>0.0 && len<20.0){
			length=len;
			System.out.printf("%f\n",length);
		}
		else{
			System.out.printf("Length should be in the range of 0.0-20.0\n");
		}
	}//end setLength
	
	public double getLength(){
		return length;
	}//end getLength	
	
	
	public double parameter(double widt,double leng){
		return (2*widt)+(2*leng);
	}//end parameter
	
	public double area(double wida, double lenga){
		return (double)(wida*lenga);		
	}//end area
}//end class
