package com.bridgelabz.junitTestingProblems;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Square Root of number "+num+" is "+Math.sqrt(num));
    }
}
