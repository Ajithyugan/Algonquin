package Lab_3_Store_Management_System_II;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub

		/*
		 * This method read the name of the store (example: “Quality”) and the number of
		 * employees (stored in num).
		 */
		System.out.print("Enter name of the store: ");
		String name = input.nextLine();
		System.out.print("How many employees do you have? ");
		/* final */ int num = input.nextInt();

		/* A Store object will be created with the ‘num’. */
		Store st = new Store(num);

		/* Call readEmployeeDetails() method to read details of all employees */
		st.readEmployeeDetails();
		Store.printLine();
		Store.printTitle(name);

		/* Print the title and the header row */
		System.out.printf("============================================================================%n");
		System.out.printf("    Emp#     |   Name          |         Email   |       Phone  |    Salary|%n ");
		System.out.printf("===========================================================================%n");

		/* Call printEmployee() method to print details of all employees. */
		st.printEmployeeDetails();
		input.close();
	}

}
