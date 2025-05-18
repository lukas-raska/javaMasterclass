package dev.lpa.section5_fundamentals._53.overloadedMethodChallenge.mySolution;

public class Main {

    public static void main(String[] args) {

        int inches = 1;
        System.out.println(inches + " inch = " + Convertor.convertToCentimeters(inches) + " cm");

        System.out.println(2*inches + " inch = " + Convertor.convertToCentimeters(2*inches) + " cm");

        System.out.println("1 foot = " + Convertor.convertToCentimeters(1,0) + " cm ");
    }
}
