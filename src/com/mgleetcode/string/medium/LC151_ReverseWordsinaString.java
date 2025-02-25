package com.mgleetcode.string.medium;

import java.util.Arrays;

public class LC151_ReverseWordsinaString {
    public static void main(String[] args) {
        LC151_ReverseWordsinaString obj = new LC151_ReverseWordsinaString();
        String s = "the sky is blue";
        System.out.println(obj.reverseWords(s));
    }

    public String reverseWords(String s) {
        String[] strings = s.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            stringBuilder.append(strings[i]);
            if (i != 0)
                stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = 1;
        }

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;
    }
}
