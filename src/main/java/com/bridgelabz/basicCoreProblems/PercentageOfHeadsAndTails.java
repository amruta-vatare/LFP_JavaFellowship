package com.bridgelabz.basicCoreProblems;

import java.util.Random;
import java.util.Scanner;

public class PercentageOfHeadsAndTails {
    static Random r = new Random();
    static int hcnt = 0, tcnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many times you want to flip a coin!");
        int n = sc.nextInt();
        getRandomValue(n);
        System.out.println("Coin flips " + n + " times");
        System.out.println("Heads counts is :" + hcnt + " Tails couunts is :" + tcnt);

        float TailPercentage = (((float) tcnt / (float) n) * 100);
        float HeadPercentage = (((float) hcnt / (float) n) * 100);

        System.out.println("Percentage of Tail is : ");
        System.out.printf("%.2f", TailPercentage);
        System.out.println();
        System.out.println("Percentage of Head is :");
        System.out.printf("%.2f", HeadPercentage);
    }

    public static void getRandomValue(int n) {
        int min = 0, max = 1;
        float result = 0;
        for (int i = 0; i < n; i++) {
            float randomNum = r.nextFloat(max - min);
            result = randomNum + min;
            checkResult(result);
        }

    }

    public static void checkResult(float result) {
        if (result < 0.5) {
            tcnt++;
            System.out.println("Tail " + tcnt);
        } else {
            hcnt++;
            System.out.println("Head " + hcnt);
        }
    }
}
