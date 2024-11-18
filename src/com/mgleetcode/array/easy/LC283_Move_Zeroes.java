package com.mgleetcode.array.easy;

public class LC283_Move_Zeroes {
    public static void main(String[] args) {
        LC283_Move_Zeroes obj = new LC283_Move_Zeroes();
        int[] arr = new int[]{0, 1, 0, 3, 120, 1, 0, 3, 12};
        obj.moveZeroes(arr);
        System.out.println();
    }

    public void moveZeroes(int[] nums) {
        if (nums.length == 1) return;
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }
    }
}
