package com.mgleetcode.binarysearch.medium;

/*
TC O(M+N)
SC O(1)
*/
public class LC240_Searcha2DMatrixII {
    public static void main(String[] args) {
        LC240_Searcha2DMatrixII obj = new LC240_Searcha2DMatrixII();
        int[][] nums = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 20;
        System.out.println(obj.searchMatrix(nums, target));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (target == matrix[row][col]) {
                return true;
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
