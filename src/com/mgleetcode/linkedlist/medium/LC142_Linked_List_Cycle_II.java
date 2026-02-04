package com.mgleetcode.linkedlist.medium;

/*
 TC O(N)
 SC O(1)
 */
public class LC142_Linked_List_Cycle_II {
    public static void main(String[] args) {
        LC142_Linked_List_Cycle_II obj = new LC142_Linked_List_Cycle_II();
    }

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (entry != slow) {
                    entry = entry.next;
                    slow = slow.next;
                }
                 return slow;
            }
        }
        return null;
    }
}
