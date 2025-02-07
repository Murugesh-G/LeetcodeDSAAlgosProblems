package com.mgleetcode.dynammicprogramming.easy;

import com.mgleetcode.Main;

import java.util.HashMap;

public class LC509_FibonacciNumber {

    public int fib(int n) {
       /* int[] dp = new int[n + 1];
        dp[0] = 0;
        if (n > 1)
            dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];*/
        if(n==0)
            return n;
        int prev1 = 0, prev2 = 1, temp;
        for (int i = 2; i <= n; i++) {
            temp = prev2;
            prev2 = prev1 + prev2;
            prev1 = temp;
        }
        return prev2;
    }

    public static void main(String[] args) {
        LC509_FibonacciNumber obj = new LC509_FibonacciNumber();
        System.out.println(obj.fib(2));
    }
}
