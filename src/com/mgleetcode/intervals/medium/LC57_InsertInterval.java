package com.mgleetcode.intervals.medium;

import java.util.*;

public class LC57_InsertInterval {
    public static void main(String[] args) {
        LC57_InsertInterval obj = new LC57_InsertInterval();

        int[][] intervals = new int[][]{{1, 3}, {6, 9}};
        int[] newInterval = new int[]{2, 5};

        int[][] res = obj.insert(intervals, newInterval);

        System.out.println(Arrays.deepToString(res));
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intervalslist = new ArrayList<>(Arrays.asList(intervals));
        intervalslist.add(newInterval);

        Collections.sort(intervalslist, (a, b) -> Integer.compare(a[0], b[0]));

        int[] prev = intervalslist.get(0);
        List<int[]> merged = new ArrayList<>();

        for (int i = 1; i < intervalslist.size(); i++) {
            int[] interval = intervalslist.get(i);
            if (prev[1] >= interval[0]) {
                prev[1] = Math.max(prev[1], interval[1]);
            } else {
                merged.add(prev);
                prev = interval;
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);

    }

}
