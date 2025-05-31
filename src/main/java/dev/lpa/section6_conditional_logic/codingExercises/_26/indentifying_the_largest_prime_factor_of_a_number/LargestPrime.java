package dev.lpa.section6_conditional_logic.codingExercises._26.indentifying_the_largest_prime_factor_of_a_number;

import java.math.BigInteger;

public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number) {
        if (number < 1) {
            return -1;
        }
        int factor = -1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                factor = i;
                while (number % factor == 0) {
                    number /= factor;
                }
            }
        }
        return number == 1 ? factor : number;
    }


}
