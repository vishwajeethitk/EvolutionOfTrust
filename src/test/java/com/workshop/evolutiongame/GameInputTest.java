package com.workshop.evolutiongame;

import org.junit.Assert;
import org.junit.Test;

public class GameInputTest {

    @Test
    public void shouldReturnCooperate() {
        GameInput gameInput = GameInput.COOPERATE;

        Assert.assertEquals(0, gameInput.getValue());
    }

    @Test
    public void shouldReturnCheat() {
        GameInput gameInput = GameInput.CHEAT;

        Assert.assertEquals(1, gameInput.getValue());
    }
}
