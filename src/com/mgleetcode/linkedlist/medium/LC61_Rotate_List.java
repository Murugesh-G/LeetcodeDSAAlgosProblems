package com.mgleetcode.linkedlist.medium;

/*
TC O(N)
SC O(1)
*/
public class LC61_Rotate_List {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode curr = head;
        int size = 0;
        while (curr.next != null) {
            size++;
            curr = curr.next;
        }
        size += 1;
        curr.next = head;
        k = k % size;
        curr = head;
        for (int i = 1; i < size - k; i++) {
            curr = curr.next;
        }

        ListNode newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}
