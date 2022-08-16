package com.bridgelabz.junitTestingProblems;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        float celsius, fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit");
        fahrenheit = sc.nextFloat();
        celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println("Given temperature is "+celsius+" celsius");
        System.out.println("-----------------------------------------");
        System.out.println("Enter the temperature in celsius");
        celsius = sc.nextFloat();
        fahrenheit = (9/5)*celsius+32;
        System.out.println("Given temprature is "+fahrenheit+" fahrenheit");
        sc.close();
    }
}
