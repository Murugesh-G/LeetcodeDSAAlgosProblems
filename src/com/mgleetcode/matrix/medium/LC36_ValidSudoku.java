package com.mgleetcode.matrix.medium;

import java.util.HashSet;

public class LC36_ValidSudoku {
    public static void main(String[] args) {
        LC36_ValidSudoku obj = new LC36_ValidSudoku();
        char[][] board = {{'5' , '3' , '3' , '.' , '7' , '.' , '.' , '.' , '.'}
                , {'6' , '.' , '.' , '1' , '9' , '5' , '.' , '.' , '.'}
                , {'.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.'}
                , {'8' , '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3'}
                , {'4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' , '1'}
                , {'7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6'}
                , {'.' , '6' , '.' , '.' , '.' , '.' , '2' , '8' , '.'}
                , {'.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5'}
                , {'.' , '.' , '.' , '.' , '8' , '.' , '.' , '7' , '9'}};
        System.out.println(obj.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] columns = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.')
                    continue;
                char value = board[r][c];
                int boxIndex = (r / 3) * 3 + (c / 3);
                if (rows[r].contains(value) || columns[c].contains(value) || boxes[boxIndex].contains(value))
                    return false;
                rows[r].add(value);
                columns[c].add(value);
                boxes[boxIndex].add(value);
            }
        }
        return true;
    }
}
