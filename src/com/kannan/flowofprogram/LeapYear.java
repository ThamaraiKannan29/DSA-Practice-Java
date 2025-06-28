package com.kannan.flowofprogram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Input a year and find whether it is a leap year or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check Leap year or not");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a Leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a Leap year");
        }
    }
}
