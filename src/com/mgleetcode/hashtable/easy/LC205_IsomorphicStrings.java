package com.mgleetcode.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

public class LC205_IsomorphicStrings {
    public static void main(String[] args) {
        String s = "paper", t = "title";
        LC205_IsomorphicStrings obj = new LC205_IsomorphicStrings();
        System.out.println(obj.isIsomorphic(s, t));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (map.containsKey(sc)) {
                if (map.get(sc) != tc) {
                    return false;
                }
            } else if (map.containsValue(tc)) {
                return false;
            }
            map.put(sc, tc);
        }
        return true;
    }
}
