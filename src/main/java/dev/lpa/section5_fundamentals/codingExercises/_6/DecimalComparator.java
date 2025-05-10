package dev.lpa.section5_fundamentals.codingExercises._6;

public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println(areEqualsByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualsByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualsByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualsByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualsByThreeDecimalPlaces(double a,
                                                        double b) {
        return (int) ((a * 1000)) == (int) ((b * 1000));


    }
}
