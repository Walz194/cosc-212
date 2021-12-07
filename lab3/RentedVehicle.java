package lab3;

public class RentedVehicle {
	private String name;
	private double baseFee;
	
	public RentedVehicle(String nm, double baseFee){
		name = nm;
		this.baseFee=baseFee;
	}
	public void  setBase(double baseFee){
		this.baseFee=baseFee;
	}
	public double getCost(){
		return baseFee;
	}
	public void travel(int x){
		System.out.println("I cannot define ho to travel");
	}
	public String toString(){
		return "Vehicle Type: " + name +"\n Basefee: " + baseFee;
	}
}
