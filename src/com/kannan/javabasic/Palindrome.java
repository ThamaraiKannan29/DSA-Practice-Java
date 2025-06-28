package com.kannan.javabasic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        StringBuilder str2 = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
             str2.append(str.charAt(i));
        }
        System.out.println("Reversed String : " + str2);
        if (str.contentEquals(str2)) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
