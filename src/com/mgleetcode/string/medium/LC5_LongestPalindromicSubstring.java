package com.mgleetcode.string.medium;

/*
TC O(n^2)
SC O(1)
*/
public class LC5_LongestPalindromicSubstring {
    int start = 0, end = 0;

    public static void main(String[] args) {
        String s = "cbbd";
        LC5_LongestPalindromicSubstring obj = new LC5_LongestPalindromicSubstring();
        System.out.println(obj.longestPalindrome(s));
    }

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expandAroundCentre(s, i, i);
            expandAroundCentre(s, i, i + 1);
        }
        return s.substring(start, end + 1);
    }

    public void expandAroundCentre(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        left++;
        right--;
        if (end - start + 1 < right - left + 1) {
            start = left;
            end = right;
        }
    }

}
