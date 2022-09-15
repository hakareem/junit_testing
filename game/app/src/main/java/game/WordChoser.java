package game;

import java.util.Random;

public class WordChoser {
  
  static final String[] DICTIONARY = {"FOOTBALL", "MACBOOK", "MONITOR", "UNIVERSE"};
  
  public String[] getDictionary() {
    return DICTIONARY;
  }

  // selects a random word from the dictionary
  public String getRandomWordFromDictionary() {
    int rand = new Random().nextInt(DICTIONARY.length);
    return DICTIONARY[rand];
  }
}

