package dev.lpa.section6_conditional_logic._66.whileLoopChallenge.mySolution;

public class Main {

    public static void main(String[] args) {

        int number = 5;
        int totalEven = 0;
        int totalOdd = 0;
        while (number <= 20) {
            if (isEvenNumber(number)) {
                totalEven++;
                System.out.println("Even number found: " + number);
                if (totalEven == 5) {
                    break;
                }
            } else {
                totalOdd++;
            }
            number++;
        }

        System.out.println("Total even = " + totalEven);
        System.out.println("Total odd = " + totalOdd);


    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
