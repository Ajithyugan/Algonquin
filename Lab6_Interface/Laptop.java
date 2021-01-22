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
public class Laptop implements Computer{
	//attributes of the Laptop class
	private String color;
	private String os;
	private String companyName;
	private double price;
	private double offerRate = 0.15;
//	private double offerRate = 0.20;
	
	//parameterized constructor for the Laptop class
	public Laptop(String companyName, double price, String os, String color) {
		this.companyName = companyName;
		this.color = color;
		this.os = os;
		this.price = price;
	}
	//method overriding for implementation of each object of Laptop in the computers array
	@Override
	public double amount() {
		return price * (1-offerRate);
	}

	@Override
	public void processDetails() {
		System.out.println(userName + " has one "+ color + " colored " + companyName + " " +this.getClass().getSimpleName() + " with " + os + ". Price: " + this.amount());
	}	

}
