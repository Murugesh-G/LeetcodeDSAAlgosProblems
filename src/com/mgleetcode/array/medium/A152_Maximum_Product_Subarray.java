package com.mgleetcode.array.medium;

public class A152_Maximum_Product_Subarray {
    public static void main(String[] args) {
        A152_Maximum_Product_Subarray obj = new A152_Maximum_Product_Subarray();
        int[] arr = new int[]{0,2};
        System.out.println(obj.maxProduct(arr));
    }

    public int maxProduct(int[] nums) {
        int currentproduct = nums[0], maxProduct = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentproduct *= nums[i];
            maxProduct = Math.max(maxProduct, currentproduct);

            if (currentproduct <= 0) {
                currentproduct = nums[i];
            }
        }
        return maxProduct;
    }
}
