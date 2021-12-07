package lab1;
public class PurchaseItemDemo {
	public static void main(String[] args){
		WeighedItem musty = new WeighedItem("bannana",50,12);
		CountedItem ben = new CountedItem("popcorn",100.0,2);
		System.out.print(musty+"\n"+ben);
	}
}
