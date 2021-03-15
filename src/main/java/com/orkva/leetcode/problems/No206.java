package com.orkva.leetcode.problems;

import com.orkva.leetcode.common.ListNode;

/**
 * 206. Reverse Linked List
 */
public class No206 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

}
