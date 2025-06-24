package com.mgleetcode.intervals.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC56_MergeIntervals {
    public static void main(String[] args) {
        LC56_MergeIntervals obj = new LC56_MergeIntervals();
        int[][] intervals = new int[][]{{1, 4}, {4, 5}};
        int[][] res = obj.merge(intervals);
        System.out.println(Arrays.deepToString(res));
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= prev[1]) {
                prev[1] = Math.max(interval[1], prev[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);
    }
}
