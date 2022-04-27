package lab_04_abstractClass;

import java.util.Scanner;

public class Regular extends Employee {
    
	private double hourlyRate = 30;
	protected double deductionRate;
	private double salary;
	Scanner input = new Scanner(System.in);

	Regular(){}

	public Regular(String firstName,String lastName,String email,double hourlyRate,double hoursPerWeek) {
		super(firstName, lastName, email, /* hourlyRate, */hoursPerWeek);
		this.deductionRate= 17;
	}
	
	public double payrollCalculation() {
		System.out.println("Hours worked: ");
		hoursPerWeek=input.nextDouble();

		return salary =hoursPerWeek*hourlyRate*(1-deductionRate);

	}
	public void methodOfPayment() {
		System.out.println("Direct depositing " + salary + " to " + getName() + "'s bank account");

	}

	

}