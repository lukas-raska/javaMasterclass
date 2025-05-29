package dev.lpa.section6_conditional_logic.codingExercises._20.evaluating_the_last_digit_for_multiple_integer_comparisons;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a,
                                           int b,
                                           int c) {

        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int lastA = a%10;
        int lastB = b%10;
        int lastC = c%10;

        return lastA == lastB || lastA == lastC || lastB == lastC;
    }

    public static boolean isValid(int n) {
        return n >= 10 && n <= 1000;
    }
}
