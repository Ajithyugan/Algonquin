package W2020_lab_01;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * CET - CS Academic Level 3
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Jeyakumar Ajithyugan
 * Student Number:  040997743
 * Course: CST8130 - Data Structures
 * @author/Professor James Mwangi PhD. 
 * @author Linda Crane
 * @author Melissa Sienkiewicz
 */
public class Lab1 {

	/**
	 * @param args The main method of Driver class
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers lab1 = new Numbers(); // initializing an object for Numbers
		Scanner keyboard = new Scanner(System.in);
		boolean continueloop = false;
		do {

			try {
				Lab1.displayMainMenu ();
				int	option = keyboard.nextInt();

				switch (option) {
				case 1://user is gonna make a default array
					lab1 = new Numbers();
					break;

				case 2://user is gonna give the size of an array 
					int  size;
					System.out.print("Enter new size of array: " );
					size = keyboard.nextInt();
					lab1 = new Numbers(size);
					break;

				case 3://user is gonna add float values in array
					lab1.addValue(keyboard);
					break;

				case 4:// user is calling tostring method to out put the numbeer 

					System.out.println("The numbers are :\n"+lab1.toString());
					break;

				case 5: // user is calling calc method
					System.out.println("Average is: " + lab1.calcAverage()); 
					break;

				case 6:
					System.out.println("Exiting....");
					continueloop = true;
					break;

				default:
					System.out.println("Invalid option, please try again\n");
					break;
				}
			}catch (InputMismatchException e) {
				keyboard.nextLine();
				System.err.flush();
				System.err.println("\nInvalid option\n");
				System.err.flush();

			} 
				
			
		} while (continueloop != true);
		//keyboard.close();// close the user input
	}
	public static void  displayMainMenu () {
		
		System.out.println("Please select one of the following:");
		System.out.println("1: Initialize a default array");
		System.out.println("2: To specify the max size of the array");
		System.out.println("3: Add value to the array");
		System.out.println("4: Display values in the array");
		System.out.println("5: Display the average of the values");
		System.out.println("6: To Exit");
		System.out.print(">");
	}

}
