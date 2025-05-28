package dev.lpa.section6_conditional_logic._63.sum3And5Challenge.mySolution;

public class Main {

    public static void main(String[] args) {

        int limit = 5;
        int found = 0;
        int sum = 0;
        for (int i = 1; found < limit && i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Found number: " + i);
                found++;
                sum += i;
            }
        }
        System.out.println("Sum of found numbers = " + sum);
    }
}
