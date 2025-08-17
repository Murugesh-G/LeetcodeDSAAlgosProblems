package com.mgleetcode.stack.hard;

import java.util.Stack;

/*
TC O(N)
SC O(N)
*/
public class LC32_LongestValidParentheses {
    public static void main(String[] args) {
        LC32_LongestValidParentheses obj = new LC32_LongestValidParentheses();
        String s = ")()())";
        System.out.println(obj.longestValidParentheses(s));
    }

    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    ans = Math.max(ans, i - stack.peek());
                }
            }
        }
        return ans;
    }
}
