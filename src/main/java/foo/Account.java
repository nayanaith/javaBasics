package foo;

public class Account {
	private double acBal=0.0;
	
	//constructor
	public Account(double balance){
		if(balance >=0){
			acBal=balance;
		}
		else
			acBal=0;			
	}
	
	//crediting 
	public void credit(double amount){
		acBal=acBal+amount;
	}
	
	//displaying
	public double getBalance(){
		return acBal;
	}
	
}
