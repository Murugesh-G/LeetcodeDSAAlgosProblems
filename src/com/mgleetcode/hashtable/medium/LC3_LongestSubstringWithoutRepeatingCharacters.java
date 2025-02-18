package com.mgleetcode.hashtable.medium;

import com.mgleetcode.Main;

import java.util.HashMap;
import java.util.Map;
// TC O(n)
// SC O(1) Since s consists of English letters, digits, symbols and spaces". I think we have fixed max size of characters consisting of the input string
public class LC3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LC3_LongestSubstringWithoutRepeatingCharacters obj = new LC3_LongestSubstringWithoutRepeatingCharacters();
        String str = "";
        System.out.println(obj.lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLength = 0;
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (indexMap.containsKey(c) && indexMap.get(c) >= left) {
                left = indexMap.get(c) + 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            indexMap.put(c, right);
        }
        return maxLength;
    }
}
