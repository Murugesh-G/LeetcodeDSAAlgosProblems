package com.mgleetcode.binarysearch.medium;

/*
TC O(logn)
SC O(1)
*/
public class LC33_SearchinRotatedSortedArray {
    public static void main(String[] args) {
        LC33_SearchinRotatedSortedArray obj = new LC33_SearchinRotatedSortedArray();
        int[] nums = new int[]{1};
        int target = 3;
        System.out.println(obj.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[left]) {
                if (nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
