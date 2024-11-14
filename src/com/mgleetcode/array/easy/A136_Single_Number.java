package com.mgleetcode.array.easy;

public class A136_Single_Number {
    public static void main(String[] args) {
        A136_Single_Number obj = new A136_Single_Number();
        int[] nums = {4,1,2,1,2};
        System.out.println(obj.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        /*int result = 0;
        if(nums.length==1){
            return nums[0];
        }

        for (int i = 1; i < nums.length; i++) {
            if (i == 1) {
                result = nums[0] ^ nums[i];
            } else {
                result = result ^ nums[i];
            }
        }
        return result;
         */

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
