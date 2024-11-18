package com.mgleetcode.array.medium;

import java.util.Arrays;

public class LC167_Two_Sum_II_Input_Array_Is_Sorted {
    public static void main(String[] args) {
        LC167_Two_Sum_II_Input_Array_Is_Sorted obj = new LC167_Two_Sum_II_Input_Array_Is_Sorted();
        int[] nums = {-1,0};
        int target = -1;
        System.out.println(Arrays.toString(obj.twoSum(nums,target)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target)
                right--;
            else
                left++;
        }
        return new int[]{++left, ++right};
    }
}
