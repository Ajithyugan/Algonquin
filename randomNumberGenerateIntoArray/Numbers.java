package randomNumberGenerateIntoArray;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Student Name: Jeyakumar Ajithyugan
 * Student Number:  040997743
 * Course: CST8130 - Data Structures
 * CET-CS-Level 3
 * Professor James Mwangi PhD
 */

public class Numbers {
	/**
	 * Stores Integer values.
	 */
	private Integer[] numbers;
	/**
	 * Store the size of the array.
	 */
	private int size;
	/**
	 * Store the number of items currently in the array.
	 */
	private int numItems;
	private int count = 0;
	/**
	 * Default Constructor
	 */

	public Numbers() {
		
	}
	/**
	 * Constructor that initializes the numbers array.
	 * @param size - Max size of the numbers array
	 */
	Numbers(int size) {
		this.size = size;
		numbers = new Integer[size];
	}
	/**
	 * generate Numbers in the array
	 */
	public void generateNum() {

		SecureRandom randomNum = new SecureRandom();
		for(int i =0 ; i<numbers.length; i++) 
			numbers[i]=1+ randomNum.nextInt(50);
		Arrays.sort(numbers);

	}
	/**
	 * findCount method 
	 * @param input - Scanner object to use for input
	 * @return count which is the number of occurrences of a number in the array
	 */
	public int findCount(Scanner input) {
		if (numbers.length == 0) {
			isArrayCreated();
		} else {
		
			System.out.println("Enter the number to be searched: ");
			int	number = input.nextInt();

			for (int numItems = 0; numItems < numbers.length; numItems++) {
				if (numbers[numItems] == number) {
					count++;
				}
			}
			System.out.println("Number "+number+" occurred "+count+" times in the array");
		}
		return count;
	
	}
	@Override
	/**
	 * toString method 
	 * @return temp String of the values in the array
	 */
	public String toString() {
		// TODO Write code for an appropriate toString method
		if (numbers.length == 0) 
			isEmpty();
		
		String temp="";
		for (numItems = 0; numItems < numbers.length;numItems++) 
			temp = temp+(numbers[numItems]).toString()+" ";

		return temp;
	
	} 
	/**
	 * isArrayCreated method 
	 * @return -1 if array is not created with a given size
	 */
	public int isArrayCreated() {
		if (size == 0) {
			System.err.println("Array is empty");
			return -1;
		}
		else {
			return 0;
		}
	}
	/**
	 * isEmpty method 
	 * @return -1 if the array is not created with an integer size greater than 0
	 */
	public int isEmpty() {
		if (size <= 0) {
			System.err.println("Array is empty");
			return -1;
		}
		else {
			return 0;
		}
	}
}
