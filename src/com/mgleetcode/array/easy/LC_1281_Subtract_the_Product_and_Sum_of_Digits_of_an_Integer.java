package com.mgleetcode.array.easy;

public class LC_1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer {
    public static void main(String[] args) {
        LC_1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer obj = new LC_1281_Subtract_the_Product_and_Sum_of_Digits_of_an_Integer();
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
