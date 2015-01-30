package foo.excercises;

public class Account312 {
	private double balance;
	private int id;
	
	public Account312(int idn, double bal){
		this.setId(idn);
		this.setBalance(bal);
	}//end constructor
	
	public void setId(int ids){
	id=ids;	
	}//end setId
	
	public int getId(){
		return id;
	}//end getId
	
	public void setBalance(double baln){
		balance=baln;
	}//end setBalance
	
	public double getBalance(){
		return balance;
	}//end getBalance
	
	public void credit(double amn){
		balance=balance+amn;
	}//end credit
	
	public void debit(double amn){
		double tmp=0;
		tmp = balance-amn;
		balance=tmp;
		if(tmp<0){
			balance=tmp+amn;
			System.out.println("Requested amount is greater than the available balance..!");
		}//end if
		else
			balance=tmp;
				
	}//end debit
	
}//end class
