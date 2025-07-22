package com.mgleetcode.integer.medium;

/*
TC O(log10 n)
SC O(1)
*/
public class LC7_ReverseInteger {
    public static void main(String[] args) {
        int x = Integer.MAX_VALUE-1;
        LC7_ReverseInteger obj = new LC7_ReverseInteger();
        System.out.println(obj.reverse(x));
    }

    public int reverse(int x) {
        int lastDigit, reversed = 0;
        while (x != 0) {
            lastDigit = x % 10;
            if (reversed > Integer.MAX_VALUE/10) return 0;
            if (reversed < Integer.MIN_VALUE/10) return 0;
            reversed = reversed * 10 + lastDigit;
            x /= 10;
        }
        return reversed;
    }
}
