package com.mgleetcode.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/*
  TC O(N+M)
  N is length of ransomNote
  M is length of magazine
  SC(26) -> SC(1)
  */
public class LC_RansomNote {
    public static void main(String[] args) {
        LC_RansomNote obj = new LC_RansomNote();
        System.out.println(obj.canConstruct("aqqa", "aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) <= 0)
                return false;
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
