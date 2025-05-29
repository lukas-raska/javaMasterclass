package dev.lpa.section6_conditional_logic.codingExercises._22.deriving_the_greatest_common_divisor;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first,
                                               int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        for (int i = Math.min(first, second); i > 1; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
