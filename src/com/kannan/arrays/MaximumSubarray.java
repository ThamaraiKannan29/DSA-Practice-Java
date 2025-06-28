package com.kannan.arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(findMaxSubarray(nums));
    }

    private static int findMaxSubarray(int[] nums) {
        int currentSum = nums[0];
        int max = nums[0];
        for (int i = 1; i< nums.length; i++) {
            if (currentSum + nums[i] > nums[i]) {
                currentSum += nums[i];
            }else{
                currentSum = nums[i];
            }
            if (currentSum > max) {
                max = currentSum;
            }
        }
        return max;
    }
}
