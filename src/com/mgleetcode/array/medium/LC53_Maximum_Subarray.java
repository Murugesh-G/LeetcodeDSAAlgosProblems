package com.mgleetcode.array.medium;


public class LC53_Maximum_Subarray {
    public static void main(String[] args) {
        LC53_Maximum_Subarray obj = new LC53_Maximum_Subarray();
        int[] arr = new int[]{-2,-1,-3};
        System.out.println(obj.maxSubArray(arr));
    }

    public int maxSubArray(int[] nums) {
        int maxCurrent = nums[0], maxGlobal = nums[0], arrSize = nums.length;
        for (int i = 1; i < arrSize; i++) {
            /* At each index i, update maxCurrent as the maximum of the current
            element alone or the current element plus the previous sum (maxCurrent) */
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            maxGlobal = Math.max(maxCurrent, maxGlobal);
        }
        return maxGlobal;
    }
}
