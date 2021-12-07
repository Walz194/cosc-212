package lab2;
public class TestClass {
	public static void main(String[] args){
		Scalable[] wale = new Scalable[4];	
		wale[0] = new Ellipse(5,3);
		wale[1] = new Triangle(6,6,6);
		wale[2] = new Circle(3);
	    wale[3] = new EquilateralTriangle(3.5);
	    System.out.println("-----Before Scaling-----");
		for(int i = 0; i<wale.length; i++){
			System.out.println( (i+1)+"\n"+wale[i]);
		}
		System.out.println("-----After Scaling-----");
		modShape(wale,2);
		for(int i=0; i<wale.length; i++){
			System.out.println((1+i)+"\n"+wale[i]);
		}
		
	}
	static void modShape(Scalable[] a, double x){
		for(int i=0;i<a.length;i++){
			a[i].scale(x);
		}
	}

}
