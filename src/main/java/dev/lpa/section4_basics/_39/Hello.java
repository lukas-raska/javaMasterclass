package dev.lpa.section4_basics._39;

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, Tim");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;

        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        //ternary operator

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This cas i domestic to our country");
        }

        isDomestic = true;
        String s = (isDomestic) ? "This car is domestic." : "This car is not domestic";
        String s1 = "This car is %s domestic".formatted(isDomestic ? "\b" : "not");

        System.out.println(s);

        System.out.println(s1);


    }
}
