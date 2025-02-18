package com.mgleetcode.stack.medium;

import com.mgleetcode.Main;

import java.util.Stack;

public class LC1249MinimumRemovetoMakeValidParentheses {
    public static void main(String[] args) {
        LC1249MinimumRemovetoMakeValidParentheses obj = new LC1249MinimumRemovetoMakeValidParentheses();
        String str = "lee(t(c)o)de)";

        System.out.println(obj.minRemoveToMakeValid(str));
    }

    public String minRemoveToMakeValid(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int openParanthesis = 0, closeParanthesis = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openParanthesis++;
            } else if (str.charAt(i) == ')') {
                closeParanthesis++;
            }
            if (closeParanthesis > openParanthesis && str.charAt(i) == ')') {
                closeParanthesis--;
                continue;
            } else {
                //sb.append(str.charAt(i));
                stack.add(str.charAt(i));
            }
        }

        for (int i = 0; i < stack.size(); i++) {
            char c = stack.pop();
            if (openParanthesis > closeParanthesis && c == '(') {
                openParanthesis--;
                continue;
            } else {
                sb.append(c);
            }
        }
        return sb.reverse().toString();
    }
}
