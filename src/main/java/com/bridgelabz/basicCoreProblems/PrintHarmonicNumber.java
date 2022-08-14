package com.bridgelabz.basicCoreProblems;

import java.util.Scanner;

public class PrintHarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for evaluating harmonic value:-");
        int num = sc.nextInt();
        double result = 0.0;
        for(double i = 1; i<=num;i++){
            result = result+1/i;
        }
        System.out.printf("The Harmonic Value of the given number "+num+" is %f",result);
    }
}
