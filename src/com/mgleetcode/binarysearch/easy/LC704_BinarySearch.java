package com.mgleetcode.binarysearch.easy;

/*
TC O(log n)
SC O(1)
*/
public class LC704_BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 6, 7, 8};
        int target = 4;
        LC704_BinarySearch obj = new LC704_BinarySearch();
        System.out.println(obj.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0, right = nums.length, mid = 0;

        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid;
        }
        return -1;
    }
}
