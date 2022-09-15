package game;

import java.util.ArrayList;

public class Game {
    // class properties
    public String word;
    private int attempts;
    public ArrayList<Character> guessedLetters = new ArrayList<Character>();
    public ArrayList<Number> players = new ArrayList<Number>();
    private String playerName;
    public Masker masker;

    // class constructor 
    public Game(String playerName, WordChoser choser, Masker masker, int attempts) {
        this.word = choser.getRandomWordFromDictionary();
        this.attempts = 10;
        this.playerName = playerName;
        this.masker = masker;
    }

    // handling user's guess
    public String guessLetter(Character guess) {
        int idx = this.word.indexOf(guess);
        if (idx > -1) {
            guessedLetters.add(guess);
            return this.playerName + ", you got it right."; 
        }

        this.attempts--;
        System.out.printf("Wrong, %s you have %d attempts left!\n", this.playerName, this.attempts);
        return this.playerName + ", you got it wrong.";
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public String getWordToGuess() {
        return masker.getMaskedWord(this.word, this.guessedLetters);
    }

    public ArrayList<Character> getGuessedLetters() {
        return guessedLetters;
    }

    public Integer remainingAttempts() {
        return this.attempts;
    }

    public Boolean isGameWon() {
        Masker masker = new Masker();
        return !(masker.getMaskedWord(this.word, guessedLetters).contains("_") == true);
    }

    public Boolean isGameLost() {
        return this.attempts == 0;
    }
}
