package com.leetcode.array.easy;

public class Prime_Number {
    public static void main(String[] args) {
        Prime_Number obj = new Prime_Number();
        System.out.println(isPrime(1));
    }

    static int isPrime(int N) {
        if (N <= 1)
            return 0;
        int sq=(int)Math.sqrt(N);
        for (int i = 2; i <= sq; i++)
            if (N % i == 0)
                return 0;
        return 1;
    }
}
