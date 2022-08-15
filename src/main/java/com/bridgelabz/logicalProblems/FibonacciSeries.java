package com.bridgelabz.logicalProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which print fibonacci series");
        int num = sc.nextInt();
        PrintFibonacci(num);

    }

    private static void PrintFibonacci(int num) {
        int firstNum = 1, secondNum = 1;
        int [] fibonacci = new int[num];
        fibonacci[0] = firstNum;
        fibonacci[1] = secondNum;
        for(int i = 2 ; i<num; i++){
            fibonacci[i] = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = fibonacci[i];
        }

        for (int i = 0; i<num;i++){
            System.out.print(fibonacci[i]+" ");
        }
    }
}
