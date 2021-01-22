
/**
 * 
 * @author Ajithyugan Jeyakumar :)
 * Student_number : 040997743
 * Lab_5_Inheritance & Abstract Class - College System
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Dr. James Mwangi
 * 
 * */
package lab_05;
 
public abstract class Person {
	/*
	 * Instance variables: firstName(String), lastName(String), email(String),
	 * phoneNumber (long). Student class will be inheriting this class. So, think
	 * about the access specifiers for the instance variables.
	 */
	protected String firstName;
	protected String lastName;
	protected String email;
	protected long pNumber;
	/*
	 * Constructor: parameterized constructor that gets values to set all properties
	 * of a person 
	 */
	Person(){}


	public Person(String firstName, String lastName, String email, long pNumber) {
		this.firstName=firstName;
		this.lastName=firstName;
		this.email=email;
		this.pNumber=pNumber;
	}
	/*
	 * Methods: getter to return name. Name should be returned as one string. If
	 * first name is “John” and last name is “Doe”, getter should return “John Doe”.
	 */
	public String getName() {
		return firstName+" "+lastName;

	}

	/*
	 * Abstract methods in Java is a best way to make your methods incomplete that
	 * can be completed later at their right place. We use it to save ourselves to
	 * do large and same codes many times for many methods and in many class
	 */
	public abstract void readInfo();
	public abstract void printInfo();
}
