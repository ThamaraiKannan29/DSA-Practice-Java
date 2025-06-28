package com.kannan.sorting;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(sortArray(arr));
    }

    static int sortArray(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
                int correctIndexValue = arr[i];
                if (arr[i] < n && arr[i] != arr[correctIndexValue] ) {
                    int temp = arr[i];
                    arr[i] = arr[correctIndexValue];
                    arr[correctIndexValue] = temp;
                } else if(arr[i] == arr[correctIndexValue]) {
                    return arr[i];
                }else {
                    i++;
                }
        }
        return arr.length;
    }
}
