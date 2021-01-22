/**
 * @author Ajithyugan Jeyakumar
 *Title : Lab 3: Store Management System II
 *Student Id : 040997743
 *College e-mail: 	jeya0023@algonquinlive.com
 *20F_CST_8132_303
 *
 */
package Lab_3_Store_Management_System_II;

import java.util.Scanner;

public class Person {
	/*
	 * Instance variables: firstName(String), lastName(String), email(String),
	 * phoneNumber (long). Employee class will be inheriting this class. So, think
	 * about the access specifiers for the instance variables.
	 */
	protected String firstName;
	protected String lastName;
	protected String email;
	protected long phoneNumber;

	Scanner input = new Scanner(System.in);

	/*
	 * Constructor: parameterized constructor that gets values to set all properties
	 * of a person (do you need a no-arg constructor??? Think and decide!)
	 */
	Person(){}

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
	public String getName() {
		return firstName+" "+lastName;

	}

}
