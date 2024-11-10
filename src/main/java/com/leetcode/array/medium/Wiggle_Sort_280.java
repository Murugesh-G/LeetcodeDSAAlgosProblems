package com.leetcode.array.medium;


public class Wiggle_Sort_280 {
    public static void main(String[] args) {
        Wiggle_Sort_280 obj = new Wiggle_Sort_280();
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
