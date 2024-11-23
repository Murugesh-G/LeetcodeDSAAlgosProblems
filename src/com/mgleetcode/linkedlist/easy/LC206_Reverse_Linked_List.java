package com.mgleetcode.linkedlist.easy;

public class LC206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        while (head != null) {
            ListNode tempNode = head.next;
            head.next = prevNode;
            prevNode = head;
            head = tempNode;
        }
        return prevNode;
    }
}
