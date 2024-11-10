package com.leetcode.array.easy;

public class Majority_Element_169 {
    public static void main(String[] args) {
        Majority_Element_169 obj = new Majority_Element_169();
        int[] arr = new int[]{2,2,1,1,1,2,2};
        System.out.println(obj.majorityElement(arr));
    }

    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate)
                count++;
            else
                count--;
        }
        return candidate;
    }
}
