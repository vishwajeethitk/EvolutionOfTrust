package com.workshop.evolutiongame;

import org.junit.Assert;
import org.junit.Test;

public class GameEngineTest {

    @Test
    public void shouldReturnValidScoreForBothPlayersAsCooperate() throws Exception {

        GameEngine game = new GameEngine();
        Score score = game.getScore("CO", "CO");

        Assert.assertEquals(2, score.getPlayerOneScore());
    }

    @Test
    public void shouldReturnValidScoreForBothPlayersAsCheat() throws Exception {

        GameEngine game = new GameEngine();
        Score score = game.getScore("CH", "CH");

        Assert.assertEquals(0, score.getPlayerOneScore());
    }

    @Test
    public void shouldReturnValidScoreForCooperateCheatPair() throws Exception {

        GameEngine game = new GameEngine();
        Score score = game.getScore("CO", "CH");

        Assert.assertEquals(-1, score.getPlayerOneScore());
    }

    @Test
    public void shouldReturnValidScoreForCheatCooperatePair() throws Exception {

        GameEngine game = new GameEngine();
        Score score = game.getScore("CH", "CO");

        Assert.assertEquals(3, score.getPlayerOneScore());
    }

}
