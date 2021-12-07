package lab1;
public class PurchaseItem {
	private String name;
	private double unitPrice;
	
	public PurchaseItem(String name, double unitPrice){
		this.name = name;
		this.unitPrice = unitPrice;
	}
	public PurchaseItem(){
		this.name = "no item";
		this.unitPrice = 0.0;
	}
	public double getPrice(){
		return unitPrice;
	}
	public void setPrice(double price){
		unitPrice = price;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String toString(){
		return getName()+" @ "+unitPrice;
	}

}
