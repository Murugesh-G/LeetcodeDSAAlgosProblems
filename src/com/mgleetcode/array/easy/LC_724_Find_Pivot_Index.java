package com.mgleetcode.array.easy;

public class LC_724_Find_Pivot_Index {
    public static void main(String[] args) {
        LC_724_Find_Pivot_Index obj = new LC_724_Find_Pivot_Index();
        int[] nums = {2,1,-1};
        System.out.println(obj.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {
        if (nums.length == 1) return 0;

        int leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        for (int index = 0; index < nums.length; index++) {
            rightSum -= nums[index];
            if (leftSum == rightSum) return index;
            leftSum += nums[index];
        }
        return -1;
    }
}
