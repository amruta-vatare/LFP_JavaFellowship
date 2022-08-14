package com.bridgelabz.basicCoreProblems;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FindLargeNumOutOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the three values");
        System.out.print("A: ");
        a = sc.nextInt();
        System.out.print("B: ");
        b = sc.nextInt();
        System.out.print("C: ");
        c = sc.nextInt();
        int d = c > ( a > b ? a : b ) ? c : ( a > b ? a : b );
        System.out.println("Max Value is : "+d);
    }
}
