package com.mgleetcode.array.medium;

/*
TC O(log m*n)
SC O(1)
*/
public class LC74_Search_a_2D_Matrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;

        // Create an instance of Solution class
        LC74_Search_a_2D_Matrix sol = new LC74_Search_a_2D_Matrix();

        boolean result = sol.searchMatrix(matrix, target);

        // Output the result
        System.out.println(result ? "true" : "false");
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int total = rows * cols;
        int low = 0, high = total - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}
