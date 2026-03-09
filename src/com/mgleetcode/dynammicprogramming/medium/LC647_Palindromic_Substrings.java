package com.mgleetcode.dynammicprogramming.medium;

/*
TC O(n2)
SC O(1)
*/
public class LC647_Palindromic_Substrings {
    public static void main(String[] args) {
        String s = "aaa";
        LC647_Palindromic_Substrings obj = new LC647_Palindromic_Substrings();
        System.out.println(obj.countSubstrings(s));
    }

    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += getCount(s, i, i);
            res += getCount(s, i, i + 1);
        }
        return res;
    }

    public int getCount(String s, int l, int r) {
        int res = 0;

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            res++;
            l--;
            r++;
        }
        return res;
    }
}
