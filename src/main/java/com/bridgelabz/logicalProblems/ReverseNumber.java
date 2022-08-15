package com.bridgelabz.logicalProblems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        reverseNum(num);
    }

    private static void reverseNum(int num) {
        int reverse = 0;
        while(num!=0){
            int reminder = num%10;
            reverse = reminder+reverse*10;
            num = num /10;
        }
        System.out.println(reverse);

    }


}
