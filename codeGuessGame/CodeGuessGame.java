package codeGuessGame;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Name       : Ajithyugan
 * Student_ID : 040997743
 * 
 * 
 * 
 * */
public class CodeGuessGame {
 
	private String code;
	private String guess;
	private boolean done;
	private Random random = new Random();
	private Scanner scan = new Scanner(System.in);

	/*
	 * 
	 * 
	 * */
//	The no argument constructor does not take any input parameters.
//	Three individual, locally declared characters are created using the Random object.
//  The three letters are concatenated and stored in the String variable code, which will make
//	processing easier by using String class library methods.
	public CodeGuessGame() {
		char firstChar  = (char) (random.nextInt(3) + 65);
		char secondChar = (char) (random.nextInt(3) + 65);
		char thirdChar = (char) (random.nextInt(3) + 65);
		code= Character.toString(firstChar)+Character.toString(secondChar)+Character.toString(thirdChar);
		//System.out.println(code);
	}

//	This public method is invoked from the main method.
//  It receives one integer input parameter (the counter variable from
//	the definite repeating structure in main). Prompt the user for a code guess.
//  Implement data verification for the correct length guess
//	(three characters), and for valid letters (the range A to C).
//  Invoke the isValid() method when verifying the validity of letters. If the
// user enters the word “quit” for a code guess, terminate the game immediately.
	
	public void getGuess(int getGuess) {
		boolean success=false;
		while(!success) {
			System.out.print("Enter guess #"+getGuess+":");
			guess=scan.nextLine();
			if(guess.equals("quit"))
				return;
			if (guess.isEmpty() || guess.length()<3)
				System.out.println("Guess is too short");
			else if (guess.length()>3)
				System.out.println("Guess is too long");
			else if (!isValid((char) (guess.charAt(0)-32)))
				System.out.println((char) (guess.charAt(0)-32)+ " is not a valid first letter");
			else if (!isValid((char) (guess.charAt(1)-32)))
				System.out.println((char) (guess.charAt(1)-32)+ " is not a valid second letter");
			else if (!isValid((char) (guess.charAt(2)-32)))
				System.out.println((char) (guess.charAt(2)-32)+ " is not a valid third letter");
			else {
//				checkGuess();
				success= true;
			}
		}
	}

//	This void method is invoked in the main method.
//	It does not receive any input parameters. 
//	It has a locally declared integer variable that keeps count of the correct letter guesses 
//	of the three-character code.
//	If the correct letter count becomes equal to three, 
//	then the code has been correctly determined – set the done variable to true.
	public void checkGuess() {
		int count=0;
		for (int i=0; i< code.length(); i++) {
			if ((char)code.charAt(i)==(char)(guess.charAt(i)-32))
				count++;
		}
		if (count ==3)
			done = true;
		else
			done=false;
		System.out.println(count+ " correct letters in the correct space");
	}

//	This public method is invoked from the main method.
//	It does not receive any input parameters and it returns a String.
//	This method returns the field code.
	public String display() {
		return code;



	}

//	This private method is invoked only by the getGuess() method in the CodeGuessGame class.
//	It receives a single character as
//	an input parameter, and returns a boolean.
//	This method will use a selection structure to verify valid character input from the user.
	private boolean isValid(char c) {
		if(65<=c && c<=67)
			return true;
		return false;
		
//		return (65<=c && c<=67) ? true:false;
	}

//	This public method is invoked from the main method.
//	It does not receive any input parameters and it returns a boolean. This method returns the field done.
//	Other methods in the class can detect the end of a game and change the value of done
	public boolean done() {
		return done;




	}


}
