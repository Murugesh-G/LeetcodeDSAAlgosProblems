package com.mgleetcode.linkedlist.medium;

import java.util.LinkedHashMap;
import java.util.Map;

public class LC146_LRU_Cache {

}

class LRUCache {
    LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}