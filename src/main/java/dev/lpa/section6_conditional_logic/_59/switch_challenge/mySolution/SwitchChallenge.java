package dev.lpa.section6_conditional_logic._59.switch_challenge.mySolution;

public class SwitchChallenge {

    public static void main(String[] args) {

        char letter = 'G';

        switch(letter){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Letter " + letter + " was not found in the switch");

        }
    }
}
