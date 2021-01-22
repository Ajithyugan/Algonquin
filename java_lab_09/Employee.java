package java_lab_09;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Store Management System III With ArrayList
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/**That a Employee class is inherited from Person class and This class "Employee" is a child class which extends the parent class "Person" with all personal properties
  Parent Class -Person
  Child Class - Employee*/
public class Employee extends Person {
	
	
	/**This is represent Object name "inpput" of the Scanner class*/
	private static Scanner input;
	/**This is represent employeeNumber of the person*/
	protected int employeeNumber;
	
	
	/**If we don’t define a constructor in a class, then compiler creates default constructor (with no arguments) for the class Then it will make compile time errors.*/
	Employee(){}
	/**	This is a parameterized constructor that set  firstName, lastName, email, phoneNumber and employeeNumber
	 * 
	 * @param firstName-This is represent First name of the Employee
	 * @param lastName-This is represent Last name of the Employee
	 * @param email-This is represent Email ID of the Employee
	 * @param phoneNumber-This is represent Phone number of the Employee
	 * @param employeeNumber-This is represent Employee's number of the Employee
	 */
	public Employee(String firstName,String lastName,String email,long phoneNumber,int employeeNumber) {
		super(firstName, lastName, email, phoneNumber);
		this.employeeNumber= employeeNumber;
	}

	@Override
	/**readInfo() method accepts a Scanner object, returns nothing. Reads all employee information
	 * This is an readInfo method which reads informations from user*/
	public void readInfo( Scanner input) {
		boolean continueloop = true;
		do {
			try {
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
		continueloop  = false;
			}catch (InputMismatchException ime) {
				System.err.flush();
				System.err.println("You Need to use Integer");
				System.err.flush();
				input.nextLine();
			}
		}while (continueloop == true);

	}
	@Override
	/**accepts nothing, returns nothing. This method prints details of an employee using formatted output (use printf).
	 * This is an printInfo method which prints details of an employeer*/
	public void printInfo(){
		System.out.printf("%13d|%17s|%17s|%14d|", employeeNumber, getName(), email,phoneNumber );
	}
	/**
	 * */
	public void openfile() {
		try {
			input = new Scanner(Paths.get("src\\java_lab_09\\lab_09_text_file.txt"));
		}catch(NoSuchFileException ne){
			ne.getMessage();
			System.err.flush();
			System.err.println("File not found");
			System.err.flush();

		}catch(IOException ioe) {
			System.err.flush();
			System.err.println(ioe.getMessage());
			System.err.flush();
		}
	}

/**
 * @param input -Object of the Scanner 
 */
	public void readInfofromfile(Scanner input) {
		try {

			employeeNumber = input.nextInt();
			firstName = input.next();
			lastName = input.next();
			email = input.next();
			phoneNumber = input.nextInt();

		}catch(NoSuchElementException ex) {
			System.err.flush();
			System.err.println(ex.getMessage());
			System.err.flush();
		}catch(IllegalStateException e) {
			System.err.flush();
			System.err.println(e.getMessage());
			System.err.flush();
		}
	}



}