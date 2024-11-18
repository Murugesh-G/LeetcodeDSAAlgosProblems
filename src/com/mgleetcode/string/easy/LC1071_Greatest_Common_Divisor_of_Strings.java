package com.mgleetcode.string.easy;

public class LC1071_Greatest_Common_Divisor_of_Strings {
    public static void main(String[] args) {
        LC1071_Greatest_Common_Divisor_of_Strings obj = new LC1071_Greatest_Common_Divisor_of_Strings();

        System.out.println(obj.gcdOfStrings("leet", "code"));
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int gdcNum = gcd(str1.length(), str2.length());
        return str1.substring(0, gdcNum);
    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
