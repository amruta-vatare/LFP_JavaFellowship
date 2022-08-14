package com.bridgelabz.basicCoreProblems;

import java.util.Scanner;

public class IsItLeapYear {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        checkLeapYear(year);
    }
    public static void checkLeapYear(int y){
        int a = y%400;
        int b = y%4;
        int c = y%100;
        if(a == 0 || (b == 0 && c != 0) ){
            System.out.println("Given year is leap year");
        }else{
            System.out.println("Given year is not leap year");
        }
    }
}
