package com.orkva.leetcode.problems;

import com.orkva.leetcode.common.ListNode;

/**
 * 203. Remove Linked List Elements
 *
 * @date 2019/09/19 16:11
 * @version Easy
 */
public class No203 {

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

    /*
     * 1. 循环判断是否首位出现，是则修改 head 指针
     * 2. 判断修改 head 指针后 head 是否为空
     * 3. 存储 prev 用以删除节点，point 定位当前节点
     * 4. 遍历 point
     */
}
