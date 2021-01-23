package W2020_lab_01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Jeyakumar Ajithyugan
 * Student Number:  040997743
 * Course: CST8130 - Data Structures
 * CET-CS-Level 3
 * @author/Professor James Mwangi PhD. 
 * @author Linda Crane
 * @author Melissa Sienkiewicz
 */
public class Numbers {
	/**
	 * Stores Float values.
	 */
	private Float [] numbers;

	/**
	 * Store the number of items currently in the array.
	 */
	private int numItems;

	/**
	 * Store the sizee of the array.
	 */
	private int sizeOfArray;
	boolean continueloop = true;
	/**
	 * Default Constructor
	 */
	public Numbers() {
		// TODO Write code here to initialize a "default" array since this is the default constructor
		// the default size of array is 10
		this.sizeOfArray = 10;
		this.numbers = new Float[sizeOfArray];
	}

	/**
	 * Constructor that initializes the numbers array.
	 * @param size - Max size of the numbers array
	 */
	public Numbers(int size) {
		// TODO Write code here to initialize the numbers array of max 'size'
		this.sizeOfArray=size; 
		numbers = new Float[sizeOfArray];
	}

	/**
	 * Adds a value in the array
	 * @param keyboard - Scanner object to use for input
	 */
	public void addValue(Scanner keyboard) {
		// TODO Write code here to add the values in the array

		do {
			try {
				if(numItems == sizeOfArray) {
					System.out.println("Array is Full ");

				}
				else if (numItems < sizeOfArray) {			
					System.out.print("Enter value: ");
					numbers[numItems] = keyboard.nextFloat();
					numItems++;


				}
			} 
			catch (InputMismatchException ime ) {
				System.err.flush();
				System.err.println("\nPlease use Float or Integer values\n"); 
				System.err.flush();
			} 
			catch (Exception e ) {
				System.err.flush();
				System.err.println(e.getMessage()); 
				System.err.flush();
			} 
		} while (continueloop != true);
	}

	/**
	 * Calculates the average of all the values in the numbers array.
	 * @return float value that represents the average
	 */
	public float calcAverage() {
		// TODO Write code to return the average of the values in the array
		float calAv = 0;
		do {
			try {
				if(numItems>0) {
					for( numItems =0; numItems<numbers.length; numItems++)  
					{     
						if (numbers[numItems] != null);
						calAv = calAv + numbers[numItems];  
					}  
				}else if (calAv == 0) {
					return (float) 0.0;
				}
			}catch (Exception e) {
				System.err.flush();
				System.out.print("");
				System.err.flush();
			}
		} while (continueloop != true);
		return (float)calAv/ numItems;

	}

	@Override
	public String toString() {
		// TODO Write code for an appropriate toString method
		String temp="";
		do {
			try {
				if(numItems>0)
					for (numItems = 0; numItems < numbers.length;numItems++) {
						if (numbers[numItems] != null);
						temp = temp+(numbers[numItems]).toString()+"\n";
					}
			} catch (Exception e) {
				System.err.flush();
				System.out.print("");
				//				System.err.println("\nYou can add "+((numbers.length)-(numItems))+ " more values in the array\n");
				System.err.flush();

			}
		} while (continueloop != true);
		return temp;
	}
}
