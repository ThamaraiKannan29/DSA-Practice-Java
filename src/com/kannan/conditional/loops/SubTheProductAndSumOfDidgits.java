package com.kannan.conditional.loops;

import java.util.Scanner;

public class SubTheProductAndSumOfDidgits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        System.out.println(" Sub of product and sum of the digits : " + findTheProductAndSumOfDigit(num));
    }

    private static int findTheProductAndSumOfDigit(int digit) {
        int lastDidgit;
        int productOfDigits = 1, sumOfDigits = 0;
        while(digit>0){
            lastDidgit = digit % 10;
            sumOfDigits += lastDidgit;
            productOfDigits *= lastDidgit;
            digit /= 10;
        }
        System.out.println("Product of digits : " + productOfDigits );
        System.out.println("Sum of digits : " + sumOfDigits );
         return findSubOfProductAndSum(sumOfDigits , productOfDigits);
    }

    private static int findSubOfProductAndSum(int sum , int product) {
        return product - sum;
    }
}
