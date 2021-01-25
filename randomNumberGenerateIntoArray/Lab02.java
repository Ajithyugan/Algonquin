package randomNumberGenerateIntoArray;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Student Name: Jeyakumar Ajithyugan
 * Student Number:  040997743
 * Course: CST8130 - Data Structures
 * CET-CS-Level 3
 * Professor James Mwangi PhD
 */
public class Lab02 {
	/**
	 * @param args The main method of Driver class
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers num = new Numbers();// initializing an object for Numbers
		Scanner input = new Scanner(System.in);

		boolean done = false;
		int option = 0;

		do {
			try {


				Lab02.displayMainMenu ();
				option = input.nextInt();

				switch (option) {
				case 1:
					int  size;
					System.out.print("Enter new size of array: " );
					size = input.nextInt();
					num = new Numbers(size);
					break;

				case 2:
					num.generateNum();
					break;

				case 3:
					num.findCount(input);
					break;

				case 4:

					System.out.println(num.toString());
					break;

				case 5:
					System.out.println("Bye... Have a nice day!");
					done = true;
					break;

				default:
					System.out.println("Invalid option, please try again");
					break;
				}

			}	catch (InputMismatchException e) {
				input.nextLine();
				System.err.flush();
				System.err.println("Invalid option");
				System.err.flush();

			}catch (NullPointerException e) {
				System.err.flush();
				System.err.println("Array is not created... please create the array first");
				System.err.flush();
			}
		}while (!done);
		input.close();
	}
	public static void  displayMainMenu () {



		System.out.println("Please select one of the following:");
		System.out.println("1. Create array with new size");
		System.out.println("2. Generate random numbers and store it in the array");
		System.out.println("3. Search a number and display its number of occurrences");
		System.out.println("4. Display array ");
		System.out.println("5. Quit");
		System.out.println("Enter your option: ");

	}

}
