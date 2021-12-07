package lab1;
public class CountedItem extends PurchaseItem{
	private int quantity;
	
	public CountedItem(String name, double unitPrice, int quantity){
		super(name, unitPrice);
		this.quantity = quantity;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public double getPrice(){
		return quantity * super.getPrice();
	}
	public String toString(){
		return super.toString()+" "+quantity+" units "+getPrice()+"NGN";
	}


}
