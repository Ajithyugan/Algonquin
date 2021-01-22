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
public interface Computer {
// inilizing public static final String variable
public final String userName = "Ajithyugan";
//abstract methods used by classes that implement the interface but we dont need to put the abstract keyword.
	public double amount();
	public void processDetails();
}
