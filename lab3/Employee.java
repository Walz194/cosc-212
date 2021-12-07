package lab3;

class Employee extends StaffMember{
	private double payRate;
	public Employee (String name,String phone, double payRate) {
		super (name, phone);
		this.payRate = payRate;
	}
	public double getPayRate() {
		return payRate;
	}
// override pay method
	public double pay () {
		return payRate;
	}
}