package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

public class SumOfNumOfTrippleToZero {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter how many number you enter:");
        int n = sc.nextInt();
        countSumToZero(n);
    }
    public static void countSumToZero(int n){
        int count  = 0;
        int [] arr = new int[n];
        System.out.println("Enter the numbers:");
        for(int i = 0 ;i<n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ;i<arr.length;i++){
            for(int j = i + 1 ; j < arr.length ; j++ ){
                for(int k = j + 1 ; k < arr.length ; k++){
                    if (arr[i] + arr[j] + arr[k] == 0){
                        count ++;
                        System.out.println(arr[i]+" + "+arr[j]+" + "+arr[k]+" = 0");
                    }
                }
            }
        }
        System.out.println("There are "+count+" pairs of sum is 0");
    }
}
