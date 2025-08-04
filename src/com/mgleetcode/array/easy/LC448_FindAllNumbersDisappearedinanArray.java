package com.mgleetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/*
TC O(N)
SC O(1)
*/
public class LC448_FindAllNumbersDisappearedinanArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1};
        LC448_FindAllNumbersDisappearedinanArray obj = new LC448_FindAllNumbersDisappearedinanArray();
        System.out.println(obj.findDisappearedNumbers(nums));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] > 0)
                nums[index - 1] *= -1;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0)
                result.add(i + 1);
        return result;
    }
}
