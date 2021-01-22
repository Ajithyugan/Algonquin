package lab_04_abstractClass;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("How many employees do you have? ");
		int num = input.nextInt();

		Payroll payroll = new Payroll(num);
		payroll.readEmployee();
		System.out.println("\n\nSummary of Payroll  Processing");
		System.out.println("==================================");
		payroll.processPayroll();

	}

}
