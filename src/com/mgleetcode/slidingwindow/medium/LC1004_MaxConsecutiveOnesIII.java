package com.mgleetcode.slidingwindow.medium;

public class LC1004_MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        LC1004_MaxConsecutiveOnesIII obj = new LC1004_MaxConsecutiveOnesIII();
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.println(obj.longestOnes(nums, k));
    }

    public int longestOnes(int[] nums, int k) {
        int left = 0, maxlength = 0, zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}
