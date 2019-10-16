package com.workshop.evolutiongame;

public class Score {

    int playerOneScore, playerTwoScore;

    public Score(int playerOneScore, int playerTwoScore) {
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
    }

    public Score() { }

    public int getPlayerOneScore() {
        return this.playerOneScore;
    }

    public int getPlayerTwoScore() {
        return this.playerTwoScore;
    }

    public void merge(Score score) {
        this.playerOneScore += score.getPlayerOneScore();
        this.playerTwoScore += score.getPlayerTwoScore();
    }
}
