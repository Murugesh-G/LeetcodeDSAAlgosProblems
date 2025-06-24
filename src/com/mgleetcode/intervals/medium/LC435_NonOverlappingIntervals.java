package com.mgleetcode.intervals.medium;

import java.util.Arrays;

public class LC435_NonOverlappingIntervals {
    public static void main(String[] args) {
        LC435_NonOverlappingIntervals obj = new LC435_NonOverlappingIntervals();
        int[][] intervals = new int[][]{{1, 2}, {2, 3}};
        int res = obj.eraseOverlapIntervals(intervals);
        System.out.println(res);
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int prev_end = intervals[0][1];
        int res = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (prev_end > intervals[i][0]) {
                res++;
            } else {
                prev_end = intervals[i][1];
            }
        }
        return res;
    }
}
