package com.mgleetcode.hashtable.medium;

import com.mgleetcode.Main;

import java.util.*;

public class LC380_InsertDeleteGetRandomOOne {
    public static void main(String[] args) {
        Main obj = new Main();
        String str = "/home/";
        System.out.println();
    }
}

class RandomizedSet {
    private List<Integer> list;
    private Map<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);
        int lastEle = list.get(list.size() - 1);

        list.set(index, lastEle);
        map.put(lastEle, index);

        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}
