package com.mgleetcode.linkedlist.easy;

import com.mgleetcode.Main;

import java.util.Arrays;

public class LC705_Design_HashSet {
    public static void main(String[] args) {
        Main obj = new Main();
        String str = "/home/";
        System.out.println(Character.isLetter('$'));
    }

    class MyHashSet {
        boolean[] map;
        public MyHashSet() {
            map = new boolean[10000001];
            Arrays.fill(map, false);
        }

        public void add(int key) {
            map[key] = true;
        }

        public void remove(int key) {
            map[key] = false;
        }

        public boolean contains(int key) {
            return map[key];
        }
    }
}
