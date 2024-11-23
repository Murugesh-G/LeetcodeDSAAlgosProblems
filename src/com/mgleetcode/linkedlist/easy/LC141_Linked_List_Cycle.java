package com.mgleetcode.linkedlist.easy;

import com.mgleetcode.Main;

public class LC141_Linked_List_Cycle {
    public static void main(String[] args) {
        Main obj = new Main();
        String str = "/home/";
        System.out.println(Character.isLetter('$'));
    }

    public boolean hasCycle(ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;

        while (pointer1 != null && pointer1.next != null) {
            pointer1 = pointer1.next.next;
            pointer2 = pointer2.next;

            if (pointer1 == pointer2) {
                return true;
            }
        }
        return false;
    }
}

