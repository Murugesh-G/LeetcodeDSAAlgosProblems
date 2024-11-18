package com.mgleetcode.stack.medium;

import java.util.*;

public class LC71_Simplify_Path {
    public static void main(String[] args) {
        LC71_Simplify_Path obj = new LC71_Simplify_Path();
        String str = "/.../a/../b/c/../d/./";
        System.out.println(obj.simplifyPath(str));
    }

    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();

        Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        for (String str : path.split("/")) {
            if (str.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!skip.contains(str)) {
                stack.push(str);
            }
        }

        String result = "";

        for (String s : stack) {
            result = "/" + s + result;
        }

        return result.isEmpty() ? "/" : result;

    }
}
