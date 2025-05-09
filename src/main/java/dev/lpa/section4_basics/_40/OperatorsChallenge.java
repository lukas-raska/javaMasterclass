package dev.lpa.section4_basics._40;

public class OperatorsChallenge {

    public static void main(String[] args) {

        double a = 20d;
        double b = 80d ;
        double c = (a+b)*100;
        double d = c % 40d;
        boolean e = d == 0;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        if (e){
            System.out.println("Got some remainder");
        }

    }
}
