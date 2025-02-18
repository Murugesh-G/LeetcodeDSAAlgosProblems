package com.mgleetcode.hashtable.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TC O(N)
// SC O(N)
public class LC347_TopKFrequentElements {
    public static void main(String[] args) {
        LC347_TopKFrequentElements obj = new LC347_TopKFrequentElements();
        int[] arr = new int[]{-1,-6,-1,4,4};
        int k = 3;
        int[] res=obj.topKFrequent(arr, k);
        for(int n:res){
            System.out.println(n);
        }

    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] lists = new ArrayList[nums.length];
        for (int i = 0; i < nums.length; i++) {
            lists[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int frequency=entry.getValue();
            lists[frequency-1].add(entry.getKey());
        }

        int[] res = new int[k];
        int idx = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int n : lists[i]) {
                res[idx++] = n;
                if (idx == k)
                    return res;
            }
        }
        return new int[0];
    }
}
