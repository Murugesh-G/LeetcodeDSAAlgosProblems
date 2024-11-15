package com.mgleetcode.stack.medium;

import com.mgleetcode.Main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class A150_Evaluate_Reverse_Polish_Notation {
    public static void main(String[] args) {
        A150_Evaluate_Reverse_Polish_Notation obj = new A150_Evaluate_Reverse_Polish_Notation();
        String[] str = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(obj.evalRPN(str));
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a + b);
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a - b);
            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a * b);
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a / b);
            } else {
                stack.add(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

}
/*
Time Complexity: 𝑂(𝑛)
Space Complexity: O(n)
*/