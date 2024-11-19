package com.mgleetcode.stack.medium;

import com.mgleetcode.Main;

import java.util.Stack;

public class LC394_Decode_String {
    public static void main(String[] args) {
        LC394_Decode_String obj = new LC394_Decode_String();
        String str = "2[abc]3[cd]ef";
        System.out.println(obj.decodeString(str));
    }

    public String decodeString(String s) {

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c != ']') {
                stack.push(c);
            } else {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isLetter(stack.peek())) {
                    sb.insert(0, stack.pop());
                }

                stack.pop();

                String str = sb.toString();
                sb = new StringBuilder();

                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    sb.insert(0, stack.pop());
                }

                int count = Integer.parseInt(sb.toString());

                sb = new StringBuilder();
                while (count > 0) {
                    sb.append(str);
                    count--;
                }

                for (char ch : sb.toString().toCharArray()) {
                    stack.push(ch);
                }
            }
        }

        StringBuilder sb2 = new StringBuilder();
        while (!stack.isEmpty()) {
            sb2.insert(0, stack.pop());
        }

        return sb2.toString();
    }
}

/*
Time Complexity: O(n * k)
Space Complexity: O(n * k)
*/
