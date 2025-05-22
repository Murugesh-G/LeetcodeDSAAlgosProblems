package com.mgleetcode.prefixsum.easy;

public class LC303_RangeSumQueryImmutable {
    public static void main(String[] args) {
        NumArray obj = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        int param_1 = obj.sumRange(0, 5);
        System.out.println(param_1);
    }


}
/* O(N)ForInitialization,O(1)ForSumrangeQuery */
class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefixSum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

    }

    public int sumRange(int left, int right) {
        return prefixSum[right + 1] - prefixSum[left];
    }
}