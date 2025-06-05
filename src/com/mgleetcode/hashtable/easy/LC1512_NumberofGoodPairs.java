package com.mgleetcode.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

public class LC1512_NumberofGoodPairs {
    public static void main(String[] args) {
        LC1512_NumberofGoodPairs obj = new LC1512_NumberofGoodPairs();
        int[] nums = new int[]{1, 1,1,1};
        System.out.println(obj.numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> pairs = new HashMap<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (pairs.containsKey(nums[i])) {
                count += pairs.get(nums[i]);
            }
            pairs.put(nums[i], pairs.getOrDefault(nums[i], 0) + 1);
        }

        return count;
    }
}
