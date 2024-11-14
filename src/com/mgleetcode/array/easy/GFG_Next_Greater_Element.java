package com.mgleetcode.array.easy;

import java.util.Stack;
import java.util.Arrays;

public class GFG_Next_Greater_Element {
    public static void main(String[] args) {
        GFG_Next_Greater_Element obj = new GFG_Next_Greater_Element();
        int[] arr = new int[]{1, 3, 2, 4};

        System.out.println(Arrays.toString(obj.nextLargerElement(arr)));
    }
    public int[] nextLargerElement(int[] arr) {
        /*
        Approach 1:
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {  // O(N)
            int resEle = 0;
            for (int j = i + 1; j < arr.length; j++) { // O(N-1)
                if (arr[i] < arr[j]) {
                    resEle = arr[j];
                    break;
                }
            }
            if (resEle == 0) {
                resEle = -1;
            }
            res.add(resEle);
        }
        return res;
        TC:O(N2)
       */

        /* Approach : using Stack
        TC:O(N)
        SC:O(N)
        */
        int[] res=new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < arr[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }
        return res;
    }
}
