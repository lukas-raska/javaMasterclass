package dev.lpa.section6_conditional_logic._67.digitSumChallenge.mySolution;

public class Main {

    public static void main(String[] args) {

        for (int i = -1; i < 100; i++) {
            System.out.println(i + "--> sum digits: " + sumDigits(i));
        }
        System.out.println();

    }

    public static int sumDigits(int number){
        if (number<0){
            return -1;
        }
        int sum = 0;
        while(number>0){
            sum+=(number%10);
            number/=10;
        }
        return sum;
    }
}
