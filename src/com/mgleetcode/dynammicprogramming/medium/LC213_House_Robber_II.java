package com.mgleetcode.dynammicprogramming.medium;

import java.util.Arrays;

/*
TC O(n)
SC O(1)
*/
public class LC213_House_Robber_II {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,2};
        LC213_House_Robber_II obj = new LC213_House_Robber_II();
        System.out.println(obj.rob(arr));
    }

    public int rob(int[] nums) {
        return Math.max(nums[0],
                Math.max(helperMax(Arrays.copyOfRange(nums, 0, nums.length - 1)), helperMax(Arrays.copyOfRange(nums, 1, nums.length))));
    }

    int helperMax(int[] nums) {
        int rob1 = 0, rob2 = 0;

        for (int num : nums) {
            int temp = Math.max(num + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
