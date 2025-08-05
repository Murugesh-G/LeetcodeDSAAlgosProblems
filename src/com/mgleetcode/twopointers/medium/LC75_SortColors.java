package com.mgleetcode.twopointers.medium;

/*
TC O(N)
SC O(1)
*/
public class LC75_SortColors {
    public static void main(String[] args) {
        int[] nums = new int[]{2,};
        LC75_SortColors obj = new LC75_SortColors();
        obj.sortColors(nums);
    }

    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;
        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(left, mid, nums);
                mid++;
                left++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(right, mid, nums);
                right--;
            }
        }
    }

    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
