package dev.lpa.section6_conditional_logic.codingExercises._25.managing_flour_pack_requirements_with_limited_bucket_sizes;

public class FlourPacker {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));


    }

    public static boolean canPack(int bigCount,
                                  int smallCount,
                                  int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        return Math.min(goal / 5, bigCount) * 5 + smallCount >= goal;
    }
}
