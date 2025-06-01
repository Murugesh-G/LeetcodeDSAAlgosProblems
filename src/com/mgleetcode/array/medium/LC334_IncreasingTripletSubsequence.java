package com.mgleetcode.array.medium;

public class LC334_IncreasingTripletSubsequence {
    public static void main(String[] args) {
        LC334_IncreasingTripletSubsequence obj = new LC334_IncreasingTripletSubsequence();
        int[] nums = new int[]{5,4,3,2,1};
        System.out.println("The result: " + obj.increasingTriplet(nums));
    }

    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }

}
