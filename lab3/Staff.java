package lab3;

class Staff {
	public static void main (String[] args) {
		StaffMember[] staffList;
	staffList = new StaffMember[4];
	staffList[0] = new Executive ("Ahmad","860-1490", 1923.07);
	staffList[1] = new Employee ("Ali","0555-0101", 846.15);
	staffList[2] = new HourlyEmployee ("Othman","0555-0690", 8.55);
	staffList[3] = new Volunteer ("Bandar","849-8374");
	for (int i=0;i< staffList.length;i++) {
		if (staffList[i] instanceof Executive) {
			Executive e=(Executive)staffList[i];
			e.awardBonus (5000.00);// downcasting to access awardBonus method
		}
		else if (staffList[i] instanceof HourlyEmployee) {
			HourlyEmployee h=(HourlyEmployee)staffList[i];
			h.addHours (40);// downcasting to access addHours method
		}
	}
	System.out.println("The total amount to pay is "+getTotalCost (staffList));
}
// compute payday costs
public static double getTotalCost (StaffMember[] stm) {
	double amount = 0.0;
	for (int count=0; count < stm.length; count++) {
		amount += stm[count].pay(); // polymorphism
	}
	return amount;
	}
}
