package com.mgleetcode.array.easy;

public class LC169_Majority_Element {
    public static void main(String[] args) {
        LC169_Majority_Element obj = new LC169_Majority_Element();
        int[] arr = new int[]{3,2,3};
        System.out.println(obj.majorityElement(arr));
    }

    public int majorityElement(int[] nums) {
        // Size of the given array
        int n = nums.length;

        // Count variable
        int cnt = 0;

        // Candidate element
        int el = 0;

        // Step 1: Find the potential majority element
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }

        return el;
        /*
        // Step 2: Verify the candidate
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                cnt1++;
            }
        }

        // Return the element if it's a majority
        if (cnt1 > (n / 2)) {
            return el;
        }

        // No majority found
        return -1;     */
    }
}
