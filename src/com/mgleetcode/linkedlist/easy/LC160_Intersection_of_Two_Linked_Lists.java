package com.mgleetcode.linkedlist.easy;

import com.mgleetcode.Main;

public class LC160_Intersection_of_Two_Linked_Lists {
    public static void main(String[] args) {
        Main obj = new Main();
        String str = "/home/";
        System.out.println(Character.isLetter('$'));
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headB : b.next;
        }
        return a;
    }
}
