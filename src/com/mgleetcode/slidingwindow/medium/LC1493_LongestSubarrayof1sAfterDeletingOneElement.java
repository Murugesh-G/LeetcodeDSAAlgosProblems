package com.mgleetcode.slidingwindow.medium;

public class LC1493_LongestSubarrayof1sAfterDeletingOneElement {
    public static void main(String[] args) {
        LC1493_LongestSubarrayof1sAfterDeletingOneElement obj = new LC1493_LongestSubarrayof1sAfterDeletingOneElement();
        System.out.println(obj.longestSubarray(new int[]{1,1,1}));
    }

    public int longestSubarray(int[] nums) {
        int left = 0, maxLength = 0, zeroCount = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left);
        }
        return maxLength;
    }
}
