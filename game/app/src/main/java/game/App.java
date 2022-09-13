package game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        WordChoser wordchoser = new WordChoser();
        Game game = new Game(wordchoser);
        Masker masker = new Masker();


        Scanner scanner = new Scanner(System.in); // creating a scanner object
        System.out.println("Welcome to the word guessing game!");
        
        System.out.println("Today the word to guess is:");

        while (game.isGameWon()== false) {
            
            System.out.printf("Guess this word: %s\n", masker.getMaskedWord(game.word, game.guessedLetters)); 
            
            // System.out.println("Enter name for player 1:");
            // String player_1 = scanner.next();

            System.out.println("Give me a letter:");
            char guess = scanner.next().charAt(0); // reading and storing user input
            System.out.println(game.guessLetter(guess)); // boolean indicating whether it's right or wrong

            // win and lose conditions   
            if (game.isGameLost()) {
                System.out.println("omg you're so bad");
                break;
            }
            if (game.isGameWon()) {
                System.out.println("omg you're so good");
                break;
            }
        }
        scanner.close(); 
    }
}

