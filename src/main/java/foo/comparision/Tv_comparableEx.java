package foo.comparision;

import java.util.Comparator;

public class Tv_comparableEx implements Comparable<Tv_comparableEx>{
	
	private String brandName;
	private int price;
	private int size;
	
	public Tv_comparableEx(String brname,int price,int size){
		this.brandName=brname;
		this.price=price;
		this.size=size;
	}//end Radio_comparableEx
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public int compareTo(Tv_comparableEx thatRadio) {
	
		if(this.perInchPrice(this.getPrice(),this.getSize()) > thatRadio.perInchPrice(thatRadio.getPrice(),thatRadio.getSize()))
				return -1;
		else
			return 1;
	}//end compareTo
	
	public int perInchPrice(int price,int size){
		return price/size;
	}//end perInchPrice
}//end Radio_comparableEx
