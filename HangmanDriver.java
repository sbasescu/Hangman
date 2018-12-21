import java.util.Scanner;

public class HangmanDriver {
	public static void main(String[] args) {

		boolean newGame = true;
		while (newGame) { //runs when a new game starts
			boolean play = true; //sets condition for inner while loop to be satisfied
			int numIncorrect = 0; //keeps track of number of incorrect guesses
			String guessType = " "; //will be set to "L" if user wants to guess letter or "W" if word
			String guess = " ";  //will hold the users guesses
			Scanner kb = new Scanner(System.in);
			Hangman game = new Hangman();
			String word = game.selectGameWord();
			System.out.println("Welcome to Hangman!\nGenerating a secred word...\nHere it is!");
			game.printArray(); //prints current status of word being guessed (will be all dashes to start)
			game.showMan(numIncorrect);
			while (play) { //while current game is going
				getChoice();
				guessType = kb.nextLine().toUpperCase(); //takes entry and makes it upper case
				if (guessType.equals("L")) {
					getGuessL();
					guess = kb.nextLine().toUpperCase(); //takes in letter guess as a string and makes it upper case
					if (word.lastIndexOf(guess) != -1) { //condition is satisfied if word contains the guess
						System.out.println("Correct!");
						game.getCurrentWord(guess); //updates the display of the current word
						game.printArray(); //prints the updated display of the current word
						game.showMan(numIncorrect);
						System.out.println("Incorrect guesses: " + game.getIncorrectGuesses(guess));
					}
					else {
						numIncorrect++;
						System.out.println("Incorrect!");
						if (numIncorrect < 10) { //if user has not yet reached maximum guesses
							//note that I do not need to call "game.getCurrentWord(guess)" method here
							//as I did in the above if statement because the guess was wrong so the 
							//display of the current word does not need to be updated 
							game.printArray();
							game.showMan(numIncorrect);
							System.out.println("Incorrect guesses: " + game.getIncorrectGuesses(guess));
						}

						else { //if user has reached maximum guesses
							System.out.println("Maximum guesses reached!\nYou Lose!\n"+"The word is: " + word);
							gameOver();
							guess = kb.nextLine().toUpperCase();
							if (guess.equals("Y")) //if user wants to play again
								play = false; //breaks out of inner while loop and starts a new game
							else { //if user wants to be a quitter
								play = false; //breaks out of inner while loop
								newGame = false; //breaks out of outer while loop	
							}
						}
					}
				}
				else if (guessType.equals("W")) {
					getGuessW();
					guess = kb.nextLine().toUpperCase();
					if (guess.equals(word)) { //if word guess is correct
						System.out.println("Correct!\nYou Win!\n" +  "The word is: " + word);
						gameOver();
					}
					else {
						System.out.println("Incorrect!\nYou Lose!\n"+"The word is: " + word);
						gameOver();
					}
					guess = kb.nextLine().toUpperCase();
					if (guess.equals("Y")) //if user wants to play again
						play = false; //breaks out of inner while loop and starts a new game
					else { //if user wants to be a quitter
						play = false; //breaks out of inner while loop
						newGame = false; //breaks out of outer while loop
					}
				}
			}
		}
		System.out.println("Goodbye!");
	}
	/*
	 * Asks if user wants to guess a letter or word
	 */

	public static void getChoice() {
		System.out.println("Type L to guess a letter or W to guess a word: ");
	}
	/*
	 * Prompts user to enter a letter guess
	 */
	public static void getGuessL() {
		System.out.println("Enter your guess (as a single letter): ");
	}
	/*
	 * Prompts user to enter a word guess
	 */
	public static void getGuessW() {
		System.out.println("Enter your guess (as a word): ");
	}
	/*
	 * Tells user that the game is over and asks if they want to play again
	 */
	public static void gameOver() {
		System.out.println("Would you like to play again: Yes(Y) or No(N)");
	}
}

