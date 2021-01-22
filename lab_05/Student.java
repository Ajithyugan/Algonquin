package lab_05;

import java.util.Scanner;



public class Student extends Person{

	private int studentNumber;
	private String programName;
	private double gpa;
	private int numberOfCourses;
	private double toMarks;
	
	Scanner input = new Scanner(System.in);	
	Student(){}	
	
	/*
	 * parameterized constructor that initializes an Person with Person number
	 * and all personal properties. As you have a parameterized constructor for
	 * Person class, use that to set personal properties.
	 */ 
	public Student(String firstName,String lastName,String email,long pNumber,int studentNumber,String programName,double gpa) {
		super(firstName, lastName, email, pNumber);
		this.studentNumber=studentNumber;
		this.programName=programName;
		this.gpa=gpa;
	}
	/* accepts nothing, returns nothing. Reads all student information. */
	@Override
	public void readInfo () {

		System.out.print("Enter program name: ");
		programName = input.nextLine();
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
		
		/* calling readMarks methord form readeInfo methord */
		this.readMarks();




	}
	/* accepts nothing, returns nothing. Reads all marks information. */
	private void readMarks() {
 
		
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
	private void calculateGpa(double[] marks) {
		double totalMarks=0;
		for (int i=0; i< marks.length; i++) {
			 totalMarks = totalMarks +marks[i];
		}
		gpa = (double)totalMarks / (marks.length *25);

	}
	/*
	 * accepts nothing, returns nothing. This method prints details of an Students
	 * using formatted output (use printf).
	 */
	@Override
	public void printInfo() {

		System.out.printf("%7s|%13d|%17s|%17s|%14d|%4.2f|", programName,studentNumber, getName(), email,pNumber,gpa );		
	}

}
