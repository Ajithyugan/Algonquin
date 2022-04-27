package aJI;

/*Author @Ajithyugan Jeyakumar
 *Student ID: 040997743 
 * 20S_CST_8110_300
 * Assignment_4
 *  
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Assign4 {

	public static void main(String[] args) {

		int currentNumberOfPatients=0;
		final int maxNumberPatientss=4;
		
		Scanner input = new Scanner(System.in);
		Patient[] patient = new Patient[maxNumberPatientss];


		System.out.print("MEDICAL CLINIC PATIENT TRACKER SYSTEM\n");
		int sentinal = 1;

		do {
			System.out.println("\n*****************");
			System.out.println("1. ADD PATIENT");
			System.out.println("2. LIST PATIENTS ");
			System.out.println("3. SEARCH FOR PATIENT WITH HEALTH CARD NUMBER");
			System.out.println("4. SEARCH FOR PETIENT WITH NAME");
			System.out.println("5. EXIT");
			System.out.println("*****************\n");

			System.out.print("CHOICE: ");
			int choice = input.nextInt();

			switch(choice){ 

			case 1:    
				if(currentNumberOfPatients <maxNumberPatientss) {
					System.out.print("ENTER PATIENT NAME: ");
					String name = input.next();
					input.nextLine();
					System.out.print("ENTER PATIENT HEALTH CARD NUMBER: ");
					int healthCardNumber = input.nextInt();

					System.out.print("ENTER PATIENT DATE OF BIRTH: ");
					System.out.print("\nYEAR: ");
					int year = input.nextInt();
					System.out.print("MONTH: ");
					int month = input.nextInt();
					System.out.print("DAY: ");
					int day = input.nextInt();

					LocalDate dateOfBirth = LocalDate.of(year, month, day);
					Patient n = new Patient(name, healthCardNumber, dateOfBirth);
					patient[currentNumberOfPatients] = n;
					currentNumberOfPatients++;
				}else {
					System.out.println("NO MORE PATIENTS CAN BE ADDED");
				}break;




			case 2:    
				System.out.print("\nPATIENT LIST: \n");
				if(currentNumberOfPatients>0) {
					for (int i = 0; i < patient.length; i++) {
						if (patient[i] != null)
							System.out.println(patient[i].toString());
					}
				}
				else {
					System.out.println("THERE ARE NO PATIENTS.");
				}break;




			case 3:    
				boolean found= false;
				System.out.print("ENTER PATIENT HEALTH CARD NUMBER: ");
				int searchHealthCardNumber = input.nextInt();

				for(int i=0; i<patient.length;i++) {

					if(patient[i]!= null && searchHealthCardNumber==(patient[i].getHealthCardNumber())) { 
						System.out.println(patient[i].getName() +" IS IN THE SYSTEM ");
						found= true;
						break;
					}
				}
				if(!found)
					System.out.println(" NOT IN THE SYSTEM");   
				break;




			case 4:    
				System.out.print("ENTER PATIENT NAME TO SEARCH FOR: ");
				String searchName = input.next();
				boolean found1= false;
				for(int i=0; i<patient.length;i++) {
					if(patient[i]!= null && searchName.equals(patient[i].getName())) {
						found1 = true;
						i=patient.length;
					}
				}
				if(found1) {
					System.out.println(searchName+" IS IN THE SYSTEM");
				}else {
					System.out.println(searchName+" IS NOT IN THE SYSTEM");
				}
				break;
			case 5:    
				System.out.println("Good Bye!");
				sentinal=5;
				break;

			}
		} while (sentinal != 5);
	}
}


