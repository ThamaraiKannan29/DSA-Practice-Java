package com.kannan.javabasic;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int numOfDigits = String.valueOf(num).length();
        int sumOfDigits = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sumOfDigits = (int) (sumOfDigits + Math.pow(lastDigit, numOfDigits));
            num /= 10;
        }
        if(temp == sumOfDigits){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }

    }
}
