package game;

import java.util.ArrayList;

public class Masker {

     // handles the word displayed to user logic 
    public String getMaskedWord(String word, ArrayList<Character> guessedLetters) {
        StringBuffer str = new StringBuffer(); // what is the difference between string builder and string buffer?

        for (int i = 0; i < word.length(); i++) {
            Character currentLetter = word.charAt(i);
            
            if (i == 0) { 
                str.append(currentLetter);
            } else {
                if (guessedLetters.contains(currentLetter)) { // append char if guess is correct
                    str.append(currentLetter);
                } else {
                    str.append("_");
                }
            }
        }
        return str.toString();
    }
}
