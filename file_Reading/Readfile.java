package file_Reading;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Readfile {
	private static Scanner input;

	public static void openfile() {
		try {
			input = new Scanner(Paths.get("C:\\Users\\Ajithyugan\\eclipse-workspace\\File_read\\read.txt"));
			/* location C:\Users\Ajithyugan\eclipse-workspace\File_read\read.txt */
		}catch(NoSuchFileException ne){
			ne.getMessage();
			System.err.flush();
			System.err.println("File not found");
			System.err.flush();

		}catch(IOException ioe) {
			System.out.println(ioe);
		}
	}
	
	
	public static void readfromfile() {
		try {
			while(input.hasNext()) {
				System.out.println(input.next()+" "+input.nextInt()+ " "+input.next()+" "+input.next()+" "+input.next()+" "+input.nextLong()+" "+input.nextDouble());
			}
		}catch(NoSuchElementException ex) {
			System.out.println(ex.getMessage());
		}catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void closeFile() {
		if(input != null)
			input.close();
	}
	public static void main(String[] args) {
		
		String path = Paths.get("").toAbsolutePath().toString();
		System.out.println(path);
		
		openfile();
		if(input != null)
		readfromfile();
		closeFile();
		System.out.println("Game Over");
	}
}
