package com.workshop.evolutiongame;

public enum GameInput {
    COOPERATE (0),
    CHEAT (1);

    private final int inputValue;

    GameInput(int value) {
        this.inputValue = value;
    }

    public int getValue() {
        return this.inputValue;
    }
}
