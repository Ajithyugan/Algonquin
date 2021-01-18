package lab_10;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Lab_05 update With ArrayList
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
public class College {
	
	private static int number;
	/** represent the name of the college */
	String name;
	/** an ArrayList of Student named students */
	private  ArrayList <Student> students;
	Scanner input = new Scanner(System.in);
	/*
	 * parameterized constructor that creates the array of students with the given
	 * size (this size will be read in main(), and will be sent here when creating
	 * the College object)
	 */
	
	public College() {}
	/**
	 * @param name - represent the name of the college
	 * @param num - represent the number of students
	 */
	public College(String name,int num) {

		this.name=name;

		students = new ArrayList <Student>(num);

	}

	/**
	 * accepts nothing, returns nothing. Print the title and the header row 
	 * @param name - represent the name of the college
	 */
	public void printTitle(String name) {
		System.out.println("");
		System.out.println(name+" - List of Students");
		System.out.println("*************************************");
		System.out.printf("Program|     Student#|             Name|            Email|         Phone| GPA|     Fees | Credits|%n ");

	}


	/**
	 * accepts nothing, returns nothing. In a while loop, read details of all
	 * students. First, read the type of the student. Based on the type of the
	 * student, corresponding array object needs to be created (Polymorphism).
	 * Then, call readStudentsDetails() method.
	 */

	public void readStudentsDetails() {
		boolean continueloop = true;
		do {
			try {

				System.out.println("Enter details of student: "+(number+1));
				System.out.println("================================");
				System.out.println("1 - Fulltime student \n2 - Parttime Student"); 
	
				System.out.println("Enter type of student: ");
				Student stu = null;
				int type = input.nextInt();

				if (type == 1)
					stu= new FulltimeStudent();
				if (type == 2)
					stu= new ParttimeStudent();

				stu.readInfo(input);
				students.add(stu);
				number++;
				continueloop = false;
			}catch (InputMismatchException ime) {
				System.err.flush();
				System.err.println("Input Mismatch Exception");
				System.err.flush();
				input.nextLine();
				System.err.flush();
				System.err.println("\nYou Must Need To Enter the Integer");
				System.err.flush();
			}catch (Exception e) {
				System.err.flush();
				System.err.println("Integer Out Of Range \nEnter The Vaild Integer");
				System.err.flush();
			}
		}while (continueloop == true);

	}
	/** printStudentDetails() method accepts noting, returns nothing and pint details of  all Students*/
	public void printStudentDetails() {
		for(int i =0; i<students.size();i++ ) {
			students.get(i).printInfo();
		}
	}
	/** This method open a File by using  This "src\\lab_10\\students.txt" path
	 * @param input - Object of the Scanner 
	 */
	public void openfile(Scanner input) {
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
		readfromfile(input);
	}
	/**accepts Scanner input, returns nothing.
	 * read details of all students. First, read the type of the students.
	 * Based on the type of the students, corresponding arrayList object needs to be created (Polymorphism).
	 * Then, call readInfofromfile() method.
	 * @param input - Object of the Scanner 
	 */
	public  void readfromfile(Scanner input) {
		try {
			while(input.hasNext()) {
				Student stu = null;
				char eType = input.next().charAt(0);
				if (eType == 'f')
					stu= new FulltimeStudent();
				if (eType == 'p')
					stu= new ParttimeStudent();
				stu.readInfofromfile(input);
				students.add(stu);
				number++;
			}
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

	/**
	 * @return - Output Of the Number of Students is not assign
	 */
	public boolean isArrayListEmpty() {
		if (number == 0)
			return true;
		else 
			return false;
	}
}
