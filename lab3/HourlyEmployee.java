package lab3;

class HourlyEmployee extends Employee{
	private int hoursWorked;
// constructor
	public HourlyEmployee (String name,String phone,double payRate) {
		super (name,phone, payRate);
		hoursWorked = 0;
	}
// added method
	public void addHours (int moreHours) {
		hoursWorked += moreHours;
	}
// override method pay of Employee: Compute and return the pay for this
// HourlyEmployee
	public double pay () {
		double payment = getPayRate() * hoursWorked;
		hoursWorked = 0; // once pay computed set hoursWorked to 0
		return payment;
	}
}
