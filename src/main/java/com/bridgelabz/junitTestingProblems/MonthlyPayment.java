package com.bridgelabz.junitTestingProblems;

import jdk.jshell.execution.Util;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Year to pay off");
        int Y = sc.nextInt();
        System.out.println("Enter the Principle loan amount ");
        int P = sc.nextInt();
        System.out.println("Enter the Compounded monthly interest rate");
        int R = sc.nextInt();
        calculateMonthlyPayment(Y,P,R);
    }

    private static void calculateMonthlyPayment(int Y, int P, int R) {
        int n = 12 * Y;
        int r = R/(12*100);

    }
}
