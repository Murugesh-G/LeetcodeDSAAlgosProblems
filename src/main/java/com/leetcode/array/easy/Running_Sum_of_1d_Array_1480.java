package com.leetcode.array.easy;

import java.util.Arrays;

public class Running_Sum_of_1d_Array_1480 {
    public static void main(String[] args) {
        Running_Sum_of_1d_Array_1480 obj = new Running_Sum_of_1d_Array_1480();
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
