package com.mgleetcode.hashtable.medium;

import com.mgleetcode.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC48_GroupAnagrams {
    public static void main(String[] args) {
        LC48_GroupAnagrams obj = new LC48_GroupAnagrams();
        String[] strs = new String[]{"a"};
        System.out.println(obj.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); // SC O(N*K)

        for (String str : strs) { // TC O(N)
            int[] intArray = new int[26];// SC O(1)

            for (char c : str.toCharArray()) { // TC O(N*K)
                intArray[c - 'a']++;
            }

            StringBuilder stringBuilder = new StringBuilder(); //SC O(1) becusae 26 chars
            for (int idx : intArray) { // TC O(1)
                stringBuilder.append(idx).append("#");
            }

            String key = stringBuilder.toString();
            if (!map.containsKey(key)) { // TC O(1)
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());// SC O(N)
    }
}
/*Total time complexity
O(N*K) +O(N)+O(N)=O(N)

The dominant factor is the HashMap storage, so the total space complexity is O(N * K).*/

