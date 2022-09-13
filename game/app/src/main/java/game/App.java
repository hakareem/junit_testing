package game;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        WordChoser wordchoser = new WordChoser();
        Game game = new Game(wordchoser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the word guessing game!");
        System.out.println("This is your word:");

        while (game.isGameWon()==false) {
            System.out.printf("Guess this word is: %s\n", game.getWordToGuess());

            System.out.println("Give me a letter:");
            // store users guess
            char guess = scanner.next().charAt(0); 
            // boolean indicating whether it's right or wrong
            System.out.println(game.guessLetter(guess)); 

            // winning and losing conditions   
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

