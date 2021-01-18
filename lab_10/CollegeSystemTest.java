package lab_10;

import java.util.InputMismatchException;
import java.util.Scanner;
/** 
 * @author Ajithyugan Jeyakumar
 * Student_number : 040997743
 * Lab_05 update With ArrayList
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 */
public class CollegeSystemTest {
	private static int num;
	public static int type;

	/**
	 * @param args - main method of driver class
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean continueloop = true;
		System.out.print("Enter name of College: ");
		String name = input.nextLine();

		/**
		 * The try statement allows you to define a block of code to be tested for
		 * errors while it is being executed. The catch statement allows you to define a
		 * block of code to be executed, if an error occurs in the try block. The try
		 * and catch keywords come in pairs
		 */

		do {
			try {
				System.out.print("Enter number of students: ");
				int num = input.nextInt();
				if(num>0)
					continueloop = false;

			} catch(InputMismatchException ime){
				input.nextLine();
				System.err.flush();
				System.err.println("******Input Mismatch Exception while reading number of students******\n");
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
		/* Creating object of the College Class */
		College quin = new College(name,num);
		do{	
			do {
				try {

					System.out.println("1. Register Students \n2. Display Students \n3. Exit");
					System.out.print(" Enter your option: ");

					type = input.nextInt();
					if(type < 1 || type >3) {
						System.err.flush();
						System.err.println("Invalid option.... please try again...");
						System.err.flush();
					}		
				} catch(InputMismatchException ime){
					input.nextLine(); 
					System.err.flush();
					System.err.println("******Input Mismatch Exception while reading number of students******\n ");
					System.err.flush();
				}catch (Exception e) {
					System.err.flush();
					System.err.println("Unknown Exception " +e.getMessage());
					System.err.flush();
				} 
			} while (continueloop == true);

			if(type == 1) {
				System.out.println("1. Read from file \n2. Read from the user");

				int t1 = input.nextInt();
				if(t1 ==1) {
					quin.openfile(input);
				}else if (t1 == 2) {
					quin.readStudentsDetails();
				}
			} else if (type == 2) {

				if(quin.isArrayListEmpty()== true)
					System.err.println("No students to display........");

				else {
					quin.printTitle(name);
					quin.printStudentDetails();
				}
			}


		}while(type!= 3 );
		System.out.println("Goodbye... Have a nice day!");	
		input.close();
	}

}
