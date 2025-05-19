package dev.lpa.section5_fundamentals.codingExercises._10;

public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        long years = minutes / 60 / 24 / 365;
        long remainingDays = minutes / 60 / 24 % 365;
        String resultMessage = minutes + " min = " + years + " y and " + remainingDays + " d";

        System.out.println((minutes<0)? "Invalid Value": resultMessage);
    }
}
