package bmiCal;
/*@ Ajithyugan Jeyakumar
 * SID: 040997743
 * 20S_CST8110_303
 * Final Lab Test 2
 * Friday, August 7, 2020
 * 9.00AM TO 11.00AM
 */

public class FinalLabTest {

	public static void main(String[] args) {
		System.out.println("BODY MASS INDEX CALCULATOR(BMI)");
		System.out.println();
		BMI l1 = new BMI();
		l1.getInfo();	
		BMI l2 = new BMI(320, 6,3);
		BMI l3 = new BMI();
		

		l1.displayInfo();
		l2.displayInfo();
		l3.displayInfo();
	}

}
