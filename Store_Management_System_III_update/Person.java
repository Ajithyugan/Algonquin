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
 *This class represent a person with all personal properties 
 */
public abstract class Person {

	/**This is represent First name of the person*/
	protected String firstName;

	/**This is represent Last name of the person*/
	protected String lastName;

	/**This is represent email id of the person*/
	protected String email;

	/**This is represent Phone number of the person*/
	protected long phoneNumber;


	/*
	 * If we don’t define a constructor in a class, then compiler creates default
	 * constructor (with no arguments) for the class Then it will make compile time errors.
	 */

	/**This is a no-arg constructor*/
	Person(){}

	/**This is a parameterized constructor that set  firstName, lastName, email, phoneNumber 
	 */

	/**
	 * 
	 * @param firstName-This is represent First name of the person
	 * @param lastName-This is represent Last name of the person
	 * @param email-This is represent Email id of the person
	 * @param phoneNumber-This is represent Phone number of the person
	 */
	public Person(String firstName,String lastName,String email,long phoneNumber) {
		this.firstName=firstName;
		this.lastName=firstName;
		this.email=email;
		this.phoneNumber=phoneNumber;
	}

	/*
	 * Methods: getter to return name. Name should be returned as one string. If
	 * first name is “John” and last name is “Doe”, getter should return “John Doe”.
	 */

	/**
	 * @return getName() return name as one string
	 */
	public String getName() {
		return firstName+" "+lastName;

	}
	/**
	 * This is a readInfo method accepts a Scanner object, returns nothing. Reads personal information
	 */

	/**
	 * 
	 * @param input - is a object of Scanner
	 */
	public  void readInfo(Scanner input) {

	}
	/**
	 * Abstract methods in Java is a best way to make your methods incomplete that
	 * can be completed later at their right place. We use it to save ourselves to
	 * do large and same codes many times for many methods and in many class
	 */
	public abstract void printInfo();
}
