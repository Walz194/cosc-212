package lab3;

public class FuelVehicle extends RentedVehicle{
	private double nbKms;
	public FuelVehicle(String name, double baseFee, double nbKms) {
		super(name, baseFee);
		this.nbKms = nbKms;
	}
	public void setKm(double nbKms){
		this.nbKms = nbKms;
	}
	public double getKm(){
		return nbKms;
	}
	public double getMileagesFee(){
		double mileagefees = 0.0;
		if (nbKms < 100)
			mileagefees=0.2*nbKms;
		else if(nbKms>=100 && nbKms<=400)
			mileagefees=0.3*nbKms;
		else if(nbKms > 400)
			mileagefees=(0.3*400) +(0.5*(nbKms-400));
		return mileagefees;
	}
	public void travel(int x){
		nbKms += x;
	}
	public String toString(){
		return super.toString()+"\nKilometers: " + nbKms;
	}
	
}
