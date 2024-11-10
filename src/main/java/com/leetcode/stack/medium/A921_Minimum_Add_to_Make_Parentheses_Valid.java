package com.leetcode.stack.medium;

import com.leetcode.Main;

public class A921_Minimum_Add_to_Make_Parentheses_Valid {
    public static void main(String[] args) {
        A921_Minimum_Add_to_Make_Parentheses_Valid obj = new A921_Minimum_Add_to_Make_Parentheses_Valid();
        String s = "())";
        System.out.println(obj.minAddToMakeValid(s));
    }

    public int minAddToMakeValid(String s) {
        int open = 0, close = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    close++;
                }
            }
        }
        return open + close;
    }
}
