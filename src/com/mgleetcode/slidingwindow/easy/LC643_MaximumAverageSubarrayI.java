package com.mgleetcode.slidingwindow.easy;

public class LC643_MaximumAverageSubarrayI {
    public static void main(String[] args) {
        LC643_MaximumAverageSubarrayI obj = new LC643_MaximumAverageSubarrayI();
        int[] nums = {5};
        int k = 1;
        System.out.println(obj.findMaxAverage(nums, k));
    }

    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum * 1.0 / k;
    }
}
