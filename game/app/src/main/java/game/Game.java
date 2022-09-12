package game;

public class Game {
    // constructor 
    public Game(String word) {}
    public static void main(String[] args) {
        System.out.println();
    }

    public String getWordToGuess(String word) {
        StringBuilder strBuilder = new StringBuilder(word);
        for (int i = 1; i < word.length(); i++){
            strBuilder.replace(i, word.length(), "_");
        }
        return strBuilder.toString();
    }
}
