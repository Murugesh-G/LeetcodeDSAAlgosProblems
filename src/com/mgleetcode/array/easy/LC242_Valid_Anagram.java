package com.mgleetcode.array.easy;

public class LC242_Valid_Anagram {
    public static void main(String[] args) {
        LC242_Valid_Anagram obj = new LC242_Valid_Anagram();
        String s1 = "rat", s2 = "car";
        System.out.println(obj.isAnagram(s1, s2));
    }

    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (char c : s.toCharArray())
            arr[c - 'a']++;

        for (char c : t.toCharArray())
            arr[c - 'a']--;

        for (int a : arr)
            if (a != 0)
                return false;
        return true;
    }
}
