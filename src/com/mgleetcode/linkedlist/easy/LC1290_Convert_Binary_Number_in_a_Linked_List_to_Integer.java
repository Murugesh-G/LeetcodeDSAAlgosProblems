package com.mgleetcode.linkedlist.easy;

import com.mgleetcode.Main;

public class LC1290_Convert_Binary_Number_in_a_Linked_List_to_Integer {
    public static void main(String[] args) {
        LC1290_Convert_Binary_Number_in_a_Linked_List_to_Integer obj = new LC1290_Convert_Binary_Number_in_a_Linked_List_to_Integer();
        String str = "/home/";
        System.out.println(Character.isLetter('$'));
    }

    public int getDecimalValue(ListNode head) {
        int ans = 0;
        for (ListNode temp = head; temp != null; temp = temp.next) {
            ans = (ans << 1) + temp.val;
        }
        return ans;
    }
}
