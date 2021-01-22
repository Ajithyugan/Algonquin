package java_lab_09;

import java.util.InputMismatchException;
import java.util.Scanner;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Store Management System III With ArrayList
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
public class Lab09 {

	private static int num;
	public static int type;

	/**
	 * @param args - main method of driver class
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueloop = true;
		System.out.print("Enter name of the store: ");
		String name = input.nextLine();
		
		/**
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

			} catch(InputMismatchException ime){
				input.nextLine();
				System.err.flush();
				System.err.println("******Input Mismatch Exception while reading number of employees******\n");
				System.err.flush();
			}catch (ArrayIndexOutOfBoundsException e) {
				System.err.flush();
				System.err.println(e.getMessage());
				System.err.flush();
			} 
			catch (Exception e) {
				System.err.flush();
				System.err.println("Unknown Exception " +e.getMessage()); 
				System.err.flush();
				} 
		} while (continueloop == true);

		Store st = new Store(num);

		do{

			do {
				try {
					System.out.println("1. Read The Employee Details From The User \n2. Read The Employee Details From The File \n3. Print Employee Details \n4. Quit");
					System.out.print(" Enter your option: ");
					type = input.nextInt();
					if(type < 1 || type >4) {
						System.err.flush();
						System.err.println("Invalid option.... please try again...");
						System.err.flush();
					}			
				} catch(InputMismatchException ime){
					input.nextLine(); 
					System.err.flush();
					System.err.println("******Input Mismatch Exception while reading number of employees******\n ");
					System.err.flush();
				}catch (Exception e) {
					System.err.flush();
					System.err.println("Unknown Exception " +e.getMessage());
					System.err.flush();
				} 
			} while (continueloop == true);

			if(type==1 ) {
					st.readDetails(input); 

			}else if (type == 2 ) {
				st.openfile(input);

			} else if(type == 3 ){


				if(st.isArrayListEmpty()== true)
					System.err.println("**** No Elements In The ArrayList ****");
					
					
			
				else {
					Store.printLine();
					Store.printTitle(name);


					System.out.printf("============================================================================%n");
					System.out.printf("    Emp#     |   Name          |         Email   |       Phone  |    Salary|%n ");
					System.out.printf("============================================================================%n");

					input.nextLine();
					st.printDetails();
				}

			}

		}while(type!= 4 );
		System.out.println("Goodbye... Have a nice day!");	
		input.close();
	}

}


