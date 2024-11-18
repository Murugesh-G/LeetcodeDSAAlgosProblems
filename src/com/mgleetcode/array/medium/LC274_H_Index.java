package com.mgleetcode.array.medium;

public class LC274_H_Index {
    public static void main(String[] args) {
        LC274_H_Index obj = new LC274_H_Index();
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
