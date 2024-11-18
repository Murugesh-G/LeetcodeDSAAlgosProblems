package com.mgleetcode.array.easy;

public class LC190_Reverse_Bits {
    public static void main(String[] args) {
        LC190_Reverse_Bits obj = new LC190_Reverse_Bits();
        //long n=00000010100101000001111010011100L;
        //System.out.println(obj.reverseBits(n));
    }

    public int reverseBits(int n) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            res <<= 1;
            res |= (n & 1);
            n >>= 1;
        }
        return res;
    }
}
