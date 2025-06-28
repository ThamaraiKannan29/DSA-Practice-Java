package com.kannan.arrays;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.print(subArraySum(arr, target));
    }

    private static ArrayList<Integer> subArraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int s = 0;
        int sum = 0;
        for (int e = 0; e < arr.length; e++) {
            sum += arr[e];

            while (sum > target && s <= e) {
                sum -= arr[s];
                s++;
            }

            if (sum == target) {
                ans.add(s + 1);
                ans.add(e + 1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}
