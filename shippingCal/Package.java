package shippingCal;
import java.util.Scanner;

public class Package {

	private double length;
	private double width;
	private	double height;

	Scanner input = new Scanner(System.in);

	public Package() {
		length = 1.0;
		width = 1.0;
		height = 1.0;


	}

	public Package(double a, double b, double c ) {
		length = a;
		width = b;
		height = c;

	}

	public Package(Package Pag) {
		length = Pag.length;
		width =Pag.width;
		height = Pag.height;
		
		
		

	}

	public void inputLength() {
		System.out.print("Enter length: ");
		length = input.nextDouble();
		
	}
	public void inputWidth() {
		System.out.print("Enter width: ");
		width = input.nextDouble();
		
	}
	public void inputHeight() {
		System.out.print("Enter height: ");
		height = input.nextDouble();
		
	}
	
	public void displayDimensions() {
	
		System.out.println("The fist package dimansions :"+length+" X "+width+" X "+height+ ", Volume = "+calcVolume());
		//System.out.println("Second package dimansions :"+length+" X "+width+" X "+height+ ", Volume = "+calcVolume());
		
		
	}

	public double calcVolume() {
		return (length * width * height);
		
		
	}


	
}
