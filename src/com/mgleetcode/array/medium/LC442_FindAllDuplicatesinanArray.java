package com.mgleetcode.array.medium;

import java.util.ArrayList;
import java.util.List;

/*
TC O(N)
SC O(1)
*/
public class LC442_FindAllDuplicatesinanArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        LC442_FindAllDuplicatesinanArray obj = new LC442_FindAllDuplicatesinanArray();
        System.out.println(obj.findDuplicates(nums));
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0)
                nums[index] *= -1;
            else
                result.add(index + 1);
        }
        return result;
    }

}
