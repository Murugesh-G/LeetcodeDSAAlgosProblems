package com.mgleetcode.hashtable.medium;

import java.util.HashMap;
import java.util.Map;

public class LC1679_MaxNumberofKSumPairs {
    public static void main(String[] args) {
        LC1679_MaxNumberofKSumPairs obj = new LC1679_MaxNumberofKSumPairs();
        int[] array = {4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4};
        int k = 2;
        System.out.println(obj.maxOperations(array, k));

    }

    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            if (map.containsKey(k - num) && map.get(k - num) > 0) {
                count++;
                map.put(k - num, map.getOrDefault(k - num, 0) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        return count;
    }

}
