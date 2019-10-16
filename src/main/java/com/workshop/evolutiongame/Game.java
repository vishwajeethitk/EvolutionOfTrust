package com.workshop.evolutiongame;

public class Game {

    private GameEngine engine;
    private Score finalScore;
    private Player userOne;
    private Player userTwo;
    private int noOfRounds;

    private Game() {
        this.engine = new GameEngine();
        this.finalScore = new Score();
    }

    public Game(int noOfRounds,Player userOne, Player userTwo) {
        this();
        this.noOfRounds = noOfRounds;
        this.userOne = userOne;
        this.userTwo = userTwo;
    }

    public void processRound(String userOneInput, String userTwoInput) throws Exception {

        this.finalScore.merge(this.engine.getScore(userOneInput, userTwoInput));
    }

    public Score play() {
        try {
            while (noOfRounds > 0) {
                this.processRound(this.userOne.getInput(), this.userTwo.getInput());
                noOfRounds--;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return finalScore;
    }
}
