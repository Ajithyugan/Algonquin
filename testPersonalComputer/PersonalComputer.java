package testPersonalComputer;

public class PersonalComputer {

	private boolean accessStatus = false;

	public void getAccess(int passKey) {
		int key = 4321;
		if(passKey == key) {
			accessStatus = true;
		}else {
			accessStatus = false;
		}
	}//end of method


	public void add(double a, double b) //parameter list
	{
		if(accessStatus) {
			double sum = a + b;
			System.out.println(a+" + "+b+" = "+sum);
		}else {
			System.out.println("Access denied!");
		}
	}//end of method

	public int maxValue(int x, int y) {
		int max = Integer.MIN_VALUE;
		if(accessStatus) {
			if(x>y)
				max = x;
			else
				max = y;
		}else {
			System.out.println("Access denied!");
		}

		return max;
	}//end of method




}//end of class
