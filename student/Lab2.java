package student;
import java.util.Scanner;
public class Lab2 {

	public static void main(String[] args) {

		System.out.println("Enter for student1:");
		//1. create an object named student1 of class Student here.
		Student student1 = new Student();

		//2. call the inputStudentName(), inputStudentID(), and inputMarks() for student1 object.
		student1.inputStudentName();
		student1.inputStudentID();
		student1.inputMarks();


		System.out.println("\nEnter for student2:");
		//1. create an object named student2 of class Student here.
		Student student2 = new Student();

		//2. call the inputStudentName(), inputStudentID(), and inputMarks() for student2 object.
		student2.inputStudentName();
		student2.inputStudentID();
		student2.inputMarks();


		System.out.println("\nEnter for student3:");
		//1. create an object named student3 of class Student here.
		Student student3 = new Student();

		//2. call the inputStudentName(), inputStudentID(), and inputMarks() for student3 object.
		student3.inputStudentName();
		student3.inputStudentID();
		student3.inputMarks();

		System.out.println("\nEnter for student3:");
		//1. create an object named student3 of class Student here.
		Student student4 = new Student();

		//2. call the inputStudentName(), inputStudentID(), and inputMarks() for student3 object.
		student4.inputStudentName();
		student4.inputStudentID();
		student4.inputMarks();
		
		//Printing all students (do not change the following two lines)
		System.out.printf("  Name    |  ID  | Average%n");
		System.out.printf("--------------------------%n");

		//Final Task: call the printStudent() method for student1, student2, and student3 here.
		student1.printStudent();
		student2.printStudent();
		student3.printStudent();
		student4.printStudent();
	}//end of main method

}//end of class

