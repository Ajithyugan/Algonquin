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
public class Store {
	private int size;
	/* an array of Computer named computer */
	private Computer[] computer;

	Store() {
		
	}
	
	/*
	 * parameterized constructor that creates the array of computer with the given
	 * size
	 */
	Store(int size) {
		this.size = size;
		computer = new Computer[size];
		computer[0] = new Desktop("HP", 1199, "Windows8", "Beats"); 
		computer[1] = new Laptop("Asus", 1200, "Windows8", "Blue");
		computer[2] = new Desktop("Acer", 950, "Windows10", "Jabra");
		computer[3] = new Laptop("Apple", 1350, "MacOS", "Silver");
	}
	/*
	 * accepts nothing, returns nothing. In a for loop, call processDetails() to
	 * print details of all computer.
	 */
	void processDetails() {
		for (int i = 0; i < computer.length; i++) {
			computer[i].amount();
		}
	}
	/*
	 * accepts nothing, returns nothing. In a for loop, call createComputers() to
	 * print details of all computer.
	 */
	public void createComputers() {
		for (int i = 0; i < computer.length; i++) {
			computer[i].processDetails();
		}
	}


}
