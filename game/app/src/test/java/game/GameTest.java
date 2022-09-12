package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    @Test public void testGetsWordToGuess() {
        Game game = new Game();
        String word = "B_____";
        assertEquals(game.getWordToGuess(word), "B_____");
    }
}