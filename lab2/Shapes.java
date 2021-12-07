package lab2;

public abstract class Shapes implements Scalable{
	 private String name;
	 public Shapes(String name){
		 this.name = name;
	 }
	 public void setName(String s){
		 s=name;
	 }
	 public abstract double perimeter();
	 public abstract double area();

	 public String toString(){
		 return String.format("Shape: %s \nThe Perimeter of the Shape is %.02f \nThe Area of the Shape is %.02f",name,perimeter(),area());
	 }
}
