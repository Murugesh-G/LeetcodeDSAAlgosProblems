package com.mgleetcode.integer.medium;

/*
TC O(log5 n)
SC O(1)
*/
public class LC172_FactorialTrailingZeroes {
    public static void main(String[] args) {
        LC172_FactorialTrailingZeroes obj = new LC172_FactorialTrailingZeroes();
        System.out.println(obj.trailingZeroes(0));
    }

    public int trailingZeroes(int n) {
        int count = 0, countPowerOfFive = 5;
        while (n >= countPowerOfFive) {
            count += n / countPowerOfFive;
            countPowerOfFive *= 5;
        }
        return count;
    }
}
