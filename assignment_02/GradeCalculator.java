package assignment_02;
import java.util.Scanner;

public class GradeCalculator {
	
	private String stuName;
	private int stuID;
	private double lab;
	private double assignment;
	private double midterm;
	private double labFinal;
	private double finalExam;
	private double quiz;
	private double examGrade;
	private double practicalGrade;
	private double totalGrade;
	private String result;
	
	//creating an object called input of Scanner class 
	Scanner input = new Scanner(System.in);
	
	//create a void method named title() 
	public void title() {
		System.out.println("The grade calculator of CST8110. Prepared by Ajithyugan.");
		
		
	}
	//create a void method named getStudentDetails() 
	public void getStudentDetails() {
		System.out.print("\nEnter student name: ");
		stuName = input.nextLine();
		
		
		System.out.print("Enter student ID: ");
		stuID = input.nextInt();
		
		
		System.out.print("Enter lab marks between 0 and 15: ");
		lab = input.nextDouble();
		System.out.print("Enter assignment marks between 0 and 10: ");
		assignment = input.nextDouble();
		System.out.print("Enter midterm marks between 0 and 20: ");
		midterm = input.nextDouble();
		System.out.print("Enter lab final marks between 0 and 25: ");
		labFinal = input.nextDouble();
		System.out.print("Enter final exam marks between 0 and 25: ");
		finalExam = input.nextDouble();
		System.out.print("Enter quiz marks between 0 and 5: ");
		quiz = input.nextDouble();
		System.out.println("");
		
		
	}
	
	//create a void method named calculateGrades()
	public void calculateGrades() {
		
		practicalGrade = ((lab +assignment)/25)*100;
		examGrade = ((midterm + labFinal + finalExam)/70)*100;
		totalGrade  = (lab+assignment+midterm+labFinal+finalExam+quiz);
		
		if(practicalGrade>=50 && examGrade>=50 && totalGrade>=50) {
			result= "PASS";
			
		}
		else {
			result= "FAIL";
		}
		
	}
	
	//create a void method named printStudentGrade()
	public void printStudentGrade() {
		
		System.out.printf("%16s|%6d|%17.2f|%12.2f|%13.2f|%8s%n", stuName, stuID, practicalGrade, examGrade, totalGrade, result  );
		
		
		
		
	}
}//end of GradeCalculator
