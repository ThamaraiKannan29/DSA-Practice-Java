package com.kannan.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1, 2};
        System.out.print(Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = findMinimum(arr, i);
            int max = findMax(arr, arr.length - i - 1);
//            swapNum(arr, min, i);
            swapNum(arr, max , arr.length - i -1);
        }
        return arr;
    }

    private static int findMax(int[] arr, int last) {
        int max = last;
        for (int i = 0; i <= last; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    private static int findMinimum(int[] arr, int start) {
        int min = start;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }


    private static void swapNum(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
