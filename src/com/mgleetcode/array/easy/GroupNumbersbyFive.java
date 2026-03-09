package com.mgleetcode.array.easy;

import java.util.ArrayList;
import java.util.List;

/*
TC O(n)
SC O(n)
*/
public class GroupNumbersbyFive {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int j = 0; j < numbers.size(); j += 5) {
            result.add(numbers.subList(j, j + 5));
        }
        System.out.println(result);
    }
}
