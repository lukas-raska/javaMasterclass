package dev.lpa.section6_conditional_logic._63.whileLoop;

public class Main {

    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//        System.out.println("---------------------");
//
//        int j = 1;
//        boolean isReady = false;
//        do {
//            if (j > 5) {
//                break;
//            }
//            System.out.println(j);
//            j++;
//            isReady = j > 0;
//        } while ((isReady));

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }
    }
}
