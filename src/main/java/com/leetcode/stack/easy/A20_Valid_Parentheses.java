package com.leetcode.stack.easy;

import com.leetcode.Main;

import java.util.Stack;

public class A20_Valid_Parentheses {

    public static void main(String[] args) {
        A20_Valid_Parentheses obj = new A20_Valid_Parentheses();
        String s = "([])";
        System.out.println(obj.isValid(s));
    }

    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.peek();
                if ((c=='}' && top == '{') || (c==']' && top == '[') || (c==')' && top == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
