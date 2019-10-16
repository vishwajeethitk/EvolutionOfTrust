package com.workshop.evolutiongame;

import org.junit.Assert;
import org.junit.Test;

public class MachineTest {

    @Test
    public void shouldReturnValidGameInput() {

        Machine machine = new Machine();

        Assert.assertEquals("CO", machine.getInput());
    }
}
