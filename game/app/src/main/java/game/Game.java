package game;

import java.util.ArrayList;

public class Game {
    // class properties
    private String word;
    private ArrayList<Character> guessedLetters = new ArrayList<Character>();
    private int attempts;


    // class constructor 
    public Game(WordChoser choser) {
        this.word = choser.getRandomWordFromDictionary();
        this.attempts = 10;
    }

    // returns number of attempts left
    public Integer remainingAttempts() {
        return this.attempts;
    }

    // handles the word displayed to user logic 
    public String getWordToGuess() {
        StringBuffer str = new StringBuffer(); // what is the difference between string builder and string buffer?

        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = word.charAt(i);
            
            if (i == 0) { // first char always visible
                str.append(currentLetter);
            } else {
                if (guessedLetters.indexOf(currentLetter) != -1) { // append char if guess is correct
                    str.append(currentLetter);
                } else {
                    str.append("_");
                }
            }
        }
        return str.toString();
    }

    // handling user's guess
    public String guessLetter(char character) {
        character = Character.toUpperCase(character); // storing char inputted by user 

        if (guessedLetters.contains(character)) {
            return "This letter has already been used before";
        }

        guessedLetters.add(character); 

        if (this.word.contains(String.valueOf(character))) {  // if word contains that character
            return "Nice!";
        } else {
            attempts--;
            return String.format("Wrong, %d attemps left.", this.attempts);
        }
    }

    public Boolean isGameWon() {
        if (getWordToGuess().contains("_") == true) { return false; }
        return true;
    }

    public Boolean isGameLost() {
        if (attempts == 0){ return true; }
        return false;
    }
}
