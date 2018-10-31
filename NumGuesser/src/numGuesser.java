import java.util.Scanner;
import java.util.Random;

/** This program is a Random Number Generator guessing game
 */

public class numGuesser{
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);	// Create Scanner object
		Random ran = new Random();					// Create Random object
		
		int answer = 0;		// Program-generated number
		int guess = 0;		// User input
		String choice;		// User chooses to play again
		
		// Prompt user to guess
		
		System.out.println("I am thinking of a number from 1-10 "
				+ "including both. "
				+ "Guess the number that I am thinking!");
	
		
	
	do {
		answer = ran.nextInt(11);				// Program generates Number
		
		
		System.out.println("Enter your guess: ");
		guess = keyboard.nextInt();
		
		{
		if(guess == answer) 
			System.out.println("Correct!");
		else 
			System.out.println("Wrong! Your guess was " + guess + ". "
					+ "The correct answer was " + answer + ".");
		

			System.out.println("Would you like to play again? "
					+ "Press Y to play again, or press any other key to quit. ");
					
	keyboard.nextLine();
	choice = keyboard.nextLine();
		
		}
	} while(choice.equals("Y"));			// Program loops if use inputs "Y"
	

	
		
	}
}