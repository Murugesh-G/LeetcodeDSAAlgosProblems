package com.leetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

public class A118_Pascal_Triangle {
    public static void main(String[] args) {
        A118_Pascal_Triangle obj = new A118_Pascal_Triangle();
        System.out.println(obj.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }

        if (numRows == 1) {
            List<Integer> innerResult = new ArrayList<>();
            innerResult.add(1);
            result.add(innerResult);
            return result;
        }

        result = generate(numRows - 1);
        List<Integer> prevRow = result.get(numRows - 2);
        List<Integer> innerResult = new ArrayList<>();
        innerResult.add(1);

        for (int i = 1; i < numRows - 1; i++) {
            innerResult.add(prevRow.get(i - 1) + prevRow.get(i));
        }
        innerResult.add(1);
        result.add(innerResult);

        return result;
    }
}
