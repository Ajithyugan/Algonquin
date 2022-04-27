package Store_Management_System_III;

import java.util.InputMismatchException;
import java.util.Scanner;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Store Management System III 
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */

public class Lab7 {
	
	/**This is represent number of the Employee*/ 
	
	
	private static int num;

	/**This is represent Until usert enters options*/
	public static int type;

	/** main method of driver class */
	public static void main(String[] args) {

		/** To read input from the input stream */
		Scanner input = new Scanner(System.in);
		boolean continueloop = true;
		// TODO Auto-generated method stub
		System.out.print("Enter name of the store: ");
		/** getting the string input from the user */
		String name = input.nextLine();

		/*
		 * The try statement allows you to define a block of code to be tested for
		 * errors while it is being executed. The catch statement allows you to define a
		 * block of code to be executed, if an error occurs in the try block. The try
		 * and catch keywords come in pairs
		 */
		do {
			try {
				System.out.print("\nHow many employees do you have? ");
				num = input.nextInt();

				if(num>0)
					continueloop = false;
				/** creating object name "ime" for InputMismatchException class */
			} catch(InputMismatchException ime){
				input.nextLine();

				System.err.println("******Input Mismatch Exception while reading number of employees******\n");
			}catch (ArrayIndexOutOfBoundsException e) {
			
			} 
			catch (Exception e) {
				System.out.println("Unknown Exception " +e.getMessage());
			} 
		} while (continueloop == true);

		/** creating an object for Store class */
		Store st = new Store(num);

		do{

			do {
				try {
					System.out.println("1. Read Employee Details \n2. Print Employee Details \n3. Quit");
					System.out.print(" Enter your option: ");
					type = input.nextInt();
					if(type < 1 || type >3) {
						System.out.println("Invalid option.... please try again...");
					}			
				} catch(InputMismatchException ime){
					input.nextLine(); 
					System.out.println("******Input Mismatch Exception while reading number of employees******\n ");
				}catch (Exception e) {
					System.out.println("Unknown Exception " +e.getMessage());
				} 

			} while (continueloop == true);

			if(type==1 ) {
				/** Call readDetails() method to read details of all employees */
				st.readDetails(input); 

			} else
				if(type == 2 ){
					Store.printLine();
					Store.printTitle(name);
					/** Print the title and the header row */
					System.out.printf("============================================================================%n");
					System.out.printf("    Emp#     |   Name          |         Email   |       Phone  |    Salary|%n ");
					System.out.printf("============================================================================%n");

					input.nextLine();
					/** Call printDetails() method to print details of all employees. */
					st.printDetails();
				}

		}while(type!= 3 );
		System.out.println("Goodbye... Have a nice day!");	
		input.close();
	}

}
