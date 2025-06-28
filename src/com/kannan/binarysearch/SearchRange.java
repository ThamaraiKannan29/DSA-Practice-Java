package com.kannan.binarysearch;

import java.util.Arrays;

class SearchRange {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
    private static int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findTheOccurrence(nums, target, true);
        if(firstOccurrence!=-1){
            return new int[]{firstOccurrence, findTheOccurrence(nums, target, false)};
        }
        return new int[]{-1,-1};
    }

    private static int findTheOccurrence(int[] nums, int target, boolean b) {
        int start = 0;
        int end = nums.length -1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
            else{
                ans = mid;
                if(b){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}