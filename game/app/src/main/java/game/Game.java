package game;

import java.util.ArrayList;

public class Game {
    private String word;
    private ArrayList<Character> guessedLetters = new ArrayList<Character>();
    private int attempts = 10;

    // constructor 
    public Game(WordChoser choser) {
        this.word = choser.getRandomWordFromDictionary();
    }

    public Integer remainingAttempts() {
        return this.attempts;
    }

    public String getWordToGuess() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = word.charAt(i);
            if (i == 0) {
                // first letter is always shown
                builder.append(currentLetter);
            } else {
                // show letter only if it was already guessed
                if (guessedLetters.indexOf(currentLetter) != -1) {
                    builder.append(currentLetter);
                } else {
                    builder.append("_");
                }
            }
        }
        return builder.toString();
    }

    public Boolean guessLetter(Character letter) {
        if (this.word.indexOf(letter) != -1) {
            guessedLetters.add(letter);
            return true;
        } else {
            attempts--;
            return false;
        }
    }

    public Boolean isGameWon() {
        for (int i = 1 ; i < word.length() ; i++) {
            Character letter = word.charAt(i);
            if (guessedLetters.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

    public Boolean isGameLost() {
        if (this.attempts == 0) {
            System.out.println("You lost - play again!");
            return true;
        } 
        return false;
    }

}
