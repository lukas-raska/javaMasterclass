package dev.lpa.section6_conditional_logic.codingExercises._23.confirming_perfect_numbers_through_sum_of_proper_divisors;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }
}
