package com.mgleetcode.array.medium;

import java.util.HashMap;
import java.util.Map;

/*
TC O(N)
SC O(N)
*/
public class GFG_Largestsubarraywith0sum {
    public static void main(String[] args) {
        int arr[] = new int[]{15, -2, 2, -8, 1, 7, 10, 23};
        GFG_Largestsubarraywith0sum obj = new GFG_Largestsubarraywith0sum();
        System.out.println("Largest subarray sum with 0 is : " + obj.maxLength(arr));
    }

    int maxLength(int arr[]) {
        int sum = 0, len = 0;
        Map<Integer, Integer> firstSeenSum = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                len = i + 1;
            } else if (firstSeenSum.containsKey(sum)) {
                len = Math.max(len, i - firstSeenSum.get(sum));
            } else {
                firstSeenSum.put(sum, i);
            }
        }
        return len;
    }
}
