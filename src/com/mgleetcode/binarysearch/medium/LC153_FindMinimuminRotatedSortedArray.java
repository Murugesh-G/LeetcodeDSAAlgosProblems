package com.mgleetcode.binarysearch.medium;

public class LC153_FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 1, 2};
        LC153_FindMinimuminRotatedSortedArray obj = new LC153_FindMinimuminRotatedSortedArray();
        System.out.println(obj.findMin(nums));
    }

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1, mid = 0;

        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
