package com.mgleetcode.stack.medium;

public class LC921_Minimum_Add_to_Make_Parentheses_Valid {
    public static void main(String[] args) {
        LC921_Minimum_Add_to_Make_Parentheses_Valid obj = new LC921_Minimum_Add_to_Make_Parentheses_Valid();
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
