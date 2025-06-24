package com.mgleetcode.stack.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC496_NextGreaterElementI {
    public static void main(String[] args) {
        LC496_NextGreaterElementI obj = new LC496_NextGreaterElementI();
        int[] nums1 = new int[]{1,3,5,2,4};
        int[] nums2 = new int[]{6,5,4,3,2,1,7};
        int[] res = obj.nextGreaterElement(nums1, nums2);
        for (int n : res) {
            System.out.print(n + " ");
        }
    }

    //ToDo
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> matchCount = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                matchCount.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = matchCount.getOrDefault(nums1[i], -1);
        }
        return res;
    }

}
