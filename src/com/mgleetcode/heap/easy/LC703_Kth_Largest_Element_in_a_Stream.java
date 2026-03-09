package com.mgleetcode.heap.easy;

import java.util.PriorityQueue;

/*
TC O(m*logk)
SC O(m)
 */
public class LC703_Kth_Largest_Element_in_a_Stream {
    public static void main(String[] args) {

    }

    class KthLargest {
        PriorityQueue<Integer> minHeap;
        int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            minHeap = new PriorityQueue<>();
            for (int num : nums) {
                minHeap.offer(num);
                if (minHeap.size() > k)
                    minHeap.poll();
            }
        }

        public int add(int val) {
            minHeap.offer(val);
            if (minHeap.size() > k)
                minHeap.poll();
            return minHeap.peek();
        }
    }
}
