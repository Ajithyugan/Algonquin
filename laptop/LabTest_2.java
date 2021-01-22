package laptop;

public class LabTest_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO A1 COMPUTER SALES");
		System.out.println();
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop("Intel Core i7", 500, 12);
		Laptop l3 = new Laptop();
		l3.enterSpecifications();
		System.out.println("COMPUTER MODEL" +"\t"+"RAM [GB]"+"\t"+"HARD DRIVE [GB]" +"BASE PRICE");
		l1.displaySpecifications();
		l2.displaySpecifications();
		l3.displaySpecifications();
		
	}

}
