package com.kannan.arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
//        System.out.println(findMissingNumZeroIndexed(arr));
        System.out.println(findMissingNumOneIndexed(arr));
    }

    static int findMissingNumZeroIndexed(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && i != correctIndex) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (index != nums[index]) {
                return index;
            }
        }
        return nums.length;
    }


    static int findMissingNumOneIndexed(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int correctIndex = arr[i] - 1;
            if (arr[i] <= n && i != correctIndex) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        for (int index = 0; index < n; index++) {
            if (index + 1 != arr[index]) {
                return index + 1;
            }
        }
        return arr.length + 1;
    }
}


