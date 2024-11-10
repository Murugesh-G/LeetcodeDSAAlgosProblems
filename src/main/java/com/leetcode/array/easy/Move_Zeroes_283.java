package com.leetcode.array.easy;

public class Move_Zeroes_283 {
    public static void main(String[] args) {
        Move_Zeroes_283 obj = new Move_Zeroes_283();
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
