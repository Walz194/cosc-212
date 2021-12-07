package lab2;

public class Ellipse extends Shapes{
		private double a;
		private double b;
		public Ellipse(double c, double d){
			super("Ellipse");
			a = Math.max(c,d);
			b = Math.min(c,d);
	}
		public double perimeter(){
			if(a==b)
				return 2*Math.PI*a;
			return Math.PI * Math.sqrt(2*(a*a + b*b) - Math.pow((a-b),2)/2);
		}
		public double area(){
			return Math.PI*a*b;
		}
		public String toString(){
			return super.toString()+"\nThe major axis is: "+a+"cm and the minor axis is: "+b+"cm";
		}
		public void scale(double scaling){
			a*=scaling;
			b*=scaling;
		}
}
