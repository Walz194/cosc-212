package lab0;

public class Student {
	private int ID;
	private double GPA;
	
	public Student(int id, double gpa){
		this.ID  = id;
		this.GPA = gpa;
	}
	public Student(int id){
		this(id,0.0); //or the one below depending on your choice
//		this.ID = id;
//		this.GPA = 0.0;
	}
	public int getID(){
		return ID;
	}
	public double getGPA(){
		return GPA;
	}
	public void setGPA(double gpa){
		this.GPA = gpa;
	}
	public String toString(){
		return String.format("ID: %d%nGPA: %.2f", ID,GPA);
	}
	
}
