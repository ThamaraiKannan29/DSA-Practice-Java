package com.kannan.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class CountLeaders {
    public static void main(String[] args) {
        int [] nums = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list = arrayLeaders(nums);
        System.out.println(list);
    }

    private static ArrayList<Integer> arrayLeaders(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        list.add(max);
        for(int i = n-2; i>=0; i-- ){
            if(arr[i]>=max){
                list.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(list);
        return list;
    }
}
