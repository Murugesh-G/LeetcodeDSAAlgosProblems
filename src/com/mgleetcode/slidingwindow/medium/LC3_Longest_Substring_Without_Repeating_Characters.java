package com.mgleetcode.slidingwindow.medium;

import java.util.HashMap;
import java.util.Map;

/*
TC O(n)
SC O(n)
*/
public class LC3_Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        LC3_Longest_Substring_Without_Repeating_Characters obj = new LC3_Longest_Substring_Without_Repeating_Characters();
        System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            if (map.containsKey(s.charAt(r))) {
                l = Math.max(l, map.get(s.charAt(r)) + 1);
            }

            map.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}
