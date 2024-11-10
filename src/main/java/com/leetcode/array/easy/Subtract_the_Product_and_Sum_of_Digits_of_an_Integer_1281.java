package com.leetcode.array.easy;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 {
    public static void main(String[] args) {
        Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 obj = new Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281();
        System.out.println(obj.subtractProductAndSum(1));
    }

    public int subtractProductAndSum(int n) {
        int rem, product = 1, sum = 0;
        for (; n > 0; ) {
            rem = n % 10;
            n /= 10;
            product *= rem;
            sum += rem;
        }
        return product - sum;
    }

}
