package com.bridgelabz.junitTestingProblems;

import jdk.jshell.execution.Util;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Year to pay off");
        int Y = sc.nextInt();
        System.out.println("Enter Principle loan amount ");
        int P = sc.nextInt();
        System.out.println("Enter monthly interest rate");
        int R = sc.nextInt();
        calculateMonthlyPayment(Y,P,R);
    }

    private static void calculateMonthlyPayment(int Y, int P, int R) {
        double n = 12 * Y;
        double r = R / (12 * 100);
        double payment = P * r / (1 - Math.pow((1 + r), -n));
        System.out.println("Monthly Payment is :"+payment);

    }
}
