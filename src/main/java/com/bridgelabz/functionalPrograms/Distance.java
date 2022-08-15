package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Co-ordinate x");
        int x = sc.nextInt();
        System.out.println("Enter the Co-ordinate y");
        int y = sc.nextInt();
        calculate(x,y);
    }
    public static void  calculate(int x,int y){
        System.out.println("Euclidean distance from the point "+"("+x+", "+y+")" +" to the origin (0, 0) : "+Math.pow(x*x+y*y,0.5));
    }
}
