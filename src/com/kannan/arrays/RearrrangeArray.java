package com.kannan.arrays;

import java.util.Arrays;

public class RearrrangeArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] nums = {-3, -2, 4, 5, -1, 6};
        reArrangeInPlace(arr);
        System.out.print(Arrays.toString(reArrangeSign(nums)));
    }

    private static int[] reArrangeSign(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posIndex = 0;
        int negIndex = 1;
        for (int num : nums) {
            if (num >= 0) {
                ans[posIndex] = num;
                posIndex += 2;
            } else {
                ans[negIndex] = num;
                negIndex += 2;
            }
        }
        return ans;
    }

    private static void reArrangeInPlace(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int maxId = n - 1;
        int minId = 0;
        int max = arr[n - 1] + 1;
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 0) {
                arr[i] = arr[i] + (arr[maxId] % max) * max;
                maxId--;
            } else {
                arr[i] = arr[i] + (arr[minId] % max) * max;
                minId++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / max;
        }
    }
}
