package com.mgleetcode.integer.medium;

/*
TC O(13 * log n)
SC O(13)
*/
public class LC12_IntegertoRoman {
    public static void main(String[] args) {
        int num = 1994;
        LC12_IntegertoRoman obj = new LC12_IntegertoRoman();
        System.out.println(obj.intToRoman(num));
    }

    public String intToRoman(int num) {
        int[] romanInts = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanWords = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < romanInts.length; i++) {
            while (num >= romanInts[i]) {
                result.append(romanWords[i]);
                num -= romanInts[i];
            }
        }
        return result.toString();
    }
}


