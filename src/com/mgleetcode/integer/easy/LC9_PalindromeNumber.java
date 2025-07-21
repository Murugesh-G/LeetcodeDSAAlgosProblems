package com.mgleetcode.integer.easy;

public class LC9_PalindromeNumber {
    public static void main(String[] args) {
        int x = -121;
        LC9_PalindromeNumber obj = new LC9_PalindromeNumber();
        System.out.println(obj.isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int reverse = 0;
        while (x > reverse) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x /= 10;
        }
        return x == reverse || x == reverse / 10;
    }
}
