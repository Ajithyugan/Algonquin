package java_lab_09;

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
 * Store Management System III With ArrayList
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
public class Store {

	private static int number;
	private static Scanner input;
	/** an ArrayList of Employee named employees */
	private  ArrayList <Employee> employees;

	/**parameterized constructor
	 * @param num - reprecent the number of employee
	 */
	public	Store(int num) {
		employees = new ArrayList <Employee>(num);
	}

	/**readDetails() method accepts a Scanner object, returns nothing and reads details of  all Employees
	 * @param input - Object of the Scanner 
	 */
	public void readDetails(Scanner input) {
		boolean continueloop = true;
		do {
			try {
				System.out.println("Enter details of employee : "+(number+1));
				System.out.println("1.Regular \n2.Contractor"); 
				System.out.print("Enter type of employee: ");

				Employee emp = null;

				int typeS = input.nextInt();

				if (typeS == 1)
					emp= new Regular();

				if (typeS == 2)
					emp= new Contactor();

				emp.readInfo(input);
				employees.add(emp);
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

	/** printDetails() method accepts noting, returns nothing and pint details of  all Employees*/
	public void printDetails() {

		for (int i = 0; i <employees.size(); i++) {
			employees.get(i).printInfo();
		}
	}

	/** static method that prints a line using “=” */
	public static void printLine() {
		System.out.println("============================================================================");
	}

	/**static method that prints the title of the output. This method gets the name
	 * of the store as a parameter, which will be used in the formatted print
	 * statement. printLine() method will be called from this method to print lines.
	 * @param name - reprecent the name of Store
	 */
	public static void printTitle(String name) {
		System.out.println("                  "+name+" Store Management System                     ");

	}

	/** This method open a File by using  This "src\java_lab_09\lab_09_text_file.txt" path
	 * @param input - Object of the Scanner 
	 */
	public void openfile(Scanner input) {
		try {
			input = new Scanner(Paths.get("src\\java_lab_09\\lab_09_text_file.txt"));
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

	/**accepts Scanner input, returns nothing.read details of all
	  employees. First, read the type of the employee. Based on the type of the
	  employee, corresponding arrayList object needs to be created (Polymorphism).
	  Then, call readInfofromfile() method.
	 * @param input - Object of the Scanner 
	 */
	public  void readfromfile(Scanner input) {
		try {
			while(input.hasNext()) {
				Employee emp = null;
				char eType = input.next().charAt(0);
				if (eType == 'r')
					emp= new Regular();
				if (eType == 'c')
					emp= new Contactor();
				emp.readInfofromfile(input);
				employees.add(emp);
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
	 * @return - Output Of the Number of Employee is not assign
	 */
	public boolean isArrayListEmpty() {
		if (number == 0)
			return true;
		else 
			return false;
	}

}
