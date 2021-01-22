package lab_05;
 
public class FulltimeStudent extends Student {
	private double tuitionFees;

	/*
	 * accepts nothing, returns nothing. Make a call to the readInfo() method of
	 * the parent class. Then, reads tuition fees 
	 */
	public void readInfo () {
		super.readInfo();
		System.out.print("Enter tuition fees:");
		tuitionFees = input.nextDouble();
	}

	/*
	 * accepts nothing, returns nothing. Make a call to the printInfo() of the
	 * parent class. Then, prints tuitionFees (formatted output).
	 */
	public void printInfo() {
		super.printInfo();

		System.out.printf("%10.2f|\n",tuitionFees);

	}
}
