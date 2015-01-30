package foo.fileHandling;

public class AccountRecord {
	private int account;
	private String firstName;
	private String lastName;
	private double balance;
	
	public AccountRecord(){
		this(0,"","",0.0);
	}
	
	public AccountRecord(int acct,String first,String last,double bal){
		setAccount(acct);
		setFirstName(first);
		setLastName(last);
		setBalance(bal);
	}//end AccountRecord
	
	public void setAccount(int acct){
		account=acct;
	}//end setAccount
	
	public int getAccount(){
		return account;
	}//end getAccount
	
	public void setFirstName(String first){
		firstName=first;
	}//end setFirstName
	
	public String getFirstName(){
		return firstName;
	}//end getFirstName
	
	public void setLastName(String last){
		lastName=last;
	}//end setLastName
	
	public String getLastName(){
		return lastName;
	}//end getLastName
	
	
	public void setBalance(double bal){
		balance=bal;
	}//end setBalance
	
	public double getBalance(){
		return balance;
	}//end getBalance
	
	
	
	
}//end class
