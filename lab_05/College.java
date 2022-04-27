package lab_05;

import java.util.Scanner; 
 

public class College {
	String name;
	Student[] students;

	Scanner input = new Scanner(System.in);
	/*
	 * parameterized constructor that creates the array of students with the given
	 * size (this size will be read in main(), and will be sent here when creating
	 * the College object)
	 */
	public College() {}
	public College(String name,int num) {
		this.name=name;
		students = new Student[num];

	}

	/*
	 * accepts nothing, returns nothing. 	/* Print the title and the header row 
	 * */
	
	public void printTitle(String name) {
		System.out.println("");
		System.out.println(name+" - List of Students");
		System.out.println("*************************************");
		System.out.printf("Program|     Student#|             Name|            Email|         Phone| GPA|     Fees | Credits|%n ");

	}
	 

		/*
		 * accepts nothing, returns nothing. In a for loop, read details of all
		 * students. First, read the type of the student. Based on the type of the
		 * student, corresponding array object needs to be created (Polymorphism).
		 * Then, call readInfo() method.
		 */
	public void readStudentsDetails() {

		for(int i =0; i<students.length;i++ ) {
			System.out.println("Enter details of student: "+(i+1));
			System.out.println("================================");
			System.out.println("1 - Fulltime student \n2 - Parttime Student"); 
			/*System.out.print("Enter type of employee: ");
			int type = input.nextInt();*/


			boolean num = false;
			while(!num)	{
				System.out.println("Enter type of student: ");
				int type = input.nextInt();
				if(type ==1 || type ==2) {
					num = true;	
					if (type == 1)
						students[i]= new FulltimeStudent();
					if (type == 2)
						students[i]= new ParttimeStudent();

					students[i].readInfo();
				}
				else {
					System.out.println("\nWrong student type ");

				}


			}


		}
	}
	/*
	 * accepts nothing, returns nothing. In a for loop, call printInfo() to
	 * print details of all employees.
	 */
	public void printStudentDetails() {
		for(int i =0; i<students.length;i++ ) {
			students[i].printInfo();
		}
	}
}
