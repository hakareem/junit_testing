package game;

import java.util.Random;

public class WordChoser {
  public static final String[] DICTIONARY = {"PENALDO", "PENZEMA", "PESSI", "LAKAKA"};
  
  public String getRandomWordFromDictionary() {
    Random rand = new Random();
    return DICTIONARY[rand.nextInt(DICTIONARY.length)];
  }
}

