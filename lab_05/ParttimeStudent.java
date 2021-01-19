package lab_05;
 
public class ParttimeStudent extends Student{
	private double courseFeesTotal;
	private double credits;

	/*
	 * accepts nothing, returns nothing. Make a call to the readInfo() method of
	 * the parent class. Then, reads tuition fees  and credit hours
	 */
	public void readInfo () {
		super.readInfo();
		System.out.print("Enter total course fees: ");
		courseFeesTotal = input.nextDouble();

		System.out.print("Enter credit hours: ");
		credits = input.nextDouble();
	}
	/*
	 * accepts nothing, returns nothing. Make a call to the printInfo() of the
	 * parent class. Then, prints tuitionFees and credit hours (formatted output).
	 */
	public void printInfo() {
		super.printInfo();
		
		System.out.printf("%10.2f|%8.2f|\n",courseFeesTotal,credits );
	}
}
