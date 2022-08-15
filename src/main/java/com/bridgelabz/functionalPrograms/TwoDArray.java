package com.bridgelabz.functionalPrograms;

import java.io.PrintWriter;
import java.sql.Array;
import java.util.Scanner;

public class TwoDArray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter Number of row");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();
        int [][] intArr = intArray(r,c);
        double [][] doubleArr = doubleArray(r,c);
        String [][] stringArr = BoolanArray(r,c);

        display(intArr, doubleArr, stringArr,r,c);

    }

    public static int[][] intArray(int r , int c){
        System.out.println("Enter the "+r*c+" values for integer array");
        int [][]a = new int[r][c];
        for(int i = 0 ;i < r;i++){
            for(int j = 0 ;j < c ;j++ ){
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    public static double[][] doubleArray(int r , int c){
        double [][]b = new double[r][c];
        System.out.println("Enter the "+r*c+" values for double array");
        for(int i = 0 ;i < r;i++){
            for(int j = 0 ;j < c ;j++ ){
                b[i][j] = sc.nextDouble();
            }
        }
        return b;
    }
    public static String [][] BoolanArray(int r , int c){
        String [][] d = new String [r][c];
        System.out.println("Enter the "+r*c+" values for boolean array in true/false");
        for(int i = 0 ;i < r;i++){
            for(int j = 0 ;j < c ;j++ ){
                d[i][j] = sc.next();
            }
        }
        return d;
    }

    public static void display(int intArray[][],double doubleArray[][],String stringArray[][],int r, int c ){
        PrintWriter writer = new PrintWriter(System.out,true);
        writer.println("2D-Integer Array");
        for(int i = 0 ;i < r;i++){
            for(int j = 0 ;j < c ; j++){
                writer.print("\t"+intArray[i][j]+" ");
            }
            writer.println("\t");
        }

        writer.println("2D-Double Array");
        for(int i = 0 ;i < r;i++){
            for(int j = 0 ;j < c ; j++){
                writer.print("\t"+doubleArray[i][j]+" ");
            }
            writer.println("\t");
        }

        writer.println("2D-Boolean Array");
        for(int i = 0 ;i < r;i++){
            for(int j = 0 ;j < c ; j++){
                writer.print("\t"+stringArray[i][j]+" ");
            }
            writer.println("\t");
        }
    }
}
