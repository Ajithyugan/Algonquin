package java_lab_09;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Store Management System III With ArrayList
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
import java.util.Scanner;
/**
 *This class "Contactor" is a child class which extends the parent class "Employee" with all personal properties 
 *That a Contractor class is inherited from Employee class
 * Parent Class -Employee
 * Child Class - Contactor
 */
public class Contactor extends Employee {

	/**This is represent salary of the Contactor*/
	private double salary;
	/**This is represent Object name "inpput" of the Scanner class*/
	private static Scanner input;

	@Override
	/**readInfo() method accepts a Scanner object, returns nothing. Reads Contactor type employee's information. 
	 * This is an readInfo method which reads salary from user
	 */
	public void readInfo(Scanner input) {
		super.readInfo(input);
		System.out.println("Enter hourly rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter number of hours worked: "); 
		double numberOfHour= input.nextDouble(); 

		salary = rate* numberOfHour;
	}
	@Override
	/**accepts nothing, returns nothing. Make a call to the printInfo() of the
	 * parent class. Then, prints salary info (formatted output)
	 */
	public void printInfo(){

		super.printInfo();
		System.out.printf("%10.2f|\n",salary );
	}
	/**
	 * accepts Scanner input, returns nothing.  Reads Contactor type employee's information. 
	 * This is an readInfofromfile method which reads salary from File
	 */
	public void readInfofromfile(Scanner input) {
		super.readInfofromfile(input);

		double rate = input.nextDouble();
		double numberOfHour= input.nextDouble(); 
		salary = rate* numberOfHour;
	}
}