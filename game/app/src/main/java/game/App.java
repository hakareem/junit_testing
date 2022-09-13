package game;

import java.util.Scanner;

public class App {
 public static void main(String[] args) {
   WordChoser choser = new WordChoser();
   Game game = new Game(choser); 
   System.out.println("Welcome! Today the word to guess is:");
   
   do {
    System.out.println(game.getWordToGuess());

    System.out.println("Enter one letter to guess:");

    Scanner scanner = new Scanner(System.in);
    Character guess = scanner.nextLine().charAt(0);
    Boolean result = game.guessLetter(guess);

     if (result) {
         System.out.println("Right Letter!");

         if(game.isGameWon()){
          System.out.println("You Won - Well done!");
          break;
         }
         
     } else {
         System.out.println("Wrong Letter...");
     }
 } while (!game.isGameLost());
  }
}
