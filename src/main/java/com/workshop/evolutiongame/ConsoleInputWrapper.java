package com.workshop.evolutiongame;

import java.util.Scanner;

public class ConsoleInputWrapper implements InputWrapper {

    private Scanner scanner;

    public ConsoleInputWrapper() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getInput() {
        return this.scanner.nextLine();
    }
}
