package com.mgleetcode.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

public class LC217_Contains_Duplicate {
    public static void main(String[] args) {
        LC217_Contains_Duplicate obj = new LC217_Contains_Duplicate();
        int[] arr = new int[]{1, 2, 3, 4,1};
        System.out.println(obj.containsDuplicate(arr));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            boolean flag = set.add(num);
            if (!flag)
                return true;
        }
        return false;
    }
}
