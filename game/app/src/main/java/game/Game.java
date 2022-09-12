package game;

public class Game {
    String word;

    // constructor 
    public Game(String word) {
        this.word = word;
    }
    public static void main(String[] args) {
        Game testing = new Game("TESTING");
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
