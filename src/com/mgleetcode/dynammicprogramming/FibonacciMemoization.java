package com.mgleetcode.dynammicprogramming;

import com.mgleetcode.Main;

import java.util.HashMap;

// Top down approach
/*
Without memoization, the naive recursive approach to Fibonacci (fib(n-1) + fib(n-2)) has exponential time complexity: O(2ⁿ).
Time Complexity: O(n) (linear time)
Space Complexity: O(n) (due to both the recursion stack and HashMap storage)
*/
public class FibonacciMemoization {
    static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int fib(int n) {
        if (n <= 1)
            return n;

        if (memo.containsKey(n))
            return memo.get(n);

        int result = fib(n - 1) + fib(n - 2);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        FibonacciMemoization obj = new FibonacciMemoization();
        System.out.println(obj.fib(10));
    }
}
