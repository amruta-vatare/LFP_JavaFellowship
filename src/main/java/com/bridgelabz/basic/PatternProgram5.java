package com.bridgelabz.basic;
/*
         *
        * *
       * * *
      * * * *
       * * *
        * *
         *
 */

public class PatternProgram5 {
    public static void main(String[] args) {
        int row = 7, col = 4;
        for (int i = 1; i <= row; i++) {
            if (i > 4) {
                col = 4;
                int space = i - col;
                for (int s = 1; s <= space; s++) {
                    System.out.print(" ");
                    col--;
                }
                for (int k = 1; k <= col; k++) {
                    System.out.print(" " + "*");
                }
                System.out.println();
            } else {
                int space = col - i;
                for (int s = 1; s <= space; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + "*");
                }
                System.out.println();
            }
        }
    }
}
