package com.kannan.binarysearch;

public class SearchInRotatedNonDistinct {

    public static void main(String[] args) {
        int [] arr = {1,3};
        System.out.println(search(arr,1));
    }
    static int search(int[] nums, int target) {
        int pivot = nums.length -1;
        if(nums[0] > nums[nums.length -1]){
            pivot = findPivot(nums);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        int leftSearch = searchInRange(nums,0,pivot,target);
        if(leftSearch==-1){
            return searchInRange(nums,pivot + 1, nums.length -1 ,target);
        }
        return leftSearch;
    }

    private static int searchInRange(int[] arr, int start, int end, int target) {
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] nums) {
        int start =0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (nums[mid] < nums[mid -1]) {
                return mid - 1;
            } else if (nums[mid] > nums[end]) {
                start = mid + 1;
            }
            else{
                end  = mid -1;
            }
        }
        return -1;
    }
}
