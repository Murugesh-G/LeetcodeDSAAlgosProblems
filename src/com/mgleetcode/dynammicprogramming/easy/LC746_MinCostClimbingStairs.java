package com.mgleetcode.dynammicprogramming.easy;

public class LC746_MinCostClimbingStairs {
    public static void main(String[] args) {
        LC746_MinCostClimbingStairs obj = new LC746_MinCostClimbingStairs();
        int[] cost=new int[]{10,15,20};
        System.out.println(obj.minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        int first = cost[0], second = cost[1];
        if (cost.length <= 2)
            return Math.min(first, second);
        for (int i = 2; i < cost.length; i++) {
            int curr = cost[i] + Math.min(first, second);
            first = second;
            second = curr;
        }
        return Math.min(first, second);

    }
}
