package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    @Test public void testGetsWordToGuess() {
        Game game = new Game("Makers");
        assertEquals(game.getWordToGuess(), "M_____");
    }

    @Test public void attemptsCounter() {
    Game game = new Game("Makers");
    assertEquals(game.attempts,10);
    }
}