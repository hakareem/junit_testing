package game;

import java.util.Random;

public class Game {
    String word;
    int attempts = 10;

    public static final String[] DICTIONARY = {"PENALDO", "PENZEMA", "PESSI", "LAKAKA"};

    // constructor 
    public Game() {
        this.word = getRandomWordFromDictionary();
    }

    public static void main(String[] args) {
        Game testing = new Game();
        System.out.println(testing.getWordToGuess()); // T______
    }

    public String getWordToGuess() {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < this.word.length(); i++) {
        Character currentLetter = word.charAt(0);
        if (i == 0) {
            builder.append(currentLetter);
        } else {
            builder.append("_");
        }
    }
    return builder.toString();
}
    public String getRandomWordFromDictionary() {
        Random rand = new Random();
        return DICTIONARY[rand.nextInt(DICTIONARY.length)];
    }
}
