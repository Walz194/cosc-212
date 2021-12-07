package lab1;
public class WeighedItem extends PurchaseItem{
	private double weight;
	
	public WeighedItem(String name, double unitPrice, double weight){
		super(name,unitPrice);
		this.weight = weight;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
	public double getPrice(){
		return weight*super.getPrice();
	}
	public String toString(){
		return super.toString()+" "+weight+"kg "+getPrice()+"NGN";
	}

}
