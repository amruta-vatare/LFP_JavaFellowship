package com.bridgelabz.logicalProblems;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        checkPrime(num);
    }

    private static void checkPrime(int num) {
        boolean flag = false;
        if(num == 1 || num == 0){
            flag = true;
        }
        for(int i =2;i<num/2;i++){
            if(num%i == 0){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Given number "+num+" is prime number");
        }else{
            System.out.println("Given number "+num+" is not prime number");
        }
    }
}
