package game;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class WordChoserTest {
  @Test public void returnsRandomWord() {
    WordChoser word = new WordChoser();
    String[] Test = {"PENALDO", "PENZEMA", "PESSI", "LAKAKA"};
    assertTrue(Arrays.asList(Test).contains(word.getRandomWordFromDictionary()));

  }
}
