package com.mgleetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

public class LC46_Permutations {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        LC46_Permutations obj = new LC46_Permutations();
        List<List<Integer>> res = obj.permute(nums);
        System.out.println(res);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    private void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums) {
        // If we match the length, it is a permutation
        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int number : nums) {
            // Skip if we get same element
            if (tempList.contains(number))
                continue;

            // Add the new element
            tempList.add(number);

            // Go back to try other element
            backtrack(resultList, tempList, nums);

            // Remove the element
            tempList.remove(tempList.size() - 1);
        }
    }
}