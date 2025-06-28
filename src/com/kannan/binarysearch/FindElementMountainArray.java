package com.kannan.binarysearch;

public class FindElementMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 4, 5, 3, 2, 1};
        int target = 2;
        int peakIndex = findPeakElement(arr);
        int leftSearch = findMinimumTargetIndex(arr, target, 0, peakIndex);
        if (leftSearch != -1) {
            System.out.println(leftSearch);
        } else {
            System.out.println(findMinimumTargetIndex(arr, target, peakIndex + 1, arr.length - 1));
        }
    }

    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int findMinimumTargetIndex(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
