/*
package com.mgleetcode.linkedlist;

public class LinkedList {
    void printList(Node head)
    {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    int lengthofLL(Node head)
    {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public int countNodes(Node head) {
        int count = 0;
        Node current = head;

        // Traverse the list and count the nodes
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    boolean searchinLL(Node head, int key)
    {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    int KthNode(Node head, int K) {
        Node current = head;
        int count = 1;

        while (current != null) {
            if (count == K) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return -1;
    }

    int KthNodefromEnd(Node head, int K)
    {
        Node firstPointer = head;
        Node secondPointer = head;

        for (int i = 0; i < K; i++) {
            if (firstPointer == null) {
                return -1;
            }
            firstPointer = firstPointer.next;
        }

        while (firstPointer != null) {
            firstPointer = firstPointer.next;
            secondPointer = secondPointer.next;
        }

        if (secondPointer != null) {
            return  secondPointer.data;
        }
    }
}
*/
