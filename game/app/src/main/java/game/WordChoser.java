package game;

import java.util.Random;

public class WordChoser {
  public static final String[] DICTIONARY = {"PENALDO", "PENZEMA", "PESSI", "LAKAKA"};
  
  // selects a random word from the dictionary
  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    return DICTIONARY[rand.nextInt(DICTIONARY.length)];
  }
}

