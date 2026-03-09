package com.mgleetcode.heap.easy;

import java.util.PriorityQueue;

/*
TC O(nlogn)
SC O(n)
 */
public class LC1046_Last_Stone_Weight {
    public static void main(String[] args) {

    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        for (int stone : stones)
            maxHeap.offer(-stone);

        while (maxHeap.size() > 1) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();
            if (second > first) {
                maxHeap.offer(first - second);
            }
        }

        maxHeap.offer(0);
        return Math.abs(maxHeap.peek());

    }
}
