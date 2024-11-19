package com.mgleetcode.stack.medium;

import java.util.Arrays;
import java.util.Stack;

public class LC739_Daily_Temperatures {
    public static void main(String[] args) {
        LC739_Daily_Temperatures obj = new LC739_Daily_Temperatures();
        int[] temps = new int[]{30, 60, 90};
        System.out.println(Arrays.toString(obj.dailyTemperatures(temps)));

    }

    public int[] dailyTemperatures(int[] temps) {
        int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temps.length; i++) {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return results;
    }
}
