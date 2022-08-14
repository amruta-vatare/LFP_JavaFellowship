package com.bridgelabz.basicCoreProblems;

import java.util.Scanner;

public class CheckEvenOddNum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value to check Even or odd");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Given num is Even");
        }else{
            System.out.println("Given num is odd");
        }
    }
}
