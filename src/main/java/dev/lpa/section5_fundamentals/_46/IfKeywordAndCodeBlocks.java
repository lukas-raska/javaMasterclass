package dev.lpa.section5_fundamentals._46;

public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

       calculateScore(true, 800, 5, 100);




    }

    public static void calculateScore (boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
