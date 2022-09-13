package game;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GameTest {
    @Test public void testGetsWordToGuess() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("PESSI");

        Game game = new Game(mockedChoser);
        String word = game.getWordToGuess();
        assertEquals(game.getWordToGuess(), word);
    }

    @Test public void attemptsCounter() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("PESSI");

        Game game = new Game(mockedChoser);
        assertEquals(game.remainingAttempts(),Integer.valueOf(10));
    }

    @Test public void testGetsWordToGuessWithRandomWord() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("PESSI");

        Game game = new Game(mockedChoser);
        assertEquals(game.getWordToGuess(), "P____");
    }


    @Test public void testGuessLetterRightAndDisplayGuessedLetter() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("PESSI");

        Game game = new Game(mockedChoser);

        assertEquals(game.guessLetter('S'), true);
    }

    @Test public void testGuessLetterWrong() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("PESSI");

        Game game = new Game(mockedChoser);

        assertEquals(game.guessLetter('M'), false);
    }

    @Test public void testRightWordGuessed() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

        Game game = new Game(mockedChoser);

        assertEquals(game.guessLetter('K'), true);
        assertEquals(game.getWordToGuess(), "M_K___");
    }

    @Test public void testWrongLetterGuessed() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

        Game game = new Game(mockedChoser);

        assertEquals(game.guessLetter('O'), false);
        assertEquals(game.getWordToGuess(), "M_____");
    }

    @Test public void testIsWon() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAEED");

        Game game = new Game(mockedChoser);
        game.guessLetter('D');
        game.guessLetter('E');
        game.guessLetter('A');

        assertEquals(game.isGameWon(), true);
    }

    @Test public void testIsWonWithSpecialWord() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("LAAKO");

        Game game = new Game(mockedChoser);
        game.guessLetter('A');
        game.guessLetter('K');
        game.guessLetter('O');

        assertEquals(game.isGameWon(), true);
    }

    @Test public void testIsGameLost() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

        Game game = new Game(mockedChoser);
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');
        game.guessLetter('G');

        assertEquals(game.isGameLost(), true);
    }
}