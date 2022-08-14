package com.bridgelabz.basicCoreProblems;

import java.util.Scanner;

public class CalculatePowerOfTwo {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the power value to find power of two");
        int num = sc.nextInt();
        calculatePower(num);
    }
    public static void calculatePower(int num){
        int  result = 0;
        int pow;
        if(num == 0)
            System.out.println(2);
        if(num>=31)
            System.out.println("The power "+num+" of 2 is overflow please enter less value");
        if(num<31){
            for(pow = 1;pow<=num;pow++){
                if(pow == 31){
                    break;
                }
                result = (int)Math.pow(2,pow);
                System.out.println("Power "+pow+" of 2 is :"+result);
            }
        }
    }
}
