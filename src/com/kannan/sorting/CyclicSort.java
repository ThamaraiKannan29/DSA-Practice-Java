package com.kannan.sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 1, 4};
        System.out.println(Arrays.toString(sortArray(arr)));
    }

    static int[] sortArray(int[] arr) {
        int i = 0;

        int n = arr.length;
        while (i < n) {
            int correctIndexValue = arr[i] ;
            if (i == correctIndexValue) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[correctIndexValue];
                arr[correctIndexValue] = temp;
            }
        }
        return arr;
    }
}
