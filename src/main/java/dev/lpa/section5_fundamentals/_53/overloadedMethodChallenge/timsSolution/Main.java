package dev.lpa.section5_fundamentals._53.overloadedMethodChallenge.timsSolution;

public class Main {

    public static void main(String[] args) {

        System.out.println("5ft, 8 n = " + convertToCentimeters(5,8) + " cm");
        System.out.println("68 in = " + convertToCentimeters(68) + " cm");
    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){
        return convertToCentimeters(feet*12+inches);
    }
}
