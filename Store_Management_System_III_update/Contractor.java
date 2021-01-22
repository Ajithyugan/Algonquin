package Store_Management_System_III;

import java.util.Scanner;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Store Management System III 
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
 
 /**
 *This class "Contractor" is a child class which extends the parent class "Employee" with all personal properties 
 */

/*That a Contractor class is inherited from Contractor class
 * Parent Class -Employee
 * Child Class - Contractor*/ 
public class Contractor extends Employee {

	/**This is represent salary of the Contractor*/
	private double salary;
	
	
	
	/* readInfo() method accepts a Scanner object, returns nothing. Reads Contractor type employee's information. */
	/**This is an readInfo method which reads salary from user*/
	@Override
	public void readInfo(Scanner input) {
		
		/** "Super key" is used to refer immediate parent class "readInfo" method */
	super.readInfo(input);
		System.out.println("Enter hourly rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter number of hours worked: "); 
		double numberOfHour= input.nextDouble(); 

		salary = rate* numberOfHour;
	}

	/*accepts nothing, returns nothing. Make a call to the printInfo() of the
	 * parent class. Then, prints salary, which is the product of hourly rate and
	 * the number of hours worked (formatted output).*/
	
	/**This is an printInfo method which prints details of Contractor type employee's information*/
	@Override
	public void printInfo(){
		/** "Super key" is used to refer immediate parent class "printInfo" method */
		super.printInfo();
		System.out.printf("%10.2f|\n",salary );
	}
}

