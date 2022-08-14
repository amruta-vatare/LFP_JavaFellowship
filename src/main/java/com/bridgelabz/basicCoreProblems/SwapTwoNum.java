package com.bridgelabz.basicCoreProblems;

public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 20;
        int b = 80;
        System.out.println("A without swap:-"+a);
        System.out.println("B without swap:-"+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A After swapping:-"+a);
        System.out.println("B After swapping:-"+b);
    }
}
