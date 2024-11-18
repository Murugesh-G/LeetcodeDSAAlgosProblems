package com.mgleetcode.array.easy;

public class LC338_Counting_Bits {
    public static void main(String[] args) {
        LC338_Counting_Bits obj = new LC338_Counting_Bits();
        int n =2;
        System.out.println(obj.countBits(n));
    }

    public int[] countBits(int num) {
        int[] f = new int[num + 1];
        for (int i = 1; i <= num; i++)
            f[i] = f[i >> 1] + (i & 1);
        return f;
    }

}
