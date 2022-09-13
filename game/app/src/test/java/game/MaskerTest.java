package game;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class MaskerTest {
    @Test
    public void testGetsMaskedWord() {
        Masker masker = new Masker();
        ArrayList<Character> guessedLetters = new ArrayList<Character>();
        guessedLetters.add('E');
        guessedLetters.add('V');

        assertEquals(masker.getMaskedWord("DEVELOPER", guessedLetters), "DEVE___E_");
    }
}