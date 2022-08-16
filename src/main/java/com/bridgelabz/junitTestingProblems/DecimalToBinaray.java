package com.bridgelabz.junitTestingProblems;

import java.util.Scanner;

public class DecimalToBinaray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to convert into binary");
        int num = sc.nextInt();
        System.out.println(Integer.toBinaryString(num));
        String a = Integer.toBinaryString(num);
        int len = a.length();
        String fStr = a.substring(0,len/2);
        String sStr = a.substring(len/2);
        String finalStr = sStr.concat(fStr);
        System.out.println("Binary number after swapping the nibbles "+fStr+","+sStr+" is :"+finalStr);
        int decimalOfBinary = Integer.parseInt(finalStr,2);
        System.out.println("Decimal of binary number "+finalStr+" is "+decimalOfBinary);

    }
}
