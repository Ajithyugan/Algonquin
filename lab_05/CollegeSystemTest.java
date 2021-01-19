package lab_05;

import java.util.Scanner;

/*THE DRIVER CLASS*/
public class CollegeSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter name of College: ");
		String name = input.nextLine();
		System.out.print("Enter number of students: ");
		int num = input.nextInt();

		/* Creating object of the College Class */
		College quin = new College(name,num);
		
		quin.readStudentsDetails();
		quin.printTitle(name);
		quin.printStudentDetails();
		/* closing the user input */
		input.close();
	}

}
