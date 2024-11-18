package com.mgleetcode.array.easy;

import java.util.Arrays;

public class LC_66_Plus_One {
    public static void main(String[] args) {
        LC_66_Plus_One obj=new LC_66_Plus_One();
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
