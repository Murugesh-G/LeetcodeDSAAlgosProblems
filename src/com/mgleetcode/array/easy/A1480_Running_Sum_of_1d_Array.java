package com.mgleetcode.array.easy;

import java.util.Arrays;

public class A1480_Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        A1480_Running_Sum_of_1d_Array obj = new A1480_Running_Sum_of_1d_Array();
        int[] arr = new int[]{3,1,2,10,1};
        System.out.println(Arrays.toString(obj.runningSum(arr)));
    }

    public int[] runningSum(int[] nums) {
        if (nums.length == 1) return nums;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
