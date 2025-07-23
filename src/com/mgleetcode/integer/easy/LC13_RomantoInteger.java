package com.mgleetcode.integer.easy;

import java.util.HashMap;
import java.util.Map;

/*
TC O(n)
SC O(1)
*/
public class LC13_RomantoInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        LC13_RomantoInteger obj = new LC13_RomantoInteger();
        System.out.println(obj.romanToInt(s));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length(), result = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result = result - map.get(s.charAt(i));
            } else {
                result = result + map.get(s.charAt(i));
            }
        }
        return result;
    }
}
