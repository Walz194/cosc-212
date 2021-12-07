package Lab_InheritanceEx;

public class Student{
	private String name;
	private int id;
	private double gpa;
	public Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	public Student(int id, double gpa){
		this(id, "", gpa);
	}
	public String getName(){
		return name;
	}
	public int getId() {
		return id;
	}
	public double getGPA(){
		return gpa;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public String toString(){
		return "Student:\nID: "+id+"\nName: "+name+"\nGPA: "+gpa;
	}
}