package com.mgleetcode.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

public class LC1512_NumberofGoodPairs {
    public static void main(String[] args) {
        LC1512_NumberofGoodPairs obj = new LC1512_NumberofGoodPairs();
        int[] nums = new int[]{1,2,3};
        System.out.println(obj.numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (map.containsKey(num))
                count += map.get(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}
