package lab2;

public class Circle extends Shapes {
	private double radius;
	public Circle(double radius){
		super("Circle");
		this.radius = radius;
	}
	public double perimeter(){
		return 2*Math.PI*radius;
	}
	public double area(){
		return Math.PI*radius*radius;
	}
	public String toString(){
		return super.toString()+"\nThe radius is: "+radius;
	}
	public void scale(double scaling){
		radius*=scaling;
	}
}
