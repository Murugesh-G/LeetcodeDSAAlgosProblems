package com.mgleetcode.prefixsum.medium;

import java.util.HashMap;
import java.util.Map;

public class LC525_ContiguousArray {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 1, 1, 1, 0, 0, 0};
        LC525_ContiguousArray obj = new LC525_ContiguousArray();
        System.out.println(obj.findMaxLength(arr));

    }

    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int subArrayLen = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i] == 0 ? -1 : 1;
            if (sum == 0) {
                subArrayLen = i + 1;
            } else if (map.containsKey(sum)) {
                subArrayLen = Math.max(subArrayLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return subArrayLen;
    }
}
