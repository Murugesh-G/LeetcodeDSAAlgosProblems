package com.mgleetcode.dynammicprogramming.medium;

import com.mgleetcode.test.Test;

public class LC152_MaximumProductSubarray {
    public static void main(String[] args) {
        LC152_MaximumProductSubarray obj = new LC152_MaximumProductSubarray();
        int[] arr=new int[]{2,3,-2,4};
        System.out.println(obj.maxProduct(arr));
    }

    public int maxProduct(int[] nums) {
        int maxProduct = nums[0], currentProduct = nums[0];
        for (int i=1;i<nums.length;i++) {
            currentProduct = currentProduct * nums[i];
            maxProduct = Math.max(currentProduct, maxProduct);
        }
        return maxProduct;
    }


}
