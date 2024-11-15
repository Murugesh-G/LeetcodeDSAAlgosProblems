package com.mgleetcode.stack.medium;

import com.mgleetcode.Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class A155_Min_Stack {
    public static void main(String[] args) {
        Main obj = new Main();
        String str = "/home/";
        System.out.println();

        Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        String s2 = "...";
        System.out.println(skip.contains(s2));
    }
}

class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();

    public MinStack() {

    }

    public void push(int val) {
        if (val <= min) {
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}