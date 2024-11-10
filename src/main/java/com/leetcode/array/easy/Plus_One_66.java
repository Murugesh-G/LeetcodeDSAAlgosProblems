package com.leetcode.array.easy;

import java.util.Arrays;

public class Plus_One_66 {
    public static void main(String[] args) {
        Plus_One_66 obj=new Plus_One_66();
        int[] arr=new int[]{9};
        System.out.println(Arrays.toString(obj.plusOne(arr)));
    }

    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;

    }
}
