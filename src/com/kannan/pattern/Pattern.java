package com.kannan.pattern;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);

    }

    private static void printPattern(int n) {
        for (int row = 1; row < n * 2; row++) {
            int totalCols = row > n ? (2 * n) - row : row;
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
