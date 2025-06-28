package com.kannan.flowofprogram;

import java.util.Scanner;

public class SumOfAll {
    public static void main(String[] args) {
        // Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String add = sc.next();
            if (add.charAt(0) == 'x') {
                break;
            }
            sum = sum + Integer.parseInt(add);
        }
        System.out.println("Sum of all :" + sum);
    }
}
