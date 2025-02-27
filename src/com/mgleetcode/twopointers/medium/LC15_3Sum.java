package com.mgleetcode.twopointers.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15_3Sum {
    public static void main(String[] args) {
        LC15_3Sum obj = new LC15_3Sum();
        int[] nums = {0, 0, 0};
        System.out.println(obj.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
            }

        }
        return result;
    }
}
