package foo.unitest.easymock;


public class IncomeCalculator {
	private ICalcMethod calcMethod;
	private Position position;
	
	public void setCalcMethod(ICalcMethod calcMethod){
		this.calcMethod=calcMethod;
	}//setCalcMethod
	
	public void setPosition(Position position){
		this.position=position;
	}//setPosition
	
	public double calc(){
		if(calcMethod==null){
			throw new RuntimeException("CalcMethod not yet maintained");
		}
		
		if(position==null){
			throw new RuntimeException("Position not yet maintained");
		}
		
		return calcMethod.calc(position);
	}//end calc
}//IncomeCalculator
