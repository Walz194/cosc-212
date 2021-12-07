package lab2;

public class Triangle extends Shapes{
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3){
		super("Triangle");
		if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1){
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
		else
			throw new IllegalArgumentException("This is not possible");
		}
	public double perimeter(){
		return side1+side2+side3;
	}
	public double area(){
		double s = perimeter()/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	public String toString(){
		if(side1==side2 && side2==side3)
			super.setName("Equilateral Triangle");
		return super.toString()+String.format("\nThe length of sides are: %.2f, %.2f, %.2f respectively",side1,side2,side3);
	}
	public void scale(double scaling){
		side1*=scaling;
		side2*=scaling;
		side3*=scaling;
	}
}
