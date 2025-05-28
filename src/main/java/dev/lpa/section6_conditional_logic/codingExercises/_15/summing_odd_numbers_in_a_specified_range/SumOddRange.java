package dev.lpa.section6_conditional_logic.codingExercises._15.summing_odd_numbers_in_a_specified_range;

public class SumOddRange {


    public static int sumOdd(int start,
                             int end) {
        if (start < 0 || end < 0 || start > end) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isOdd(int number) {
        return number > 0 && number % 2 != 0;
    }
}
