package com.bridgelabz.basic;

    /*  1
        12
        123
        1234
        12345
        1234
        123
        12
        1*/
public class PatternProgram2 {
    public static void main(String[] args) {
        int row = 9;
        for (int col = 1; col <= row; col++) {
            if (col <= 5) {
                for (int j = 1; j <= col; j++) {
                    System.out.print(j);
                }
                System.out.println();
            } else {
                int n = row - col;
                for (int k = 1; k <= n + 1; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}
