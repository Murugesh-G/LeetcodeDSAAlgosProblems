package com.mgleetcode.integer.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
TC O(n)
SC O(1)
*/
public class LC412_FizzBuzz {
    public static void main(String[] args) {
        LC412_FizzBuzz obj = new LC412_FizzBuzz();
        int n = 15;
        List<String> result = obj.fizzBuzz(n);
        System.out.println(result);
    }

    public List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(i + "");
            }
        }
        return result;
    }
}
