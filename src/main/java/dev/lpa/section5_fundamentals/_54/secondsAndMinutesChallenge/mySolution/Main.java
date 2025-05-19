package dev.lpa.section5_fundamentals._54.secondsAndMinutesChallenge.mySolution;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));

    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid input (%d seconds). Parameter seconds should be >= 0".formatted(seconds);
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(remainingSeconds, minutes);
    }

    public static String getDurationString(int minutes,
                                           int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid input: (%d seconds, %d minutes). Parameter seconds must be in interval (0-59), parameter minutes should be >=0".formatted(seconds, minutes);
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return "%dh %dm %ds".formatted(hours, remainingMinutes, seconds);

    }
}
