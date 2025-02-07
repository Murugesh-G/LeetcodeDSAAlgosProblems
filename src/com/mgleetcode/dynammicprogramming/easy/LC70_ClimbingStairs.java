package com.mgleetcode.dynammicprogramming.easy;

import com.mgleetcode.Main;

public class LC70_ClimbingStairs {
    public static void main(String[] args) {
        LC70_ClimbingStairs obj = new LC70_ClimbingStairs();
        String str = "/home/";
        System.out.println(obj.climbStairsTabulation(1));
    }

    //TC O(N)
//SC O(1)
    public int climbStairsTwoPointer(int n) {
        if (n <= 3)
            return n;
        int prev1 = 3, prev2 = 2, cur = 0;
        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return cur;
    }

    public int climbStairsTabulation(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        if(n>1)
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
