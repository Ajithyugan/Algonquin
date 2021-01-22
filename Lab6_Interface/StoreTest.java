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


/*THE DRIVER CLASS*/
public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Creating object of the Store Class */
		Store store = new Store(4);
		store.createComputers();
		store.processDetails(); 
	}

}
