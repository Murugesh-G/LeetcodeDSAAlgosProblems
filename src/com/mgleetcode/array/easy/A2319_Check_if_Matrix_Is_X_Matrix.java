package com.mgleetcode.array.easy;

public class A2319_Check_if_Matrix_Is_X_Matrix {
    public static void main(String[] args) {
        A2319_Check_if_Matrix_Is_X_Matrix obj = new A2319_Check_if_Matrix_Is_X_Matrix();
        int[][] arr = new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}};
        int[][] arr2 = new int[][]{{5, 7, 0}, {0, 3, 1}, {0, 5, 0}};
        System.out.println(obj.checkXMatrix(arr2));
    }

    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[1].length; j++) {
                if (i == j || i + j == n - 1) {
                    if (grid[i][j] == 0)
                        return false;
                } else if (grid[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
}
