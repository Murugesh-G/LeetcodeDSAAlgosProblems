package com.mgleetcode.hashtable.easy;

public class LC706_DesignHashMap {
    public static void main(String[] args) {
        MyHashMap custMap = new MyHashMap();
        custMap.put(1, 10);
        custMap.put(1, 11);
        System.out.println(custMap.get(1));
        custMap.remove(1);
        System.out.println(custMap.get(1));
    }

}

class Node {
    int key, value;
    Node next;

    Node(int k, int v) {
        key = k;
        value = v;
    }
}

class MyHashMap {
    Node[] map;

    public MyHashMap() {
        map = new Node[1000];
        for (int i = 0; i < 1000; i++) {
            map[i] = new Node(-1, -1);
        }
    }

    public void put(int key, int value) {
        int idx = hash(key);
        Node node = map[idx];
        while (node.next != null) {
            if (node.next.key == key) {
                node.next.value = value;
                return;
            }
            node = node.next;
        }
        node.next = new Node(key, value);
    }

    public int get(int key) {
        int idx = hash(key);
        Node node = map[idx];
        while (node.next != null) {
            if (node.next.key == key) {
                return node.next.value;
            }
            node = node.next;
        }
        return -1;
    }

    public void remove(int key) {
        int idx = hash(key);
        Node node = map[idx];
        while (node.next != null) {
            if (node.next.key == key) {
                node.next = node.next.next;
                return;
            }
            node = node.next;
        }
        //return;
    }

    int hash(int key) {
        return key % 1000;
    }
}