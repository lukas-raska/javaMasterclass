package dev.lpa.section6_conditional_logic._60.enhancedSwitchChallenge.mySolution;

public class Main {

    public static void main(String[] args) {

        int day =7;
        printDayOfWeek(day);
        printWeekDay(day);

    }

    public static void printDayOfWeek(int day) {

        System.out.println(switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        });
    }

    public static void printWeekDay(int day) {
        String dayInWeek = "";
        if (day == 0) {
            dayInWeek = "Sunday";
        } else if (day == 1) {
            dayInWeek = "Monday";
        } else if (day == 2) {
            dayInWeek = "Tuesday";
        } else if (day == 3) {
            dayInWeek = "Wednesday";
        } else if (day == 4) {
            dayInWeek = "Thursday";
        } else if (day == 5) {
            dayInWeek = "Friday";
        } else if (day == 6) {
            dayInWeek = "Saturday";
        } else {
            dayInWeek = "Invalid day";
        }
        System.out.println(dayInWeek);

    }
}
