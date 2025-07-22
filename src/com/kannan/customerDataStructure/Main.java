package com.kannan.customerDataStructure;

public class Main {
    public static void main(String[] args) {
        CustomArrayList arr = new CustomArrayList();
        arr.add(10);
        arr.add(12);
        arr.add(10);
        arr.add(18);
        arr.add(12);
        System.out.println(arr.size());
        System.out.println(arr);
        System.out.println(arr.remove());
        System.out.println(arr.size());
        System.out.println(arr);
    }
}
