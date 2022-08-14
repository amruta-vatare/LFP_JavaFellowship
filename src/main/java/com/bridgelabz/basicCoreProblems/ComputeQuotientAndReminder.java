package com.bridgelabz.basicCoreProblems;

import java.util.Scanner;

public class ComputeQuotientAndReminder {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Dividend");
        int dividend = sc.nextInt();
        System.out.println("Enter the Divisor");
        int divisor = sc.nextInt();
        int quotient =  dividend/divisor;
        int reminder = dividend%divisor;
        System.out.println(dividend+"/"+divisor+" = Quotient= "+quotient+" Reminder= "+reminder);
    }
}
