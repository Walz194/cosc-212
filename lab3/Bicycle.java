package lab3;

public class Bicycle extends RentedVehicle{
	private int nbDays;
	public Bicycle(double baseFee, int nbDays){
		super("Bicycle",baseFee);
		this.nbDays=nbDays;
	}
	public void setDays(int nbDays){
		this.nbDays = nbDays;
	}
	public int getDays(){
		return nbDays;
	}
	public void travel(int x){
		System.out.println("I don't consume fuel");
	}
	public double getCost(){
		return nbDays*super.getCost();
	}
	public String toString(){
		return super.toString()+"\nNumber of Days: " + nbDays;
	}
}
