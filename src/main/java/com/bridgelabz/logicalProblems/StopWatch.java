package com.bridgelabz.logicalProblems;

import java.sql.SQLOutput;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        System.out.println("Stopwatch is started at:" + startTime);
        System.out.println("Enter any key to stop the stopwatch");
        String a = sc.next();
        long endTime = System.currentTimeMillis();
        System.out.println("Stopwatch is ended at:" + endTime);
        System.out.println("The Stopwatch time elapsed "+(endTime-startTime)+" milliseconds");
    }
}