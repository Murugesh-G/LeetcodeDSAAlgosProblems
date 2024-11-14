package com.mgleetcode.array.easy;

public class A67_Add_Binary {
    public static void main(String[] args) {
        A67_Add_Binary obj = new A67_Add_Binary();
        String a = "1010", b = "1011";
        System.out.println(obj.addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1, j = b.length() - 1;
        int sum = 0, carry = 0;

        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            carry = sum > 1 ? 1 : 0;
            result.append(sum % 2);
        }
        if (carry != 0) result.append(carry);
        return result.reverse().toString();

    }
}
