package employee;
import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {

		double hours = 0;
		double pay = 0;
		double employeeBasePay=0;
		double totalEmployeeBasePay=0;
		double overTimePay = 0;
		double totalOverTimePay = 0;
		double grossPay;
		double totalOvertime = 0;
		double taxdeducted = 0;
		double totalTaxDeducted = 0;
		double netPay = 0;
		double totalNetPay;
		int employeeNumber=0 ;
		double overTime = 0;
		double totalOverTime=0;
		double totalPayRoll = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("******COMPANY PAYROLL CALCULATOR******");


		int sentinel = 0;
		do {
			overTime=0;
			employeeNumber++;
			System.out.print("\nENTER HOUR WORK FOR EMPLOYEE "+employeeNumber+" :");
			hours = input.nextDouble();
			System.out.print("ENTER RATE OF PAY FOR EMPLOYEE "+employeeNumber+" :");
			pay = input.nextDouble();

			if(hours >= 37.5) {
				System.out.print("\nEMPLOYEE "+employeeNumber+" PAY INFORMATION : ");
				employeeBasePay = (37.5 * pay);
				System.out.println("\nbasic pay: $"+employeeBasePay);
				overTime = (hours-37.5);
				overTimePay = overTime*1.5*pay;
				System.out.println("Overtime Pay: $"+overTimePay);
				grossPay = (employeeBasePay+overTimePay);
				System.out.println("Gross Pay: $"+grossPay);

				if (grossPay <= 1000) {
					taxdeducted =0;
					netPay = grossPay;
					System.out.println ("Tax deducted: $"+taxdeducted);
					System.out.println ("Net pay: $"+netPay);
				} else if (grossPay >= 1000 && grossPay <= 2000) {
					taxdeducted = (grossPay * 20 )/100;
					netPay = grossPay - taxdeducted;
					System.out.println ("Tax deducted: $"+taxdeducted);
					System.out.println ("Net pay: $"+netPay);
				} else if (grossPay >= 2000) {
					taxdeducted = (grossPay * 30 )/100;
					netPay = grossPay - taxdeducted;
					System.out.println ("Tax deducted: $"+taxdeducted);
					System.out.println ("Net pay: $"+netPay);
				}

			} else {

				System.out.print("\nEMPLOYEE "+employeeNumber+" PAY INFORMATION : ");
				employeeBasePay = (hours * pay);
				System.out.println("\nbasic pay: $"+employeeBasePay);
				overTimePay = 0;
				System.out.println("Overtime Pay: $"+overTimePay);
				grossPay = (employeeBasePay+overTimePay);
				System.out.println("Gross Pay: $"+grossPay);



				if (grossPay <= 1000) {
					taxdeducted =0;
					netPay = grossPay;
					System.out.println ("Tax deducted: $"+taxdeducted);
					System.out.println ("Net pay: $"+netPay);
				} else if (grossPay >= 1000 && grossPay <= 2000) {
					taxdeducted = (grossPay * 20 )/100;
					netPay = grossPay - taxdeducted;
					System.out.println ("Tax deducted: $"+taxdeducted);
					System.out.println ("Net pay: $"+netPay);
				} else if (grossPay >= 2000) {
					taxdeducted = (grossPay * 30 )/100;
					netPay = grossPay - taxdeducted;
					System.out.println ("Tax deducted: $"+taxdeducted);
					System.out.println ("Net pay: $"+netPay);
				}


			}





			System.out.println("\nDO YOU HAVE MORE EMPLOYEE WAGES TO CALCULATE?");
			System.out.print("TYPE -1 TO QUIT OR ANY OTHER KEY TO CONTINUE:");
			sentinel= input.nextInt();


			totalOvertime += overTime;
			totalOverTimePay += overTimePay;
			totalTaxDeducted += taxdeducted;
			totalPayRoll += netPay;

		}
		while(sentinel!= -1);


		System.out.println("TOTAL EMPLOYEES: "+ employeeNumber);
		System.out.println("TOTAL OVERTIME WORK: "+ totalOvertime);
		System.out.println("TOTAL OVERTIME PAID: "+totalOverTimePay);
		System.out.println("TOTAL TAX DEDUCTED: "+totalTaxDeducted);
		System.out.println("TOTAL PAY ROLL: $"+totalPayRoll);


	}



}

