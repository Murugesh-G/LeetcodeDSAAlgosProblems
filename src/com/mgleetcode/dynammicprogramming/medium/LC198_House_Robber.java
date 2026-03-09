package com.mgleetcode.dynammicprogramming.medium;

/*
TC O(n)
SC O(1)
*/
public class LC198_House_Robber {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 9, 3, 1};
        LC198_House_Robber obj = new LC198_House_Robber();
        System.out.println(obj.rob(arr));
    }

    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;

        for (int num : nums) {
            int temp = Math.max(num + rob1, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
}
