package com.mgleetcode.array.medium;

import java.util.Arrays;

public class LC238_ProductofArrayExceptSelf {
    public static void main(String[] args) {
        LC238_ProductofArrayExceptSelf obj = new LC238_ProductofArrayExceptSelf();
        int[] nums = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }

    //TC O(n)
    //SC O(1) Since the return type int[] doesn't matter
    public int[] productExceptSelf(int[] nums) {

        int res[] = new int[nums.length];
        Arrays.fill(res, 1);

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            res[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            res[j] *= right;
            right *= nums[j];
        }
        return res;
    }

}
