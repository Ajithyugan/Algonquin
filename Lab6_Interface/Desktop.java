package Lab6_Interface;
/**
 * 
 * @author Ajithyugan Jeyakumar :)
 * Student_number : 040997743
 * Lab 6: Interface 
 * program name: CST8132 Object-Oriented Programming
 * Lab_Professor name : Abul Qasim
 * 
 * */
public class Desktop implements Computer{
	//These are the attributes of the Desktop class
	private String os;
	private String companyName;
	private double taxRate = 0.13;
	private double price;
	private String headPhoneCompany;
	
	//parameterized constructor
Desktop (String company, double price, String os, String headPhoneCompany) {
	this.companyName = company;
	this.price = price;
	this.os = os;
	this.headPhoneCompany = headPhoneCompany;
	
}  
//
@Override
public double amount() {
	return price * (1 + taxRate);
}

@Override
public void processDetails() {
	 System.out.println(userName + " has one "+companyName + " "+ this.getClass().getSimpleName() + " with " + os + " OS, uses " + headPhoneCompany + " headphone. Price: " + this.amount());		
}

}
