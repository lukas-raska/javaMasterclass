package dev.lpa.section6_conditional_logic.codingExercises._17.summing_the_first_and_last_digits_of_an_integer;

public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = 0;
        boolean firstDigitFound = false;
        while (number > 0) {
            if (!firstDigitFound) {
                firstDigit = number % 10;
                firstDigitFound = true;
            }
            lastDigit = number % 10;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }
}
