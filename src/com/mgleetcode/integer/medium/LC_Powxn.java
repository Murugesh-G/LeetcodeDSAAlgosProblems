package com.mgleetcode.integer.medium;

/*
TC O(log2 n)
SC O(1)
*/
public class LC_Powxn {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        LC_Powxn obj = new LC_Powxn();
        System.out.println(obj.myPow(x, n));
    }

    public double myPow(double x, int n) {
        double result = 1;
        long num = Math.abs((long) n);
        while (num != 0) {
            if (num % 2 == 1) {
                result *= x;
                num -= 1;
            }
            x *= x;
            num = num / 2;
        }
        return n < 0 ? (1 / result) : result;
    }
}
