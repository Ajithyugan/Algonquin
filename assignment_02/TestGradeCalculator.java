package assignment_02;

public class TestGradeCalculator {

	public static void main(String[] args) {
		// create an object named student1 of class Student here.
		GradeCalculator student1 = new GradeCalculator();
		
		//call the title(), getStudentDetails(), and calculateGrades() for student1 object.
		student1.title();
		student1.getStudentDetails();
		student1.calculateGrades();
		
		// create an object named student2 of class Student here.
		GradeCalculator student2 = new GradeCalculator();

		//call the title() and getStudentDetails() for student2 object.
		student2.getStudentDetails();
		student2.calculateGrades();
		
		
		// create an object named student3 of class Student here.
		GradeCalculator student3 = new GradeCalculator();

		//call the title() and getStudentDetails() for student2 object.
		student3.getStudentDetails();
		student3.calculateGrades();
		
		
		//Printing all students
		System.out.printf(" Student Name   |  ID  | Practical grade | Exam grade | Total grade | Result%n");
		System.out.printf("-----------------------------------------------------------------------------%n");
		
		//call the printStudent() method for student1, student2, and student3 here.
		student1.printStudentGrade();
		student2.printStudentGrade();
		student3.printStudentGrade();
		
	}

}//end of TestGradeCalculator
