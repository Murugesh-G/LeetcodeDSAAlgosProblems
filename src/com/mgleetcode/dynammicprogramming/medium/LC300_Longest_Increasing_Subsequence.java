package com.mgleetcode.dynammicprogramming.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC300_Longest_Increasing_Subsequence {

    public static void main(String[] args) {
        LC300_Longest_Increasing_Subsequence obj = new LC300_Longest_Increasing_Subsequence();
        int[] arr = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(obj.lengthOfLIS(arr));
    }

    public int lengthOfLIS(int[] nums) {
        List<Integer> dp = new ArrayList<>();
        dp.add(nums[0]);

        int LIS = 1;
        for (int i = 1; i < nums.length; i++) {
            if (dp.get(dp.size() - 1) < nums[i]) {
                dp.add(nums[i]);
                LIS++;
                continue;
            }

            int idx = Collections.binarySearch(dp, nums[i]);
            if (idx < 0) idx = -idx - 1;
            dp.set(idx, nums[i]);
        }

        return LIS;
    }
}
