package com.leetcode.array.medium;

public class A274_H_Index {
    public static void main(String[] args) {
        A274_H_Index obj = new A274_H_Index();
        int[] nums = new int[]{3,0,6,1,5};
        System.out.println(obj.hIndex(nums));
    }

    public int hIndex(int[] citations) {
        int result = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] > i) {
                result++;
            }
        }
        return result;
    }
}
