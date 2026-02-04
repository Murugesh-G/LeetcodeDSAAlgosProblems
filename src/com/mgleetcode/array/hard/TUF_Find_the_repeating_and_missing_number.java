package com.mgleetcode.array.hard;

/*
TC O(n)
SC O(1)
*/
public class TUF_Find_the_repeating_and_missing_number {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 6, 7, 5, 7};
        TUF_Find_the_repeating_and_missing_number obj = new TUF_Find_the_repeating_and_missing_number();
        int[] result = obj.findMissingRepeatingNumbers(arr);
        for (int r : result)
            System.out.println(r);

    }

    public int[] findMissingRepeatingNumbers(int[] nums) {
        long n = nums.length;
        long sn = (n * (n + 1)) / 2;
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6;
        long s = 0, s2 = 0;

        for (int num : nums) {
            s += num;
            s2 += (long) num * (long) num;
        }

        long val1 = s - sn; // x-y
        long val2 = s2 - s2n; // x2-y2

        val2 = val2 / val1;

        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[]{(int) x, (int) y};
    }
}
