package com.mgleetcode.sortingalgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] arr = new int[]{4, 9, 1, 5, 2};
        System.out.println(Arrays.toString(obj.insertionSort(arr)));
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than the key
            // one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key; // Insert the key at the correct position
        }
        return array;
    }
}
