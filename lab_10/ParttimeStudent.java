package lab_10;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Lab_05 update With ArrayList
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
import java.util.Scanner;

/**
 *This class "ParttimeStudent" is a child class which extends the parent class "Student" with all personal properties 
 *That a Regular class is inherited from Employee class
 * Parent Class -Student
 * Child Class - ParttimeStudent
 */
public class ParttimeStudent extends Student{
	/**This is represent courseFeesTotal of the ParttimeStudent*/
	private double courseFeesTotal;
	/**This is represent credits of the ParttimeStudent*/
	private double credits;

	/* 
	 * accepts nothing, returns nothing. Make a call to the readInfo() method of
	 * the parent class. Then, reads tuition fees  and credit hours
	 */

	/**readInfo() method accepts a Scanner object, returns nothing. Reads ParttimeStudent type students's information. 
	 * This is an readInfo method which reads courseFeesTotal and credits from user
	 */
	public void readInfo (Scanner input) {
		super.readInfo(input);
		System.out.print("Enter total course fees: ");
		courseFeesTotal = input.nextDouble();

		System.out.print("Enter credit hours: ");
		credits = input.nextDouble();
	} 
	/*
	 * accepts nothing, returns nothing. Make a call to the printInfo() of the
	 * parent class. Then, prints tuitionFees and credit hours (formatted output).
	 */
	/**accepts nothing, returns nothing. Make a call to the printInfo() of the
	 * parent class. Then, prints courseFeesTotal and credits  info (formatted output)
	 */
	public void printInfo() {
		super.printInfo();

		System.out.printf("%10.2f|%8.2f|\n",courseFeesTotal,credits );
	}
	/**
	 * accepts Scanner input, returns nothing.  Reads ParttimeStudent type students's information. 
	 * This is an readInfo method which reads courseFeesTotal and credits from File
	 */
	public void readInfofromfile(Scanner input) {

		super.readInfofromfile(input);
		courseFeesTotal = input.nextDouble();
		credits= input.nextDouble();
	}
}
