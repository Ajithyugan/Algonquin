package Lab_3_Store_Management_System_II;

public class Contractor extends Employee {
	private double hourlyRate;
	private double numHours;
	private double salary;


	/*
	 * accepts nothing, returns nothing. Make a call to the readEmployee() method of
	 * the parent class. Then, reads hourly rate and number of hours worked.
	 */
	public void readEmployee() {
		super.readEmployee();
		System.out.println("Enter hourly rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter number of hours worked: "); 
		double numberOfHour= input.nextDouble(); 

		salary = rate* numberOfHour;
	}

	/*
	 * accepts nothing, returns nothing. Make a call to the printEmployee() of the
	 * parent class. Then, prints salary, which is the product of hourly rate and
	 * the number of hours worked (formatted output).
	 */
	public void printEmployee(){
		super.printEmployee();
		System.out.printf("%10.2f|\n",salary );
	}
}

