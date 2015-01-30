package foo.excercises;

public class InvoiceUse {
	public static void main(String args[]){
		Invoice invze = new Invoice("p_1","The first part",-4,55.50);
		System.out.printf("The invoice amount is %f",invze.getInvoiceAmnt());
	}

}
