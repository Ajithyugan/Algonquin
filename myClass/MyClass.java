package myClass;
import java.util.Scanner;

public class MyClass {
	 Scanner input = new Scanner(System.in);

	public  void modOperator() {
		System.out.print("Enter the Number ");
		int a= input.nextInt();
		int b= a % 5 ;

		System.out.println(+a+" mod 5 is "+b);
		System.out.println("");
	}
	public  void alculateAverage() {
		System.out.print("Enter the fist Number ");
		int c = input.nextInt();

		System.out.print("Enter the second Number ");
		int d = input.nextInt();

		System.out.print("Enter the third Number ");
		int e = input.nextInt();

		int avarage = (c + d + e) / 3;

		System.out.println("The average of "+c+" , "+d+" and "+e+ " is " +avarage);
		System.out.println("");

	}
	public  void maxValue() {
		System.out.print("Enter the first number ");
		int f = input.nextInt();

		System.out.print("Enter the second number ");
		int g = input.nextInt();

		int bigger = max(f,g);

		System.out.println("The biggest number is "+bigger);
		System.out.println("");
	}

	public  int max(int h, int i) {
		if(h>i) 
			return h;
		else
			return i;
	}

	public  void calculateAnnualSalary() {
		System.out.print("\nEnter your weekly salary ");
		double salary = input.nextDouble();

		double annualSalary = salary*52;

		System.out.println("Your annual salary is $"+annualSalary);

		double bonous = (annualSalary * 15.0/100.0);
		double newAnnualSalary = bonous+annualSalary;
		System.out.println("With a 15% raise, your new annual salary is "+newAnnualSalary);
		System.out.println("");

	}
	public  void numberOfDragons() {

		
		System.out.print("Enter the initial number of dragons: ");
		int initialDragons = input.nextInt();

		System.out.println("The initial number of dragons is "+initialDragons);
		int newDragons = initialDragons + (initialDragons * 4 )/2;
		System.out.println("After 5 years the number of dragons is "+newDragons);
		newDragons = newDragons + (newDragons * 4 )/2;
		System.out.println("After 10 years the number of dragons is "+newDragons );
		newDragons = newDragons + (newDragons * 4 )/2;
		System.out.println("After 15 years the number of dragons is "+newDragons);



	}


}

