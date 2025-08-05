package com.mgleetcode.array.medium;

/*
TC O(N)
SC O(1)
    The right pointer goes from 0 to n - 1: O(n)

    The left pointer only moves forward (never resets), so over the entire execution, left also moves at most n steps: O(n)

    Each element is processed at most twice — once by right and once by left.
*/
public class LC713_SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        int k = 0;
        LC713_SubarrayProductLessThanK obj = new LC713_SubarrayProductLessThanK();
        System.out.println(obj.numSubarrayProductLessThanK(nums, k));
    }

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int left = 0, right = 0, prod = 1, count = 0;

        for (right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k && left <= right) {
                prod /= nums[left];
                left++;
            }
            count = count + (right - left + 1);
        }
        return count;
    }
}
