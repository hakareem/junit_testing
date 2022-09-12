package game;

public class Game {
    String word;
    int attempts = 10;

    // constructor 
    public Game() {
        WordChoser wordChoser = new WordChoser();
        word = wordChoser.getRandomWordFromDictionary();
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
}
