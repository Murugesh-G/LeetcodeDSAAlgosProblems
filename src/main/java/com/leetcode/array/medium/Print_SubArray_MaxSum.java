package com.leetcode.array.medium;

public class Print_SubArray_MaxSum {
    public static void main(String[] args) {
        Print_SubArray_MaxSum obj = new Print_SubArray_MaxSum();
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        obj.subArrayMaxSum(arr);
    }

    void subArrayMaxSum(int[] arr) {
        int currentSum = 0, maxSum = 0, start = 0, end = 0, tempStart = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                end = i;
                start = tempStart;
            }
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
