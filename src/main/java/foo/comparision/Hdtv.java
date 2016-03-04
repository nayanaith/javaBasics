package foo.comparision;

public class Hdtv {
	
	private String brandName;
	private String quality;
	private int price;
	private int size;
	
	
	public Hdtv(String brname,String qual,int prz, int siz){
		this.brandName=brname;
		this.quality=qual;
		this.price=prz;
		this.size=siz;
	}//end Hdtv
	
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
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
	
}//end Hdtv
