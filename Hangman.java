public class Hangman {

	private int numwords = 10;
	private String[] words = new String[numwords];
	private String gameWord;
	private char[] dispArr = {'-','-','-','-','-','-','-'};
	private String wrongGuesses = " "; //wrong guesses from the user will be added to this string 


	//Note that since no constructor is defined, there is 
	//a default empty constructor

	/*Method to display the hangman given the number of body parts to show
	 * Player gets at most 10 turns. */
	public void showMan(int numParts)
	{

		if (numParts == 0){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 1){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 2){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}

		if (numParts == 3){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|      __|");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 4){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 5){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 6){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 7){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       /");
			System.out.println("|      /  ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}

		if (numParts == 8){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       / \\");
			System.out.println("|      /   \\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}

		if (numParts == 9){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       / \\");
			System.out.println("|      /   \\");
			System.out.println("|    O/    ");
			System.out.println("|");
			System.out.println("____");

		}
		if (numParts == 10){

			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       / \\");
			System.out.println("|      /   \\");
			System.out.println("|    O/     \\O");
			System.out.println("|");
			System.out.println("____");
		}

	}

	/**
	  Sets the list of candidate words for the player to guess
	 **/
	public void setDefaultWords()
	{

		this.words[0] = "notions";
		this.words[1] = "measure";
		this.words[2] = "product";
		this.words[3] = "foliage";
		this.words[4] = "garbage";
		this.words[5] = "minutes";
		this.words[6] = "chowder";
		this.words[7] = "recital";
		this.words[8] = "concoct";
		this.words[9] = "brownie";		
	}


	/*********************************************************
	 * Below are the setter and getter methods for this class. 
	 * You may not need to use methods but they are included
	 * since it is good practice to have them.
	 *********************************************************/

	/*
	 * Sets the number of words
	 */
	public void setNumWords(int num)
	{
		this.numwords = num;
	}


	/*
	 * Returns the number of words
	 */
	public int getNumWords()
	{
		return this.numwords;
	}


	/*
	 * Sets words array
	 */
	public void setWords(String[] w)
	{
		this.words = w;
	}

	/*
	 * Returns the array of words
	 */
	public String[] getWords()
	{
		return this.words;
	}


	/*
	 * Sets the game word
	 */
	public void setGameWord(String w)
	{
		this.gameWord = w;
	}


	/*
	 * Returns the game word
	 */
	public String getWord()
	{
		return this.gameWord;
	}


	/*
	 * Sets dispArr
	 */
	public void setDispArr(char[] dA)
	{
		this.dispArr = dA;
	}


	/*
	 * Returns dispArr
	 */
	public char[] getdispArr()
	{
		return this.dispArr;
	}
	/*
	 * Sets gameWord to a random word in the words[] array
	 */
	public String selectGameWord() {
		setDefaultWords();
		int w = (int)(Math.random() * this.numwords); //gets a random int between 0 and 9 (inclusive) 
		String temp = words[w]; //stores our random gameWord in a temporary String 
		this.gameWord = temp.toUpperCase(); //makes our gameWord all upper case
		return this.gameWord; //returns our gameWord in upper case
	}
	/*
	 * Checks if guessed char appears in the gameWord and changes the current word to display the
	 * guessed letter if it appears
	 */
	
	public char[] getCurrentWord(String g) {
		for (int i = 0; i < this.gameWord.length(); i++) 
		{
			if (this.gameWord.charAt(i) == g.charAt(0)) //checks if/where guess appears in the gameWord
			{
				this.dispArr[i] = g.charAt(0); //changes current word to display the guessed letter 
			}   
		}
		return this.dispArr;
	}
	
	
	/*
	 * Checks if user's guess appears in the gameWord and returns an updated string of wrong guesses
	 */
	public String getIncorrectGuesses(String g) {
		/*
		 * If string g, which is the user's guess, does not appear in the gameWord, the 
		 * lastIndexOf() method returns -1 and the condition for our if statement is satisfied. 
		 */
		if (this.gameWord.lastIndexOf(g) == -1) 
			this.wrongGuesses += g + " "; //adds the user's wrong guess to the 
									      //existing string of wrong guesses
		return this.wrongGuesses;	
	}
	
	
	/*
	 * Prints current word
	 */
	
	public void printArray() {
		for (int i = 0; i < this.dispArr.length; i++) { //loops through currentWord array and prints
			System.out.print(dispArr[i]); 		       //each character
		}
		System.out.println(); //prints a new line 
	}




}