package foo.employee.intrface;

public class Invoice implements Payable{
	private String partNumber;
	private String partDescription;
	private int quantitiy;
	private double pricePerItem;
	
	//four-argument constructor
	public Invoice(String part, String description, int count, double price){
		partNumber=part;
		partDescription=description;
		setQuantity(count);
		setPricePerItem(price);
	}//end constructor
	
	public void setPartNumber(String ptno){
		partNumber=ptno;
	}//end setPartNumber
	
	public String getPartNumber(){
		return partNumber;
	}//end getPartNumber
	
	public void setPartDescription(String dscrption){
		partDescription=dscrption;
	}//end setPartDescription
	
	public String getPartDescription(){
		return partDescription;
	}//end partDescription
	
	public void setQuantity(int count){
		if(count>=0)
			quantitiy=count;
		else 
			throw new IllegalArgumentException("Quantity must be >=0");
	}//end setQuantity
	
	public int getQuantity(){
		return quantitiy;
	}//end getQuantity
	
	public void setPricePerItem(double price){
		if(price>=0.0)
			pricePerItem=price;
		else
			throw new IllegalArgumentException("Price per item must be > 0.0");
	}//end setPricePerItem
	
	public double getPricePerItem(){
		return pricePerItem;
	}
	
	@Override 
	public String toString(){
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "invoice","part number", getPartNumber(), 
				getPartDescription(),"quantity",getQuantity(),"price per item",getPricePerItem());
	}//end toString

	public double getPaymentAmount() {
		return getQuantity()*getPricePerItem();
	}//end getPaymentAmount
	
}//end class Invoice
