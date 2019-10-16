package com.workshop.evolutiongame;

public class GameEngine {

    private Score[][] scores = {
            {
                    new Score(2,2),
                    new Score(-1, 3)
            },
            {
                    new Score(3, -1),
                    new Score(0,0)
            }
    };

    private int convertToGameEngine(String input) throws Exception {
        switch (input.toLowerCase()) {
            case "ch":
                return GameInput.CHEAT.getValue();
            case "co":
                return GameInput.COOPERATE.getValue();
            default:
                throw new Exception("Invalid Input");
        }
    }

    public Score getScore(String playerOneInput, String playerTwoInput) throws Exception {

        return this.scores[this.convertToGameEngine(playerOneInput)][this.convertToGameEngine(playerTwoInput)];
    }

}
