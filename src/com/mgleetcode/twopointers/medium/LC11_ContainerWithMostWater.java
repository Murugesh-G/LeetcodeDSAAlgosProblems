package com.mgleetcode.twopointers.medium;

import com.mgleetcode.Main;

public class LC11_ContainerWithMostWater {
    public static void main(String[] args) {
        LC11_ContainerWithMostWater obj = new LC11_ContainerWithMostWater();
        int[] height = {0, 10000, 1, 1};
        System.out.println(obj.maxArea(height));
    }

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}
