package dev.lpa.section6_conditional_logic._71.readingUserInput;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {

        int currentYear = 2025;
//        String userYearOfBirth = "1982";
//
//        int dateOfBirth = Integer.parseInt(userYearOfBirth);
//
//        System.out.println("Age = " + (currentYear - dateOfBirth));
//
//        String userAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(userAgeWithPartialYear);
//        System.out.println("The user says he's " + ageWithPartialYear);


        System.out.println(getInputFromConsole(currentYear));

        System.out.println(getInputFromScanner(currentYear));


    }

    public static String getInputFromConsole(int currentYear){
String name = System.console().readLine(("Hi, what is your name? "));
        System.out.println("Hi " + name + ", thanks for taking the course!");
        var dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "You are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear){

        return "";
    }
}
