package com.kannan.arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] nums = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibriumPoint(nums));
    }

    private static int findEquilibriumPoint(int[] arr) {
        int rightSum = 0, leftSum = 0, totalSum = 0;
        for (int a : arr) {
            totalSum += a;
        }
        for (int i = 0; i < arr.length; i++) {
            rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum)
                return i;
            else
                leftSum += arr[i];
        }
        return -1;
    }
}

