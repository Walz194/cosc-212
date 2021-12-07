package lab3;
import java.util.Random;
public class Application {
	public static void main(String[] args){
		Random random = new Random();
		RentedVehicle[] example = new RentedVehicle[6];
		for(int i =0;i<6;i++)
			example[i] = create(random.nextInt(3));
		for(int j =0;j<20;j++)
			example[random.nextInt(6)].travel(random.nextInt(300));
		double cost = 0.0;
		for(int i =0;i<6;i++){
			cost += example[i].getCost();
			System.out.println((i+1) + "\n" +example[i]);
		}
		System.out.println("Total rent Cost: " + cost);	
		
	}
	static RentedVehicle create(int y){
		if(y==0)
			return new Car(5,250,300);
		if(y==1)
			return new Truck(15,400,500);
		return new Bicycle(150,8);
	}
	
}
