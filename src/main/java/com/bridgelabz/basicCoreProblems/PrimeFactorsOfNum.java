package com.bridgelabz.basicCoreProblems;

import java.util.Scanner;

public class PrimeFactorsOfNum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        getPrimeFactors(num);
    }
    public static void getPrimeFactors(int num){
        boolean foundFactor = false;
        if(isPrime(num))
            System.out.println("Given number "+num+" is itself Prime Number");
        for(int x = 2;x<num-1;x++){
                if(foundFactor)
                    break;
            for(int y = 1;y<num-1;y++){
                if(x*y==num){
                    foundFactor=true;
                    if(isPrime(x) & isPrime(y)){
                        System.out.print(" "+x);
                        System.out.print(" "+y);
                    }else if(isPrime(x)){
                        System.out.print(" "+x);
                        getPrimeFactors(y);
                    }else if(isPrime(y)){
                        System.out.print(" "+y);
                        getPrimeFactors(x);
                    }else {
                        getPrimeFactors(x);
                        getPrimeFactors(y);
                    }
                }else{
                    continue;
                }
            }
        }

    }

    public static boolean isPrime(int n){
        int i;
        boolean flag = false;
        for(i = 2; i<=n/2;i++){
            if(n%i==0){
               flag = true;
            }
        }
        if(!flag){
            return true;
        }
        return false;
    }
}
