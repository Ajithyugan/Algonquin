package Store_Management_System_III;

import java.util.Scanner;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Store Management System III 
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
public class Store {
	/** an array of Employee named employees */
	Employee[] employees;

	private static int number;

	/*parameterized constructor that creates the array of employees with the given
	 * size (this size will be read in main(), and will be sent here when creating
	 * the Store object)*/

	/**parameterized constructor
	 * @param reprecent the number of employee
	 */
	public	Store(int num) {
		/* Creating an Object for Array nmed employees */
		employees = new Employee[num];
	}

	/*accepts nothing, returns nothing. In a for loop, read details of all
	 * employees. First, read the type of the employee. Based on the type of the
	 * employee, corresponding array object needs to be created (Polymorphism).
	 * Then, call readEmployee() method.*/

	/** readDetails() method accepts a Scanner object, returns nothing and reads details of  all Employees*/

	public void readDetails(Scanner input) {

		System.out.println("Enter details of employee : "+(number+1));
		/** Here,we  read the type of the employee */
		System.out.println("1.Regular \n2.Contractor"); 
		System.out.print("Enter type of employee: ");
		int typeS = input.nextInt();

		/** Here,we are creating an Object for all type of employee */

		if (typeS == 1)
			/** Regular Employee type array object creation(Polymorphism)*/	
			employees[number]= new Regular();

		if (typeS == 2)
			/** Contractor Employee type array object creation(Polymorphism)*/
			employees[number]= new Contractor();

		/** calling printInfo methord with employees array object */
		employees[number].readInfo(input);
		number++;
	}

	/*accepts nothing, returns nothing. In a for loop, call printInfo() to
	 * print details of all employees.*/

	/** printDetails() method accepts noting, returns nothing and pint details of  all Employees*/

	public void printDetails() {



		
			for (int i = 0; i <employees.length; i++) {
				if (employees[i] != null)
				employees[i].printInfo();
	
		}
	}

	/** static method that prints a line using “=” */
	public static void printLine() {
		System.out.println("============================================================================");
	}

	/*static method that prints the title of the output. This method gets the name
	 * of the store as a parameter, which will be used in the formatted print
	 * statement. printLine() method will be called from this method to print lines.*/

	/* Static method accept String name(Company name), and return noting */
	public static void printTitle(String name) {
		System.out.println("                  "+name+" Store Management System                     ");

	}
}
