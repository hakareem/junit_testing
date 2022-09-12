package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    @Test public void testGetsWordToGuess() {
        Game game = new Game();
        String word = game.getWordToGuess();
        assertEquals(game.getWordToGuess(), word);
    }

    @Test public void attemptsCounter() {
    Game game = new Game();
    assertEquals(game.attempts,10);
    }
}