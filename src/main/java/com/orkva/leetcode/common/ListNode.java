package com.orkva.leetcode.common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public ListNode append(ListNode node) {
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
