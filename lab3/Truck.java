package lab3;

public class Truck extends FuelVehicle{
	private double capacity;
	
	public Truck(double baseFee, double nbKms, double capacity){
		super("Truck",baseFee, nbKms);
		this.capacity=capacity;
	}
	public void setCap(double capacity){
		this.capacity=capacity;
	}
	public double getCap(){
		return capacity;
	}
	public double getCost(){
		return (capacity*super.getCost())+super.getMileagesFee();
	}
	public String toString(){
		return super.toString()+"\nCapacity: " + capacity;
	}
}
