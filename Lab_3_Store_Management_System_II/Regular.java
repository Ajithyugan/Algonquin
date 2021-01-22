package Lab_3_Store_Management_System_II;

public class Regular extends Employee{
	private double salary;

	/*
	 * accepts nothing, returns nothing. Make a call to the readEmployee() method of
	 * the parent class. Then, reads annual salary from the user, converts it to
	 * monthly salary and store it in salary instance variable.
	 */
	public void readEmployee() {
		super.readEmployee();


		System.out.print("Enter the annual salary: "); 
		double annualsalary= input.nextDouble();

		salary= annualsalary/12; 

	}

	/*
	 * accepts nothing, returns nothing. Make a call to the printEmployee() of the
	 * parent class. Then, prints salary info (formatted output).
	 */
	public void printEmployee(){
		super.printEmployee();

		System.out.printf("%10.2f|\n",salary );


	}
}
