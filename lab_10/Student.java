package lab_10;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Lab_05 update With ArrayList
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**That a Student class is inherited from Person class and This class "Student" is a child class which extends the parent class "Person" with all personal properties
Parent Class -Person
Child Class - Student
*/
public class Student extends Person{

	/**This is represent Object name "inpput" of the Scanner class*/
	private static Scanner input;
	/**This is represent studentNumber of the Student*/
	private int studentNumber;
	/**This is represent programName of the Student*/
	private String programName;
	/**This is represent gpa of the Student*/
	private double gpa;
	/**This is represent numberOfCourses of the Student*/
	private int numberOfCourses;
	/**This is represent toMarks of the Student*/
	private double toMarks;


	/*If we don’t define a constructor in a class,
	 * then compiler creates default constructor (with no arguments)
	 * for the class Then it will make compile time errors.*/
	Student(){}	

	/**
	 * parameterized constructor that initializes an Person with Person number
	 * and all personal properties. As you have a parameterized constructor for
	 * Person class, use that to set personal properties.
	 * 
	 * @param firstName-This is represent First name of the person
	 * @param lastName-This is represent Last name of the person
	 * @param email-This is represent Email id of the person
	 * @param pNumber-This is represent Phone number of the person
	 * @param studentNumber-This is represent studentNumber of the Student
	 * @param programName-This is represent programName of the Student
	 * @param gpa-This is represent gpa of the Student
	 */
	public Student(String firstName,String lastName,String email,long pNumber,int studentNumber,String programName,double gpa) {
		super(firstName, lastName, email, pNumber);
		this.studentNumber=studentNumber;
		this.programName=programName;
		this.gpa=gpa;
	}
	/**accepts Scanner input, returns nothing.
	 * Reads all student information. */
	@Override
	public void readInfo (Scanner input) {
		boolean continueloop = true;
		do {
			try {

				System.out.print("Enter program name: ");
				programName = input.next();
				//input.next();
				System.out.print("Enter student number: ");
				studentNumber = input.nextInt();
				System.out.print("Enter fist name:  ");
				firstName = input.next();
				System.out.print("Enter last name: ");
				lastName = input.next();
				System.out.print("Enter email Id: ");
				email = input.next();
				System.out.print("Enter phone number: ");
				pNumber = input.nextLong();
				continueloop  = false;
			}catch (InputMismatchException ime) {
				System.err.flush();
				System.err.println("You Need to use Integer");
				System.err.flush();
				input.nextLine();
			}
		}while (continueloop == true);
		/* calling readMarks methord form readeInfo methord */
		this.readMarks(input);




	}
	/* accepts nothing, returns nothing. Reads all marks information. */
	/**
	 * @param input- is a object of Scanner
	 */
	private void readMarks(Scanner input) {


		System.out.print("Enter number of courses: ");
		numberOfCourses = input.nextInt();

		double [] marks = new double [numberOfCourses];
		for(int i =0 ; i< numberOfCourses; i++) {

			System.out.print("Enter mark "+(i+1)+":");
			marks [i] = input.nextDouble();

		}
		/* calling calculateGpa methord form readMarks methord */

		this.calculateGpa(marks);
	}
	/**
	 * @param marks - IS an array name for marks
	 */
	private void calculateGpa(double[] marks) {
		double totalMarks=0;
		for (int i=0; i< marks.length; i++) {
			totalMarks = totalMarks +marks[i];
		}
		gpa = (double)totalMarks / (marks.length *25);
		//gpa = (double)totalMarks / (numberOfCourses *25);
	}
	/*
	 * accepts nothing, returns nothing. This method prints details of an Students
	 * using formatted output (use printf).
	 */
	@Override
	public void printInfo() {

		System.out.printf("%7s|%13d|%17s|%17s|%14d|%4.2f|", programName,studentNumber, getName(), email,pNumber,gpa );		
	}
	public void openfile() {
		try {
			input = new Scanner(Paths.get("src\\lab_10\\students.txt"));
		}catch(NoSuchFileException ne){
			ne.getMessage();
			System.err.flush();
			System.err.println("File not found");
			System.err.flush();

		}catch(IOException ioe) {
			System.err.flush();
			System.err.println(ioe.getMessage());
			System.err.flush();
		}
	}
	/**
	 * @param input - is a object of Scanner
	 */
	public void readInfofromfile(Scanner input) {
		try {

			studentNumber = input.nextInt();
			firstName = input.next();
			lastName = input.next();
			email = input.next();
			pNumber= input.nextInt();
			programName=input.next();
			gpa=input.nextDouble();


			//phoneNumber = input.nextInt();

		}catch(NoSuchElementException ex) {
			System.err.flush();
			System.err.println(ex.getMessage());
			System.err.flush();
		}catch(IllegalStateException e) {
			System.err.flush();
			System.err.println(e.getMessage());
			System.err.flush();
		}
	}
}
