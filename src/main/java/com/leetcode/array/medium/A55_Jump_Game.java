package com.leetcode.array.medium;

public class A55_Jump_Game {
    public static void main(String[] args) {
        A55_Jump_Game obj = new A55_Jump_Game();
        int[] nums = {3,2,1,0,4};
        System.out.println(obj.canJump(nums));
    }

    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i = 0; i < nums.length; i++) {
            if (reachable < i) {
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }
}
