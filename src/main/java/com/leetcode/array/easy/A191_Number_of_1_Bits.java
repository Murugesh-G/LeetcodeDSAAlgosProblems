package com.leetcode.array.easy;

public class A191_Number_of_1_Bits {
    public static void main(String[] args) {
        A191_Number_of_1_Bits obj = new A191_Number_of_1_Bits();
        int n = 2147483645;
        System.out.println(obj.hammingWeight(n));
    }

    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result = result + (n & 1);
            n = n >>> 1;
        }
        return result;
    }
}
