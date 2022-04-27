package codeGuessGame;

public class Assign3 {

	public static void main(String[] args) {
		int gameMaxTry=6;
		int gameTry=1;
		// TODO Auto-generated method stub
		System.out.println("****Welcome to the Code Guessing game****");
		System.out.println();
		System.out.println("You have 6 tries to find the secret 3 letter code");
		System.out.println("The letters range from A to C");
		System.out.println();
		System.out.println();
		System.out.println("The code can have repeat letters");
		System.out.println();
		System.out.println();
		CodeGuessGame cgg = new CodeGuessGame();
		while (!cgg.done() && gameTry<=gameMaxTry) {
			cgg.getGuess(gameTry);
			gameTry++;
			cgg.checkGuess();
		}
		if(cgg.done()== true) 
			System.out.println("YOU WIN!");
			else
			System.out.println("You lose");
		
		System.out.println("The correct code was "+cgg.display());
		
	}

}
