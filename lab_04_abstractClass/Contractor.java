package lab_04_abstractClass;

import java.util.Scanner;

public class Contractor extends Employee {

	private double hourlyRate = 45;
	private double taxRate;
	private double salary;
	Scanner input = new Scanner(System.in);

	Contractor(){}

	public Contractor(String firstName,String lastName,String email,double hourlyRate,double hoursPerWeek) {
		super(firstName, lastName, email, /*hourlyRate,*/hoursPerWeek);
		this.taxRate= 15;
	}


	public double payrollCalculation() {
		System.out.println("Hours worked: ");
		hoursPerWeek=input.nextDouble();

		 return salary =hoursPerWeek*hourlyRate*(1+taxRate);
	}
	
	
	public void methodOfPayment() { 
		  System.out.println("Mailed a cheque to " +  getName() + " for " + salary);
	  
	  }

	
	 

}
