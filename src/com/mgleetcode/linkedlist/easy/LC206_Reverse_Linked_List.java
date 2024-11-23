package com.mgleetcode.linkedlist.easy;

public class LC206_Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode nextNode=null,prevNode=null;
        while(head!=null){
            nextNode=head.next;
            head.next=prevNode;
            prevNode=head;
            head=nextNode;
        }
        return prevNode;
    }
}
