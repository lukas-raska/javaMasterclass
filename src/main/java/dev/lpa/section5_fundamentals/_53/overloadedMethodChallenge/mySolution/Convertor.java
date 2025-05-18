package dev.lpa.section5_fundamentals._53.overloadedMethodChallenge.mySolution;

public class Convertor {


    public static double convertToCentimeters(int inches) {
        return 2.54d * inches;
    }

    public static double convertToCentimeters(int feet,
                                              int inches) {
        return convertToCentimeters(12 * feet + inches);
    }

}




