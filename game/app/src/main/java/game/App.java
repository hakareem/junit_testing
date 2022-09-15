package game;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        WordChoser wordchoser = new WordChoser();
        Masker masker = new Masker();
        // Game game = new Game("H",wordchoser, masker);
        Scanner scanner = new Scanner(System.in); // creating a scanner object
        System.out.println("Enter name for player 1:");
        String player1Name = scanner.nextLine();

        System.out.println("Enter name for player 2:");
        String player2Name = scanner.nextLine();

        Game player1 = new Game(player1Name, wordchoser, masker, 10);
        Game player2 = new Game(player2Name, wordchoser, masker, 10);

        System.out.println("\nWelcome to the word guessing game!");
        System.out.println("Today the word to guess is:");

        String player1Word = player1.getWordToGuess();
        String player2Word = player2.getWordToGuess();

        while (player1Word.equals(player2Word)) {
            player1Word = player1.getWordToGuess();
            player2Word = player2.getWordToGuess();
        }
            // System.out.println("WENT OVER HERE" + player1Word + " : " + player1Word);
            System.out.println("\n" + player1.getPlayerName() + ": " + player1Word);
            System.out.println(player2.getPlayerName() + ": " + player2Word);
        
        while (true) {
            System.out.println("\n" + player1Name + ": Enter one letter to guess (" + player1.remainingAttempts() + " attemps remaining)");
            Character guessPlayer1 = scanner.next().charAt(0); // reading and storing user input
            char player1Guess = Character.toUpperCase(guessPlayer1);
            // System.out.println(player1Guess);
            System.out.println(player1.guessLetter(player1Guess)); // boolean indicating whether it's right or wrong
            System.out.printf(player1Name + ", guess this word: %s\n", masker.getMaskedWord(player1.word, player1.guessedLetters)); 

            System.out.println("\n" + player2Name + ": Enter one letter to guess (" + player2.remainingAttempts() + " attempts remaining)");
            Character guessPlayer2 = scanner.next().charAt(0); // reading and storing user input
            char player2Guess = Character.toUpperCase(guessPlayer2);
            // System.out.println(player2Guess); // N
            System.out.println(player2.guessLetter(player2Guess)); // n
            System.out.printf(player2Name + ", guess this word: %s\n", masker.getMaskedWord(player2.word, player2.guessedLetters)); 
            
            //     char1 = 'a';
            //     char2 = 'B';
            //     char char1UpperCase = Character.toUpperCase(char1);
            //     char char2LowerCase = Character.toLowerCase(char2);

            if (player1.isGameLost()) {
                System.out.println(player1Name + " lost");
                break;
            }
            if (player1.isGameWon()) {
                System.out.println(player1Name + " won");
                break;
            }

            if (player2.isGameLost()) {
                System.out.println(player2Name + " lost");
                break;
            }
            if (player2.isGameWon()) {
                System.out.println(player2Name + " won");
                break;
            }
        }
        scanner.close(); 
    }
    }
