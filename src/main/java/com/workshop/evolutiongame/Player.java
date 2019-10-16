package com.workshop.evolutiongame;

public class Player<T extends InputWrapper> {

    private T inputWrapper;

    public Player(T inputWrapper) {
        this.inputWrapper = inputWrapper;
    }

    public String getInput() {
        return inputWrapper.getInput();
    }
}
