package com.kannan.arrays;

public class SortArrayDutchNationFlag {
    public static void main(String[] args) {
        int[] nums = {2, 2, 0, 1, 0, 1};
        sortTheArray(nums);
        quickSort(nums, 0, nums.length - 1);
    }

    private static void sortTheArray(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int start = left;
        int end = right;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];
        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (pivot < nums[end]) {
                end--;
            }
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(nums, left, end);
        quickSort(nums, start, right);
    }

}
