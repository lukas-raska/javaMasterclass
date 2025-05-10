package dev.lpa.section5_fundamentals._49.mySolution;

public class MethodChallenge {

    public static void main(String[] args) {

        String playerName = "Luky";
        displayHighScorePosition(playerName, calculateHighScorePosition(1500));
        displayHighScorePosition(playerName, calculateHighScorePosition(1000));
        displayHighScorePosition(playerName, calculateHighScorePosition(500));
        displayHighScorePosition(playerName, calculateHighScorePosition(100));
        displayHighScorePosition(playerName, calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the highscore list");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        } else if (playerScore >=500) {
            return 2;
        } else if (playerScore >=100) {
            return 3;
        } else {
            return 4;
        }
    }
}
