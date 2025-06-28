package com.kannan.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1, 2};
        System.out.print(Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {
        for(int i=0; i< arr.length -1 ; i++){
            for(int j = i+1; j > 0 ; j--){
                if(arr[j]<arr[j-1]){
                    swapNum(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }

    private static void swapNum(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
