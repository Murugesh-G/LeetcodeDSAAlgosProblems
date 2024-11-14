package com.mgleetcode.array.medium;

import java.util.HashMap;
import java.util.Map;

public class M560_Subarray_Sum_Equals_K {
    public static void main(String[] args) {
        M560_Subarray_Sum_Equals_K obj = new M560_Subarray_Sum_Equals_K();
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(obj.subarraySum(nums, k));
    }

    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();

        int count = 0, sum = 0;
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
