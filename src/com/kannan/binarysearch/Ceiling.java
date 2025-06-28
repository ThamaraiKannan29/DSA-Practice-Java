package com.kannan.binarysearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,15,16,18};
        int target = 15;
        System.out.println(findCeiling(nums,target));
    }

    static int findCeiling(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid -1 ;
            }
            else {
                start = mid +1;
            }
        }
        return start;
    }
}
