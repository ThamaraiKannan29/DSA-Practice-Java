package com.kannan.binarysearch;

class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5,5};
        System.out.println(singleNonDuplicate(arr));
    }
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(mid % 2==0 && nums[mid] == nums[mid + 1] || mid%2!=0 && nums[mid] == nums[mid -1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}