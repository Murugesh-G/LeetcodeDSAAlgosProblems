package com.leetcode.array.medium;


public class A280_Wiggle_Sort {
    public static void main(String[] args) {
        A280_Wiggle_Sort obj = new A280_Wiggle_Sort();
        int[] arr=new int[] {6,6,5,6,3,8};
        obj.wiggleSort(arr);
    }

    public void wiggleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((i % 2 == 1) != (nums[i] >= nums[i - 1])) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
        }
        for(int num : nums){
            System.out.println(num);
        }

    }

}
