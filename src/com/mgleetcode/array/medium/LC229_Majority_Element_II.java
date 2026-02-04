package com.mgleetcode.array.medium;

import java.util.ArrayList;
import java.util.List;

/*
Boyer-Moore Majority Voting Solution
Time Complexity: O(N), where N is the size of the input array. We traverse the array twice: once to find potential candidates and once to validate them.

Space Complexity: O(1), as we are using a constant amount of space for the counters and candidate elements, regardless of the input size.
*/
public class LC229_Majority_Element_II {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 1, 3, 2, 2};
        LC229_Majority_Element_II obj = new LC229_Majority_Element_II();
        List<Integer> res = obj.majorityElement(nums);
        for (int num : res) {
            System.out.println(num);
        }
    }

    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0, ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && ele2 != nums[i]) {
                count1 = 1;
                ele1 = nums[i];
            } else if (count2 == 0 && ele1 != nums[i]) {
                count2 = 1;
                ele2 = nums[i];
            } else if (ele1 == nums[i])
                count1++;
            else if (ele2 == nums[i])
                count2++;
            else {
                count1--;
                count2--;
            }

        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ele1 == nums[i]) {
                count1++;
            } else if (ele2 == nums[i]) {
                count2++;
            }
        }
        List<Integer> res = new ArrayList<>();
        int mini = nums.length / 3 + 1;
        if (count1 >= mini) {
            res.add(ele1);
        }
        if (count2 >= mini) {
            res.add(ele2);
        }
        return res;
    }
}
