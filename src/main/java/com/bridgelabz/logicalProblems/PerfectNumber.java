package com.bridgelabz.logicalProblems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        checkPerfect(num);
    }
    public static void checkPerfect(int num){
        int [] result = new int[num];
        int cnt = 0,sum = 0;
        for(int i = 1; i<num;i++){
            if(num%i==0){
                sum = sum + i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        if(sum == num) {
            System.out.println(num+" is perfect Number");
        }else{
            System.out.println(num+" is not perfect Number");
        }

            /*for(int i = 0 ;i<result.length-1;i++){
                System.out.print(result[i]+" ");
            }*/
    }
}
