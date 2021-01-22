package lab_04_abstractClass;
import java.util.Scanner;
public class Payroll {

	Employee[] employees;

	Scanner input = new Scanner(System.in);

	public Payroll(int num) {

		employees = new Employee[num];

		Employee[] employee = new Employee[num];
	}

	public void readEmployee() {




		int number = 0;
		number++;
		for(int i =0; i<employees.length;i++) {
			System.out.println("ENter details of employee "+(number));
			System.out.println("=================================");
			System.out.print("Enter fist name:  ");
			String firstName = input.next();
			System.out.print("Enter last name: ");
			String lastName = input.next();
			System.out.print("Enter email Id: "); 
			String email = input.next();
			System.out.print("Enter Hours worked: "); 
			double hoursPerWeek = input.nextDouble();

			System.out.println("1.Regular \n2.Contractor");
			System.out.print("Enter type of employee: ");
		
		}
		for(int i =0; i<employees.length;i++) {
			int type = input.nextInt(); 
			if (type == 1) employees[i]= new Regular(); 

			if (type == 2) employees[i]= new Contractor(); 
			
			employees[i].readEmployee();
			employees[i].methodOfPayment();
	}
	}
	public void processPayroll() {
		for(int i =0; i<employees.length;i++) {
			employees[i].payrollCalculation();
		
		}

		
	}

}
/*
 * for(int i =0; i<employees.length;i++ ) {
 * System.out.println("Enter details of employee : "+(i+1));
 * System.out.println("1.Regular \n2.Contractor");
 * System.out.print("Enter type of employee: "); int type = input.nextInt(); if
 * (type == 1) employees[i]= new Regular(); if (type == 2) employees[i]= new
 * Contractor(); }
 * 
 * for(int i =0; i<employees.length;i++ ) {
 * System.out.println("Enter details of employee : "+(i+1));
 * 
 * 
 * System.out.print("Enter fist name:  ");String firstName = input.next();
 * System.out.print("Enter last name: ");String lastName = input.next();
 * System.out.print("Enter email Id: "); String email = input.next();
 * employees[i].readEmployee();
 * 
 * 
 * }
 * 
 * 
 * 
 * } ---------------------------------------------------------------- 
 * 
 * for (int i= 0; i < employees.length; i++) { /*
 * System.out.println("Enter details of employee : "+(i+1));
 * System.out.println("1.Regular \n2.Contractor");
 * System.out.print("Enter type of employee: "); int type = input.nextInt(); if
 * (type == 1) employees[i]= new Regular(); if (type == 2) employees[i]= new
 * Contractor();
 * 
 * 
 * employees[i].payrollCalculation(); employees[i].methodOfPayment(); }
 * 
 * }
 */