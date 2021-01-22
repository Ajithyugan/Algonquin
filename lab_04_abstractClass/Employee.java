package lab_04_abstractClass;

import java.util.Scanner;

public abstract class Employee {
	Scanner input = new Scanner(System.in);

	
	protected String firstName;
	protected String lastName;
	protected String email;
	/* protected double hourlyRate; */
	protected double hoursPerWeek;
	
	
	Employee(){}

	
	public Employee(String firstName, String lastName, String email, /* double hourlyRate, */double hoursPerWeek) {
		this.firstName=firstName;
		this.lastName=firstName;
		this.email=email;
		/* this.hourlyRate=hourlyRate; */
		this.hoursPerWeek=hoursPerWeek;
	}
	
	public String getName() {
		return firstName+" "+lastName;

	}

	/*
	 * public void readEmployeeDetails() {
	 * 
	 * 
	 * 
	 * System.out.print("Enter fist name:  "); firstName = input.next();
	 * System.out.print("Enter last name: "); lastName = input.next();
	 * System.out.print("Enter email Id: "); email = input.next();
	 * 
	 * }
	 */
	 
	public abstract double payrollCalculation();
	public abstract void methodOfPayment();


	protected void readEmployee() {
		
	}

	
}

