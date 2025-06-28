package com.kannan.recursion;

public class PrintOneToN {
    public static void main(String[] args) {
        int n = 5;
        printNos(n);
    }

//    public static void printNos(int n) {
//        // Your code here
//       printNums(1,n);
//    }

    public static void printNos(int n) {
        // Your code here
        if(n==0){
            return;
        }
        printNos(n-1);
        System.out.print(n+" ");
    }

    private static void printNums(int i, int n) {
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        printNums(i+1,n);
    }
}
