package com.mgleetcode.array.easy;

import java.util.Arrays;

public class LC1313_Decompress_Run_Length_Encoded_List {
    public static void main(String[] args) {
        LC1313_Decompress_Run_Length_Encoded_List obj = new LC1313_Decompress_Run_Length_Encoded_List();
        int[] arr = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(obj.decompressRLElist(arr)));
    }

    public int[] decompressRLElist(int[] nums) {
        int newArrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            newArrSize += nums[i];
        }
        int[] resArr = new int[newArrSize];
        int startIdx = 0;
        for (int i = 1; i < nums.length; i += 2) {
            Arrays.fill(resArr, startIdx, startIdx + nums[i-1], nums[i]);
            startIdx+=nums[i-1];
        }
        return resArr;
    }
}
