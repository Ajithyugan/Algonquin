package file_writing;
import java.util.Scanner;

public class File_write_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of Student ");
		int size = input.nextInt();
		Student [] students = new Student [size];
		
		Student.openFile();
		
		for(int i =0; i< students.length; i++) {
			students[i] = new Student();
			students[i].readInfoToFile();
			students[i].writeInfoToFile();
		}
		
		Student.closeFile();
		input.close();
	}

}
