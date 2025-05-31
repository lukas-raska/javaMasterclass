package dev.lpa.section6_conditional_logic.codingExercises._27.constructing_a_diagonal_star_pattern_with_loops;

public class DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int row = 0; row < number; row++) {
            for (int col = 0; col < number; col++) {
                boolean isOnTheEdge = row == 0 || row == number - 1 || col == 0 || col == number - 1;
                boolean isOnTheDiagonal = row == col || col == number - (row + 1);
                System.out.print(isOnTheEdge || isOnTheDiagonal ? "*" : " ");
            }
            System.out.println();
        }
    }


}

