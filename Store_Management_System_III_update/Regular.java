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
 * Child Class - Regular*/
public class Regular extends Employee{
	/**This is represent salary of the Regular*/
	private double salary;


	/* readInfo() method accepts a Scanner object, returns nothing. Reads Regular type employee's information. */
	/**This is an readInfo method which reads salary from user*/
	@Override
	public void readInfo(Scanner input) {

		/** "Super key" is used to refer immediate parent class "readInfo" method */
		super.readInfo(input);
		System.out.print("Enter the annual salary: "); 
		double annualsalary= input.nextDouble();

		salary= annualsalary/12; 

	}

	/*accepts nothing, returns nothing. Make a call to the printInfo() of the
	 * parent class. Then, prints salary info (formatted output)*/

	/**This is an printInfo method which prints details of Regular type employee's information*/
	@Override
	public void printInfo(){

		/** "Super key" is used to refer immediate parent class "printInfo" method */
		super.printInfo();		
		System.out.printf("%10.2f|\n",salary );


	}

}