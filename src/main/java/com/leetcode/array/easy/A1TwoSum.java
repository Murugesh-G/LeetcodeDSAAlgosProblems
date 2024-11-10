package com.leetcode.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A1TwoSum {
    public static void main(String[] args) {
        A1TwoSum obj = new A1TwoSum();
        int[] nums = {3,3};
        int target=6;
        System.out.println(Arrays.toString(obj.twoSum(nums,target)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            int remain = target - nums[i];
            if (map.containsKey(remain)) {
                return new int[]{map.get(remain), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
