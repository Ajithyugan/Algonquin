package assignment_01;
import java.util.Scanner;
/**
 * Assignment 1
 * @author Ajithyugan Jeyakumar(040997743)
 * Student Number 
 * Course Code 20S_CST8110_300
 * Date  2020-06-05
 * */

public class Assignment_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This program will print next 3 odd or even numbers after the entered number. ");
		Scanner input = new Scanner(System.in);// creating a scanner object to get the input from the user
		System.out.print("Enter the number: ");
		int number = input.nextInt(); // to read and assign user input



		if(number%2 == 0)	{
			System.out.println("\nNext 3 Even numbers after " + number + " are " );
		}// use modulus 2 and if remind equal 0 then it is an even number

		else  {
			System.out.println("\nNext 3 odd numbers after " + number + " are " );
		}
		
		System.out.println(number = number+2);// number will equal to  number +2 each step and will display that
		System.out.println(number = number+2);
		System.out.println(number = number+2);
	}
}


