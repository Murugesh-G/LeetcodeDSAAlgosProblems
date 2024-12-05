package com.mgleetcode.hashing.easy;

import com.mgleetcode.Main;

import java.util.HashSet;
import java.util.Set;

public class LC219_Contains_Duplicate_II {
    public static void main(String[] args) {
        LC219_Contains_Duplicate_II obj = new LC219_Contains_Duplicate_II();
        int[] arr = new int[]{1,2,3,1,2,3};
        System.out.println(obj.containsNearbyDuplicate(arr,2));
    }


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k)
                set.remove(nums[i - k - 1]);

            if (!set.add(nums[i]))
                return true;
        }

        return false;
    }
}

