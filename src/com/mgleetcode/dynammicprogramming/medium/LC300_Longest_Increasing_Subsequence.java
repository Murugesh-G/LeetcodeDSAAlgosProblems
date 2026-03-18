package com.mgleetcode.dynammicprogramming.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
TC O(NlogN)
SC O(N)
*/
public class LC300_Longest_Increasing_Subsequence {

    public static void main(String[] args) {
        LC300_Longest_Increasing_Subsequence obj = new LC300_Longest_Increasing_Subsequence();
        int[] arr = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(obj.lengthOfLIS(arr));
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);

        for (int i = 1; i < n; i++) {
            if (nums[i] > temp.get(temp.size() - 1)) {
                temp.add(nums[i]);
            } else {
                int idx = Collections.binarySearch(temp, nums[i]);
                if (idx < 0)
                    idx = -(idx + 1);

                temp.set(idx, nums[i]);
            }
        }
        return temp.size();
    }
}
