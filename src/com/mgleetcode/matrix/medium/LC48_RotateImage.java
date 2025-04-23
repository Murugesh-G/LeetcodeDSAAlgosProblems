package com.mgleetcode.matrix.medium;

import java.util.Arrays;

public class LC48_RotateImage {
    public static void main(String[] args) {
        LC48_RotateImage obj = new LC48_RotateImage();
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        obj.rotate(matrix);
    }

    public void rotate(int[][] matrix) {

        // swap
        int top = 0, botton = matrix.length - 1;
        while (top < botton) {
            for (int col = 0; col < matrix.length; col++) {
                int temp = matrix[top][col];
                matrix[top][col] = matrix[botton][col];
                matrix[botton][col] = temp;
            }
            top++;
            botton--;
        }

        //transpose
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row + 1; col < matrix.length; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
