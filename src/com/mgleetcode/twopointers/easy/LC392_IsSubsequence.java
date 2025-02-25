package com.mgleetcode.twopointers.easy;

import com.mgleetcode.Main;

public class LC392_IsSubsequence {
    public static void main(String[] args) {
        LC392_IsSubsequence obj = new LC392_IsSubsequence();
        String s = "abc", t = "ahbgd";
        System.out.println(obj.isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        int sp = 0, tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }
        return s.length() == sp;
    }
}
