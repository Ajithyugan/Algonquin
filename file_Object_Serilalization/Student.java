package file_Object_Serilalization;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6178818918820433991L;
	private int sNumber;
	private String fName;
	private String lName;
	private double gpa;

	private static Formatter output;
	private static Scanner input;

	private static ObjectOutputStream outputobj;
	private static ObjectInputStream inputobj;

	Student(){}

	public static void readObject() {
		try {
			inputobj = new ObjectInputStream(Files.newInputStream(Paths.get("C:\\Users\\Ajithyugan\\eclipse-workspace\\File_Object_Serilalization\\src\\Students.ser")));
		} catch(IOException e) {
			System.err.flush();
			System.err.println(e);
			System.err.flush();
		}
		try {
			while(true) {
				Student s =(Student) inputobj.readObject();
				System.out.println(s.sNumber+" "+s.fName+" "+s.lName+" "+s.gpa);
			}
		} catch (ClassCastException | ClassNotFoundException e) {
			System.out.println(e);
		} catch (EOFException ee) {
			System.err.flush();
			System.err.println("End of file.... reading Done");
			System.err.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writeObjects(Student [] students) {
		try {
			outputobj = new ObjectOutputStream(Files.newOutputStream(Paths.get("C:\\Users\\Ajithyugan\\eclipse-workspace\\File_Object_Serilalization\\src\\Students.ser")));
			//outputobj = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Ajithyugan\\eclipse-workspace\\File_Object_Serilalization\\src\\Students.ser"));
		}catch(IOException e) {
				System.err.println(e);
			}
		
		try {
			for(int i =0; i<students.length; i++)
				outputobj.writeObject(students[i]);
		}catch(IOException e) {
			System.err.flush();
			System.err.println(e);
			System.err.flush();
		}
	}



	public static void openFile() {
		try {
			output = new Formatter("C:\\Users\\Ajithyugan\\eclipse-workspace\\File_Object_Serilalization\\src\\Students.txt");
		} catch (SecurityException se) {
			System.err.flush();
			System.err.println("write prission defined... termenating ");
			System.err.flush();
			System.exit(1);
		}catch(IOException fe ) {
			System.err.flush();
			System.err.println(fe);
			System.err.flush();
			System.err.println("Error opening FIle");
			System.err.flush();
			System.exit(1);
		}
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
	public void writeInfoToFile() {
		output.format("%d %s %s %.2f\n", sNumber, fName, lName,gpa);
	}
	public static void closeFile() {
		if(output != null)
			output.close();
	}
}
