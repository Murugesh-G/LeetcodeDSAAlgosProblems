package com.mgleetcode.hashtable.medium;

import com.mgleetcode.Main;

import java.util.HashSet;
import java.util.Set;

public class LC128_LongestConsecutiveSequence {
    public static void main(String[] args) {
        LC128_LongestConsecutiveSequence obj = new LC128_LongestConsecutiveSequence();
        int[] arr={-1,0,-1,2,-2};
        System.out.println(obj.longestConsecutive(arr));
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) // O(N)
            numsSet.add(num);

        int maxLength = 0;
        for (int num : numsSet) {
            if (!numsSet.contains(num - 1)) {
                int length = 1;
                while (numsSet.contains(num + length)) {
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}

/*
The outer loop runs O(N) times (one for each unique number in numsSet).
The inner while loop only executes when num - 1 is not present, meaning we only start counting from the beginning of a sequence.
Each number in numsSet is only visited once in the while loop across all iterations.
Thus, the total number of while loop iterations across all elements is at most N.
TC O(N)
SC O(N)
*/