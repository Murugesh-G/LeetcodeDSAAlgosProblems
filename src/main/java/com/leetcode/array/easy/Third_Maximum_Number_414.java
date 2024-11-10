package com.leetcode.array.easy;

public class Third_Maximum_Number_414 {
    public static void main(String[] args) {
        Third_Maximum_Number_414 obj = new Third_Maximum_Number_414();
        int[] arr = new int[]{2,2,3,1};
        System.out.println(obj.thirdMax(arr));
    }

    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE, max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;
        for (int num : nums) {
            if (num == max3 || num == max2 || num == max1) {
                continue;
            }
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }
        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    }
}
