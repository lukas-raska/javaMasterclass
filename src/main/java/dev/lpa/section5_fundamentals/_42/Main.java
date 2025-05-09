package dev.lpa.section5_fundamentals._42;

public class Main {

    public static void main(String[] args) {

        double kilometers = 50;

        int highScore = 50;

        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}
