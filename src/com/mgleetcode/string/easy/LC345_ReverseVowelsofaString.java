package com.mgleetcode.string.easy;

import com.mgleetcode.Main;

public class LC345_ReverseVowelsofaString {
    public static void main(String[] args) {
        LC345_ReverseVowelsofaString obj = new LC345_ReverseVowelsofaString();
        String str = "leetcode";
        System.out.println(obj.reverseVowels(str));
    }

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0, end = s.length() - 1;
        String vowels = "aeiouAEIOU";
        while (start < end) {
            while (start < end && vowels.indexOf(chars[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(chars[end]) == -1) {
                end--;
            }

            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }
        return new String(chars);
    }
}

