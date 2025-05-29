package dev.lpa.section6_conditional_logic.codingExercises._24.converting_digits_into_words_and_handling_edge_cases;

public class NumberToWords {

    public static void main(String[] args) {

        //System.out.println(reverse(100));
        numberToWords(-123);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digitsCount = getDigitCount(number);
        int reversed = reverse(number);

        for (int i = 0; i < digitsCount; i++) {
            System.out.print(switch (reversed % 10) {
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Zero";
            });
            System.out.print(" ");
            reversed /= 10;
        }


    }

    public static int reverse(int number) {
        int reversed = 0;
        while (Math.abs(number) > 0) {
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 1;
        while (number >= 10) {
            number /= 10;
            count++;
        }

        return count;
    }
}
