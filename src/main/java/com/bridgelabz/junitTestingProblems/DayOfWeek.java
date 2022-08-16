package com.bridgelabz.junitTestingProblems;
import jdk.jshell.execution.Util;

import java.time.LocalDate;
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int y = sc.nextInt();
        System.out.println("Enter the month");
        int m = sc.nextInt();
        System.out.println("Enter the day");
        int d = sc.nextInt();
        LocalDate ld = LocalDate.of(y,m,d);
        System.out.println("Date is : "+ld+" Day of week is "+ld.getDayOfWeek());
    }
}
