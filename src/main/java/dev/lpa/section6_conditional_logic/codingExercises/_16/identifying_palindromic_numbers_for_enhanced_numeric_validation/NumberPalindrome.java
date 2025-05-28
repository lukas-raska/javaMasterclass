package dev.lpa.section6_conditional_logic.codingExercises._16.identifying_palindromic_numbers_for_enhanced_numeric_validation;

import java.util.Scanner;

public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

   public static boolean isPalindrome(int number){
       int processed = number ;
       int reverse = 0;
       while (Math.abs(processed)>0){
           int lastDigit = processed%10;
           reverse*=10;
           reverse+=lastDigit;
           processed/=10;
       }
       return number == reverse;
   }
}