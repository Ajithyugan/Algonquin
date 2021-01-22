package Lab_3_Store_Management_System_II;

import java.util.Scanner;

public class Store {
	/* an array of Employee named employees */
	Employee[] employees;

	Scanner input = new Scanner(System.in);

	/*
	 * parameterized constructor that creates the array of employees with the given
	 * size (this size will be read in main(), and will be sent here when creating
	 * the Store object)
	 */
	public	Store(int num) {
		employees = new Employee[num];
	}

	/*
	 * accepts nothing, returns nothing. In a for loop, read details of all
	 * employees. First, read the type of the employee. Based on the type of the
	 * employee, corresponding array object needs to be created (Polymorphism).
	 * Then, call readEmployee() method.
	 */
	public void readEmployeeDetails() {


		for(int i =0; i<employees.length;i++ ) {
			System.out.println("Enter details of employee : "+(i+1));
			System.out.println("1.Regular \n2.Contractor"); 
			System.out.print("Enter type of employee: ");
			int type = input.nextInt();
			if (type == 1)
				employees[i]= new Regular();
			if (type == 2)
				employees[i]= new Contractor();

			employees[i].readEmployee();
		}



	}

	/*
	 * accepts nothing, returns nothing. In a for loop, call printEmployee() to
	 * print details of all employees.
	 */
	public void printEmployeeDetails() {
		for(int i =0; i<employees.length;i++ ) {
			employees[i].printEmployee();
		}
	}

	/* static method that prints a line using “=” */
	public static void printLine() {
		System.out.println("============================================================================");
	}

	/*
	 * static method that prints the title of the output. This method gets the name
	 * of the store as a parameter, which will be used in the formatted print
	 * statement. printLine() method will be called from this method to print lines.
	 */
	public static void printTitle(String name) {
		System.out.println("                  "+name+" Store Management System                     ");

	}
}
