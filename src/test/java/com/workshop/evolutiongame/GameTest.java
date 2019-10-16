package com.workshop.evolutiongame;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Mock
    ConsoleInputWrapper consoleInputWrapper;

    @Test
    public void shouldReturnScoreForMultipleRounds() {

        Mockito.when(consoleInputWrapper.getInput()).thenReturn("CH", "CO");
        Player<ConsoleInputWrapper> consolePlayer = new Player<>(consoleInputWrapper);
        Player<Machine> machine = new Player<>(new Machine());
        Game game = new Game(5, consolePlayer, machine);
        Score score = game.play();

        Assert.assertEquals(11, score.playerOneScore);
        Assert.assertEquals(7, score.playerTwoScore);

    }
}
