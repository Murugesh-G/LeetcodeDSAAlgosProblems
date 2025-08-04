package com.mgleetcode.array.medium;

/*
TC O(N)
SC O(1)
*/
public class LC31_NextPermutation {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,5};
        LC31_NextPermutation obj = new LC31_NextPermutation();
        obj.nextPermutation(nums);
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[i] >= nums[j])
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
        for(int k:nums)
            System.out.print(k);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
