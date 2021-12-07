package Lab_InheritanceEx;

public class Undergrad extends Student{
		private String year;
		public Undergrad(int id, String name, double gpa, String year){
			super(id, name, gpa);
			this.year = year;
		}
		public String getYear() {
			return year;
		}
		public void setYear(String newYear) {
			this.year = newYear;
		}
		public String toString() {
			return "Undergraduate "+super.toString()+"\nYear: "+year;
		}
}