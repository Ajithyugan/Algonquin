package number;
public class Numbers {
	
	/* a One-dimensional integer array named numbers */
	private int numbers[];
	
	/* a two-dimensional integer array named squares */
	private int squares[][];

	/* no argument constructor */
	Numbers(){
    
	}

	/*
	 * constructor that receives one integer value named size and creates numbers
	 * array with that size
	 */
	Numbers(int size){
		numbers = new int [size];
	}

	/*
	 * a constructor that receives two integers named row and col, and creates the
	 * twodimensional array with sizes row and col
	 */
	Numbers(int row, int col){
		squares = new int [row][col];
	}

	/*
	 * accepts nothing, returns nothing. Uses a for loop to fill the array with
	 * numbers starting from 0 till size-1. If size is 10, array should be filled in
	 * with 0, 1, …, 9.
	 */
public void generateNumbers() {
		for(int i = 0 ; i < numbers.length; i++) 
			numbers[i]=i;

} 

/*
 * accepts nothing, returns nothing. Uses a for loop to print elements in the
 * array (See output).
 */
public void printNumbers(){
		for(int i = 0 ; i < numbers.length; i++) 
			System.out.print(numbers [i] +" ");

}

/*
 * accepts nothing, returns nothing. This method has a nested for loop and
 * prints the indices of each position. You should use the length property of
 * arrays in loops. (See output)
 */
public void printIndices() {
	for(int i = 0 ; i < squares.length; i++) {
		
		for(int j = 0; j<squares[i].length; j++)
			System.out.print(j+","+i+"\t");
		System.out.println();
	}
	
}
/*
	 * accepts nothing, returns nothing. Use nested loops and generates squares of
	 * numbers, and store them as rows and columns. You should use the length
	 * property of arrays in loops
	 */
public void generateSquares() {
	for(int i = 0 ; i < squares.length; i++)
		for (int j=1; j<squares[i].length; j++) {
			String combineNumberString  = Integer.toString(j)+Integer.toString(i);
			int combinedNumber = Integer.parseInt(combineNumberString);
				squares[i][j]=(int) Math.pow(combinedNumber, 2);
		}
}

/*
 * accepts nothing, returns nothing. Use nested loop to print elements of
 * squares in a pattern. You need to use formatted output like printf (See
 * output). You should use the length property of arrays in loops
 */
public void printSquares() {
	for(int i = 1 ; i < squares.length; i++) {
		for(int j = 0; j<i; j++) {
			System.out.printf("%4d",squares[j][i]);
			System.out.print("\t");
		}
		System.out.println();
	}
	
}

/*
 * accepts nothing, returns nothing. Use nested loop to print stars in a
 * pattern. You need to use formatted output like printf (See output). You
 * should use the length property of arrays in loops
 */
public void printStarsPattern1() {
	for(int i = 0 ; i < squares.length; i++) {
		for(int j = 0; j<i; j++)
			System.out.printf("%4s","*");
		System.out.println();
}
}
public void printStarsPattern2() {
	
for(int i = 0 ; i < squares.length; i++) {
		
		for(int j = i; j<squares[i].length; j++)
			System.out.printf("%4s","*");
		System.out.println();
}
}
}
