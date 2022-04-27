package Lab_3_Store_Management_System_II;

import java.util.Scanner;

public class Employee extends Person {
	protected int employeeNumber;
	Scanner input = new Scanner(System.in);

	/*
	 * parameterized constructor that initializes an employee with employee number
	 * and all personal properties. As you have a parameterized constructor for
	 * Person class, use that to set personal properties.
	 */ 
	Employee(){}

	public Employee(String firstName,String lastName,String email,long phoneNumber,int employeeNumber) {
		super(firstName, lastName, email, phoneNumber);
		this.employeeNumber= employeeNumber;
	}

	/* accepts nothing, returns nothing. Reads all employee information. */
	public void readEmployee() {


		System.out.print("Enter Employee Number: ");
		employeeNumber = input.nextInt();
		System.out.print("Enter fist name:  ");
		firstName = input.next();
		System.out.print("Enter last name: ");
		lastName = input.next();
		System.out.print("Enter email Id: ");
		email = input.next();
		System.out.print("Enter phone number: ");
		phoneNumber = input.nextLong();
	}

	/*
	 * accepts nothing, returns nothing. This method prints details of an employee
	 * using formatted output (use printf).
	 */
	public void printEmployee(){
		System.out.printf("%13d|%17s|%17s|%14d|", employeeNumber, getName(), email,phoneNumber );
	}
}
