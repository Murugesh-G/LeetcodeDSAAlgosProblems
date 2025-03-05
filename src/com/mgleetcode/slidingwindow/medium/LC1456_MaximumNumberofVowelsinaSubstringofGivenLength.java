package com.mgleetcode.slidingwindow.medium;

public class LC1456_MaximumNumberofVowelsinaSubstringofGivenLength {
    public static void main(String[] args) {
        LC1456_MaximumNumberofVowelsinaSubstringofGivenLength obj = new LC1456_MaximumNumberofVowelsinaSubstringofGivenLength();
        String s = "leetcode";
        int k = 3;
        System.out.println(obj.maxVowels(s, k));
    }

    public int maxVowels(String s, int k) {
        int[] vowels = new int[128];
        vowels['a'] = 1;
        vowels['e'] = 1;
        vowels['i'] = 1;
        vowels['o'] = 1;
        vowels['u'] = 1;

        int maxSum = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            sum += vowels[s.charAt(i)];
        }
        maxSum = sum;

        for (int i = k; i < s.length(); i++) {
            sum += vowels[s.charAt(i)] - vowels[s.charAt(i - k)];
            maxSum = Math.max(sum, maxSum);

            if (maxSum == k)
                return maxSum;
        }
        return maxSum;
    }
}
