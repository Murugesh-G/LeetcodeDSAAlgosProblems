package com.mgleetcode.matrix.medium;
/*
Time Complexity: O(m * n), where m is the number of rows and n is the number of columns in the grid. This is because we are iterating through each cell in the grid once.

Space Complexity: O(n), as we are using two arrays of size n to store the current and previous rows. This is an optimization from the previous approaches that used a 2D array.
*/
public class LC_Unique_Paths {
    public int uniquePaths(int m, int n) {
        return func(m, n);
    }

    int func(int m, int n) {
        // Array for the previous row
        int[] prev = new int[n];

        // Iterate through rows
        for (int i = 0; i < m; i++) {
            // Array for the current row
            int[] temp = new int[n];

            for (int j = 0; j < n; j++) {
                // Base case
                if (i == 0 && j == 0) {
                    temp[j] = 1;
                    continue;
                }

                // Ways from above and left
                int up = (i > 0) ? prev[j] : 0;
                int left = (j > 0) ? temp[j - 1] : 0;

                // Total ways for current cell
                temp[j] = up + left;
            }

            // Update previous row
            prev = temp;
        }
        return prev[n - 1];
    }
}
