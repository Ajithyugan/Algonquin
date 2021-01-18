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
 * Child Class - FulltimeStudent
 */
public class FulltimeStudent extends Student {
	/**This is represent tuitionFees of the ParttimeStudent*/
	private double tuitionFees;

	/**
	 * accepts nothing, returns nothing. Make a call to the readInfo() method of
	 * the parent class. Then, reads tuition fees 
	 */
	public void readInfo (Scanner input) {
		super.readInfo(input);
		System.out.print("Enter tuition fees:");
		tuitionFees = input.nextDouble();
	}  

	/**
	 * accepts nothing, returns nothing. Make a call to the printInfo() of the
	 * parent class. Then, prints tuitionFees (formatted output).
	 */
	public void printInfo() {
		super.printInfo();

		System.out.printf("%10.2f|\n",tuitionFees);

	}
	/**
	 * accepts Scanner input, returns nothing.  Reads ParttimeStudent type students's information. 
	 * This is an readInfo method which reads tuitionFees from File
	 */
	public void readInfofromfile(Scanner input) {

		super.readInfofromfile(input);
		tuitionFees = input.nextDouble(); 
	}
}