package dev.lpa.section5_fundamentals.codingExercises._2;

public class SpeedConverter {

    public static void main(String[] args) {

        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour/1.609d);
    }

    public static void printConversion (double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        String messageToPrint = (milesPerHour<0)? "Invalid Value": kilometersPerHour + " km/h = " + milesPerHour + " " +
                "mi/h";
        System.out.println(messageToPrint);
    }
}
