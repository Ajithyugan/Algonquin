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
 *This class "Regular" is a child class which extends the parent class "Employee" with all personal properties 
 *That a Regular class is inherited from Employee class
 * Parent Class -Employee
 * Child Class - Regular
 */
public class Regular extends Employee{

	/**This is represent Object name "inpput" of the Scanner class*/
	private static Scanner input;
	/**This is represent salary of the Regular*/
	private double salary;

	@Override
	/**readInfo() method accepts a Scanner object, returns nothing. Reads Regular type employee's information. 
	 * This is an readInfo method which reads salary from user
	 */
	public void readInfo(Scanner input) {
		super.readInfo(input);
		System.out.print("Enter the annual salary: "); 
		double annualsalary= input.nextDouble();
		salary= annualsalary/12; 
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
	 * accepts Scanner input, returns nothing.  Reads Regular type employee's information. 
	 * This is an readInfo method which reads salary from File
	 */
	public void readInfofromfile(Scanner input) {
		
		super.readInfofromfile(input);
		salary = input.nextDouble()/12; 
	}
}