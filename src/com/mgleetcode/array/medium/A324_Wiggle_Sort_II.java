package com.mgleetcode.array.medium;

import java.util.Arrays;

public class A324_Wiggle_Sort_II {
    public static void main(String[] args) {
        A324_Wiggle_Sort_II obj = new A324_Wiggle_Sort_II();
        int[] arr = new int[]{5,5,5,4,4,4,4};
        obj.wiggleSort(arr);
    }

    public void wiggleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (i%2!=0 && nums[i - 1] >= nums[i]) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            } else if(i%2==0 && nums[i-1] <= nums[i]){
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
