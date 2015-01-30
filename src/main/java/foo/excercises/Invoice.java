package foo.excercises;

public class Invoice {
	private String parNo;
	private String partDsc;
	private int qtyPrchased;
	private double itemPrice;
	
	public Invoice(String partNo,String partDesc, int qtyPurcsd, double itmPrice){
		parNo=partNo;
		partDsc=partDesc;
		setQtyPrchased(qtyPurcsd);
		setItemPrice(itmPrice);		
	}//end constructor
	
	public void setQtyPrchased(int qtPrc){
		if (qtPrc<=0)
			qtyPrchased=0;
		else
			qtyPrchased=qtPrc;
	}//end setQtyPrchased
	
	public int getQtyPrchased(){
		return qtyPrchased;
	}//end getQtyPrchased
	
	
	public void setItemPrice(double itmPz){
		if (itmPz<=0)
			itemPrice=0;
		else
			itemPrice=itmPz;
	}//end setItemPrice
	
	public double getItemPrice(){
		return itemPrice;
	}//end getItemPrice
	
	public double getInvoiceAmnt(){
		return this.itemPrice*this.qtyPrchased;
	}
}
