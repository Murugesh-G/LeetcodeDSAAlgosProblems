package com.mgleetcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        String str="/home/";
        System.out.println();

        Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        String s2="...";
        System.out.println(skip.contains(s2));
    }
}
