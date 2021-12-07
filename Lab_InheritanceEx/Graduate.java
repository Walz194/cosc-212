package Lab_InheritanceEx;

public class Graduate extends Student{
	private String thesisTitle;
	public Graduate(int id, String name, double gpa, String thesisTitle){
		super(id, name, gpa);
		this.thesisTitle = thesisTitle;
	}
	public String getthesisTitle() {
		return thesisTitle;
	}
	public void setThesisTitle(String newthesisTitle) {
		this.thesisTitle = newthesisTitle;
	}
	public String toString() {
		return "Graduate " +super.toString()+"\nThesis: "+getthesisTitle();
	}
}