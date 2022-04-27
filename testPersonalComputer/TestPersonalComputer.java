package testPersonalComputer;

public class TestPersonalComputer {

	public static void main(String[] args) {
	
		PersonalComputer user1 = new PersonalComputer();
		
		//calling a void type method
		user1.getAccess(4321);//one argument value is passed to the getAccess method
		user1.add(20, 30.5);//2 argument values are passed to the add method
		
		//calling a non-void type method
		//
		int result = user1.maxValue(100, 40);
		System.out.println("The max value ="+result);
//		int a = 10;
//		int b = 40;
		System.out.println("The max value ="+user1.maxValue(10, 60));
		
		PersonalComputer user2 = new PersonalComputer();
		user2.getAccess(23243434);
		user2.add(30, 50);//calling a void type method
		//System.out.println(user2.add(30, 50));//you can not call a void method inside println()
		System.out.println(user2.maxValue(55, 25));//calling a non-void method....
		
	}//end of main

}//end of class
