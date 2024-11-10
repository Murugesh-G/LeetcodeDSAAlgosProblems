package com.leetcode.array.easy;

public class Prime_Number_of_Set_Bits_in_Binary_Representation_762 {
    public static void main(String[] args) {
        Prime_Number_of_Set_Bits_in_Binary_Representation_762 obj=new Prime_Number_of_Set_Bits_in_Binary_Representation_762();
        System.out.println(obj.countPrimeSetBits(6,10));
    }

    public int countPrimeSetBits(int L, int R) {
        boolean [] primes = new boolean[]{false, false, true, true, false, true, false, true, false, false , false, true, false, true, false, false, false, true, false, true, false};
        int count = 0;
        for(int i = L; i <= R; i++) {
            if (primes[countBits(i)]) count++;
        }
        return count;
    }

    private int countBits(int n) {
        int count = 0;
        for(int i = n; i > 0; i >>= 1)
            count += i & 1;
        return count;
    }
}
