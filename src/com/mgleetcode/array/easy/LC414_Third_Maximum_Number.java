package com.mgleetcode.array.easy;

public class LC414_Third_Maximum_Number {
    public static void main(String[] args) {
        LC414_Third_Maximum_Number obj = new LC414_Third_Maximum_Number();
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
