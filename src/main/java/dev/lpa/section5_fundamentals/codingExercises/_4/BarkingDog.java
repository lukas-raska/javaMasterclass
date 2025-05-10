package dev.lpa.section5_fundamentals.codingExercises._4;

public class BarkingDog {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp(true,1));
        System.out.println(shouldWakeUp(false,2));
        System.out.println(shouldWakeUp(true,-1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean isNight = hourOfDay == 23 || hourOfDay >= 0 && hourOfDay <8;
        return barking && isNight;
    }
}
