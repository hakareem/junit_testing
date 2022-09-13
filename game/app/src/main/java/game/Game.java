package game;

import java.util.ArrayList;

public class Game {
    // class properties
    public String word;
    public ArrayList<Character> guessedLetters = new ArrayList<Character>();
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
        Masker masker = new Masker();
        if (masker.getMaskedWord(this.word, guessedLetters).contains("_") == true) { return false; }
        return true;
    }

    public Boolean isGameLost() {
        if (attempts == 0){ return true; }
        return false;
    }
}
