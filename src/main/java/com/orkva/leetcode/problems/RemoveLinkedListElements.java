package com.orkva.leetcode.problems;

/**
 * 203. Remove Linked List Elements
 *
 * @date 2019/09/19 16:11
 * @version Easy
 */
public class RemoveLinkedListElements {

    /**
     * Remove all elements from a linked list of integers that have value val.
     *
     * Example:
     *
     *   Input:  1->2->6->3->4->5->6, val = 6
     *   Output: 1->2->3->4->5
     */
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode point = head.next;
        while (point != null) {
            if (point.val == val) {
                prev.next = point.next;
            } else {
                prev = prev.next;
            }
            point = point.next;
        }
        return head;
    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    ListNode append(ListNode node) {
        this.next = node;
        return node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(val).append(' ');
        if (next != null) {
            sb.append(next.toString());
        }
        return sb.toString();
    }
}
