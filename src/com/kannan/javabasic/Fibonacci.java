package com.kannan.javabasic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0,b=1;
        System.out.println(a);
        System.out.println(b);
        while(n>2){
            int fa = a+b;
            a = b;
            b= fa;
            System.out.println(fa);
            n--;
        }
    }
}
