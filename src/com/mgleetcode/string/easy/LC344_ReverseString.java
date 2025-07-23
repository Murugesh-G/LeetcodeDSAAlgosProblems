package com.mgleetcode.string.easy;

/*
TC O(n)
SC O(1)
*/
public class LC344_ReverseString {
    public static void main(String[] args) {
        char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        LC344_ReverseString obj = new LC344_ReverseString();
        obj.reverseString(s);
    }

    public void reverseString(char[] s) {
        int first = 0, last = s.length - 1;
        while (first < last) {
            char temp = s[last];
            s[last] = s[first];
            s[first] = temp;
            first++;
            last--;
        }
    }
}
