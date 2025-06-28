package com.kannan.conditional.loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int sumOfNegative = 0, sumOfPositive = 0, sumOfPositiveOdd = 0;
        while (true) {
            int n = sc.nextInt();
            if (n < 0)
                sumOfNegative += n;
            if (n > 0)
                sumOfPositive += n;
            if (n > 0 && n % 2 != 0)
                sumOfPositiveOdd += n;
            if (n == 0)
                break;
        }
        System.out.println("Sum of Negative numbers : " + sumOfNegative);
        System.out.println("Sum of Positive numbers : " + sumOfPositive);
        System.out.println("Sum of Positive Odd numbers : " + sumOfPositiveOdd);
    }
}
