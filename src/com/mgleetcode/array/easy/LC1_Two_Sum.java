package com.mgleetcode.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1_Two_Sum {
    public static void main(String[] args) {
        LC1_Two_Sum obj = new LC1_Two_Sum();
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
