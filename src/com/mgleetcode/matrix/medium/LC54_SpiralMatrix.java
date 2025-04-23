package com.mgleetcode.matrix.medium;

import java.util.ArrayList;
import java.util.List;

public class LC54_SpiralMatrix {
    public static void main(String[] args) {
        LC54_SpiralMatrix obj = new LC54_SpiralMatrix();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(obj.spiralOrder(arr));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length, x = 0, y = 0, dx = 1, dy = 0;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < rows * cols; i++) {
            res.add(matrix[y][x]);
            matrix[y][x] = -101;
            if (!(0 <= x + dx && x + dx < cols && 0 <= y + dy && y + dy < rows)
                    || matrix[y + dy][x + dx] == -101) {
                int temp = dx;
                dx = -dy;
                dy = temp;
            }
            x += dx;
            y += dy;
        }
        return res;
    }
}
