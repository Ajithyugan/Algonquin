package file_writing;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class Student {
	private int sNumber;
	private String fName;
	private String lName;
	private double gpa;

	private static Formatter output;
	private static Scanner input;


	Student(){}

	public static void openFile() {
		try {
			output = new Formatter("C:\\Users\\Ajithyugan\\eclipse-workspace\\File_write\\src\\Student.txt");
		} catch (SecurityException se) {
			System.err.println("write prission defined... termenating ");
			//System.exit(1);
		}catch(IOException fe ) {
			//System.out.println(fe);
			System.out.println("Error opening FIle");
			//System.exit(1);
		}
	}

	public void writeInfoToFile() {
		output.format("%d %s %s %.2f\n", sNumber, fName, lName,gpa);
	}
	public static void closeFile() {
		if(output != null)
			output.close();
	}
	public void readInfoToFile() {
		input = new Scanner(System.in);
		System.out.print("Enter Employee Number: ");
		sNumber = input.nextInt();
		System.out.print("Enter fist name:  ");
		fName = input.next();
		System.out.print("Enter last name: ");
		lName = input.next();
		System.out.print("Enter GPA : ");
		gpa = input.nextDouble();
	}
}
