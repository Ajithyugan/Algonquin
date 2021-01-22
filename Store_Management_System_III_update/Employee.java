package Store_Management_System_III;

import java.util.Scanner;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Store Management System III 
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
 
 /**
 *This class "Employee" is a child class which extends the parent class "Person" with all personal properties 
 */

/*That a Employee class is inherited from Person class
 * Parent Class -Person
 * Child Class - Employee*/
public class Employee extends Person {


	/**This is represent employeeNumber of the person*/
	protected int employeeNumber;


	/*If we don’t define a constructor in a class, then compiler creates default
	 * constructor (with no arguments) for the class Then it will make compile time errors.*/

	/**This is a no-arg constructor*/
	Employee(){}

	/*
	 * parameterized constructor that initializes an employee with employee number
	 * and all personal properties. As you have a parameterized constructor for
	 * Person class, use that to set personal properties.*/


	/*This is a parameterized constructor that set  firstName, lastName, email, phoneNumber and employeeNumber */
	
	/**
	 * 
	 * @param firstName-This is represent First name of the Employee
	 * @param lastName-This is represent Last name of the Employee
	 * @param email-This is represent Email ID of the Employee
	 * @param phoneNumber-This is represent Phone number of the Employee
	 * @param employeeNumber-This is represent Employee's number of the Employee
	 */
	public Employee(String firstName,String lastName,String email,long phoneNumber,int employeeNumber) {
		/** "Super key"reference variable which is used to refer immediate parent class constructor such as firstName, lastName, email, phoneNumber . */
		
		super(firstName, lastName, email, phoneNumber);
		this.employeeNumber= employeeNumber;
	}



	/* readInfo() method accepts a Scanner object, returns nothing. Reads all employee information. */

	/**This is an readInfo method which reads informations from user*/
	@Override
	public void readInfo( Scanner input) {
		super.readInfo(input);
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

	/*accepts nothing, returns nothing. This method prints details of an employee using formatted output (use printf).*/

	/**This is an printInfo method which prints details of an employeer*/
	@Override
	public void printInfo(){
		System.out.printf("%13d|%17s|%17s|%14d|", employeeNumber, getName(), email,phoneNumber );
	}




}




