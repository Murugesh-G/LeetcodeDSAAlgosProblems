package com.mgleetcode.linkedlist.medium;

/*
TC O(1)
SC O(1)
*/
public class LC237_Delete_Node_in_a_LinkedList {
    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
