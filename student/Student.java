package student;
/*****************************************/
//YOur name:
//Student ID:
/*****************************************/

import java.util.Scanner;

class Student{
	//declaring instance variables
	private String studentName;
	private int studentID;
	private double mark1;
	private double mark2;
	private double mark3;
	
	//creating an object called input of Scanner class 
	Scanner input = new Scanner(System.in);
	public void inputStudentName() {
		System.out.print("Enter student name: ");
		studentName = input.nextLine();
	}
	
	//create a void method named inputStudentID() here.(worth:.4%)
	//write your code here
	public void inputStudentID(){
		System.out.print("Enter student ID: ");
		studentID = input.nextInt();
		
	}
	
	//create a void method named inputMarks() here.(worth:.4%)
	//write your code here
	public void inputMarks(){
		System.out.print("Enter mark 1: ");
		mark1 = input.nextDouble();
		System.out.print("Enter mark 2: ");
		mark2 = input.nextDouble();
		System.out.print("Enter mark 3: ");
		mark3 = input.nextDouble();
		
	}
	
	//create a double type method named calculateAverage(): (worth:.4%)
	//This method will return average of 3 course marks
	//write your code here
	
	public double calculateAverage() {
		return(mark1 + mark2 + mark3)/3;
			
	}
	
	//do not change this method. Just try to get how is printStudent() method working here...
	public void printStudent() {
		System.out.printf("%10s|%6d|%6.2f%n", studentName,studentID,calculateAverage());
	}
	
}//end of Student class
