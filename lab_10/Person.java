package lab_10;

import java.util.Scanner;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Lab_05 update With ArrayList
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
abstract class Person {
	/*
	 * Instance variables: firstName(String), lastName(String), email(String),
	 * phoneNumber (long). Student class will be inheriting this class. So, think
	 * about the access specifiers for the instance variables.
	 */
	/**This is represent First name of the person*/
	protected String firstName;
	/**This is represent Last name of the person*/
	protected String lastName;
	/**This is represent email id of the person*/
	protected String email;
	/**This is represent phone number of the person*/
	protected long pNumber;
	/*
	 * Constructor: parameterized constructor that gets values to set all properties
	 * of a person 
	 */
	Person(){}
	/**This is a parameterized constructor that set  firstName, lastName, email, pNumber
	 * @param firstName-This is represent First name of the person
	 * @param lastName-This is represent Last name of the person
	 * @param email-This is represent Email id of the person
	 * @param pNumber-This is represent Phone number of the person
	 */

	public Person(String firstName, String lastName, String email, long pNumber) {
		this.firstName=firstName;
		this.lastName=firstName;
		this.email=email;
		this.pNumber=pNumber;
	}

	/**
	 * Methods: getter to return name. Name should be returned as one string. If
	 * first name is “John” and last name is “Doe”, getter should return “John Doe”.
	 * @return getName() return name as one string
	 */
	public String getName() {
		return firstName+" "+lastName;

	}

	/*
	 * Abstract methods in Java is a best way to make your methods incomplete that
	 * can be completed later at their right place. We use it to save ourselves to
	 * do large and same codes many times for many methods and in many class
	 */
	/**
	 * This is a readInfo method accepts a Scanner object, returns nothing. Reads personal information
	 * @param input - is a object of Scanner
	 */
	public abstract void readInfo(Scanner input);
	public abstract void printInfo();
}
