package com.mgleetcode.array.easy;

public class A169_Majority_Element {
    public static void main(String[] args) {
        A169_Majority_Element obj = new A169_Majority_Element();
        int[] arr = new int[]{2,2,1,1,1,2,2};
        System.out.println(obj.majorityElement(arr));
    }

    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate)
                count++;
            else
                count--;
        }
        return candidate;
    }
}
