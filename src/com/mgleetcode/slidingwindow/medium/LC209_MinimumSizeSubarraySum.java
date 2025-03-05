package com.mgleetcode.slidingwindow.medium;

public class LC209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        LC209_MinimumSizeSubarraySum obj = new LC209_MinimumSizeSubarraySum();
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        System.out.println(obj.minSubArrayLen(target, nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int curSum = 0, minLen = Integer.MAX_VALUE, left = 0;

        for (int right = 0; right < nums.length; right++) {
            curSum += nums[right];
            while (curSum >= target) {
                if (right - left + 1 < minLen)
                    minLen = right - left + 1;
                curSum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
