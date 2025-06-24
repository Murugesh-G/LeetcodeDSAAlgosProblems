package com.mgleetcode.heap.easy;

import java.util.PriorityQueue;

public class LC215_KthLargestElementinanArray {

    public static void main(String[] args) {
        LC215_KthLargestElementinanArray obj = new LC215_KthLargestElementinanArray();
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(obj.findKthLargest(nums, k));
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : nums) {
            queue.add(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
