package game;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class GameTest {
    @Test public void attemptsCounter() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("PESSI");
        Masker masker = new Masker();

        Game game = new Game("H", mockedChoser, masker, 10);
        assertEquals(game.remainingAttempts(),Integer.valueOf(10));
    }

    @Test public void testGetsWordToGuessWithRandomWord() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("PESSI");

        Masker masker = new Masker();
        Game game = new Game("H", mockedChoser, masker, 10);


        assertEquals(masker.getMaskedWord(game.word, game.guessedLetters), "P____");
    }


    @Test public void testGuessLetterRightAndDisplayGuessedLetter() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("PESSI");

        Masker masker = new Masker();
        Game game = new Game("H", mockedChoser, masker, 10);

        assertEquals(game.guessLetter('S'), true);
    }

    @Test public void testGuessLetterWrong() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("PESSI");
        
        Masker masker = new Masker();
        Game game = new Game("H", mockedChoser, masker, 10);

        assertEquals(game.guessLetter('M'), false);
    }

    @Test public void testRightWordGuessed() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

        Masker masker = new Masker();
        Game game = new Game("H", mockedChoser, masker, 10);

        assertEquals(game.guessLetter('K'), true);
        assertEquals(masker.getMaskedWord(game.word, game.guessedLetters), "M_K___");
    }

    @Test public void testWrongLetterGuessed() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

        Masker masker = new Masker();
        Game game = new Game("H", mockedChoser, masker, 10);

        assertEquals(game.guessLetter('O'), false);
        assertEquals(masker.getMaskedWord(game.word, game.guessedLetters), "M_____");
    }

    @Test public void testIsWon() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAEED");

        Masker masker = new Masker();
        Game game = new Game("H", mockedChoser, masker, 10);
        game.guessLetter('D');
        game.guessLetter('E');
        game.guessLetter('A');

        assertEquals(game.isGameWon(), true);
    }

    @Test public void testIsWonWithSpecialWord() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("LAAKO");

        Masker masker = new Masker();
        Game game = new Game("H", mockedChoser, masker, 10);
        game.guessLetter('A');
        game.guessLetter('K');
        game.guessLetter('O');

        assertEquals(game.isGameWon(), true);
    }

    @Test public void testIsGameLost() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

        Masker masker = new Masker();
        Game game = new Game("H", mockedChoser, masker, 10);
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