package com.kannan.binarysearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170,180,190, 200};
        int target = 200;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] nums, int target){
        int start = 0;
        int end = 1;
        while(target > nums[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return findElementWithinRange(nums,start,end, target);
    }

    private static int findElementWithinRange(int[] nums, int start, int end, int target) {
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

}
