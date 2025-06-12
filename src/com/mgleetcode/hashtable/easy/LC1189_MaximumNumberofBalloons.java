package com.mgleetcode.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/*TC O(N)
SC O(1)*/
public class LC1189_MaximumNumberofBalloons {
    public static void main(String[] args) {
        LC1189_MaximumNumberofBalloons obj = new LC1189_MaximumNumberofBalloons();
        System.out.println(obj.maxNumberOfBalloons("leetcode"));
    }

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n')
                map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return Math.min(Math.min(
                        Math.min(map.getOrDefault('b', 0), map.getOrDefault('a', 0)),
                        Math.min(map.getOrDefault('o', 0) / 2, map.getOrDefault('n', 0))),
                map.getOrDefault('l', 0) / 2);

    }


}
