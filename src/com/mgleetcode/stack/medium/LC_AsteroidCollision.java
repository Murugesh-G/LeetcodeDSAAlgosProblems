package com.mgleetcode.stack.medium;

import java.util.Stack;

/*
TC O(N)
SC O(N)
*/
public class LC_AsteroidCollision {
    public static void main(String[] args) {
        LC_AsteroidCollision obj = new LC_AsteroidCollision();
        int[] asteroids = new int[]{-2, -1, 1, 2};
        int[] res = obj.asteroidCollision(asteroids);
        for (int r : res) {
            System.out.println(r);
        }
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (asteroid > 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && Math.abs(asteroid) > stack.peek())
                    stack.pop();
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                } else if (!stack.isEmpty() && stack.peek() + asteroid == 0) {
                    stack.pop();
                }
            }
        }
        int result[] = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

}
