package com.bridgelabz.functionalPrograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        double t = sc.nextDouble();
        System.out.println("Enter the wind speed in miles per hour");
        double s = sc.nextDouble();
        if(Math.abs(t)<50 || s > 3 || s < 120){
            windChill(t,s);
        }else{
            System.out.println("Incorrect inputs of temperature and wind speed");
        }
    }

    public static void windChill(double t , double s){
        double v =  35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(s, 0.16);
        System.out.printf("%f", v);
    }
}
