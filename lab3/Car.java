package lab3;

public class Car extends FuelVehicle{
	private int nbSeats;
	
	public Car(int nbSeats, double baseFee, double nbKms){
		super("Car",baseFee, nbKms);
		this.nbSeats = nbSeats;
	}
	public void setSeats(int nbSeats){
		this.nbSeats=nbSeats;
	}
	public int getSeats(){
		return nbSeats;
	}
	public double getCost(){
		return (nbSeats*super.getCost())+super.getMileagesFee();
	}
	public String toString(){
		return super.toString()+"\nNumber of Seats: " + nbSeats;
	}
}
